import { useState,useCallback,useRef } from "react";
import Pratos from "../components/Pratos";
import Modal from "../components/Modal";
import DeleteConfirmation from "../components/DeleteConfirmation";
import { getData,updatePratos } from "../https";

export default function EncomendaConsumidor() {
    const selectedPrato = useRef(null);
    const [userPrato, setuserPrato] = useState([]);
    const [modalIsOpen, setModalIsOpen] = useState(false);
    const availablePratos = getData();
   //meter aqui
   
      function handleStartRemovePrato(prato) {
        setModalIsOpen(true);
        selectedPrato.current = prato;
      }
   
      function handleStopRemovePrato() {
        setModalIsOpen(false);
      }
      
   
     
      function handleSelectPrato(selectedPrato) {
        //meter aqui
        setuserPrato((prevPickedPratos) => {
          if (!prevPickedPratos) {
            prevPickedPratos = [];
          }
          if (prevPickedPratos.some((prato) => prato.id === selectedPrato.id)) {
            return prevPickedPratos;
          }
          return [selectedPrato, ...prevPickedPratos];
        });
        updatePratos([selectedPrato, ...userPrato]);
      }
   
      const handleRemovePrato = useCallback(async function handleRemovePrato() {
        setuserPrato((prevPickedPratos) =>
          prevPickedPratos.filter((prato) => prato.id !== selectedPrato.current.id)
   
        );
        updatePratos(
          userPrato.filter((prato)=> prato.id != selectedPrato.current.id)
        )
        setModalIsOpen(false);
      }, [userPrato]);
   
    return (
      <>
       <Modal open={modalIsOpen} onClose={handleStopRemovePrato}>
          <DeleteConfirmation
            onCancel={handleStopRemovePrato}
            onConfirm={handleRemovePrato}
          />
        </Modal>
      <div>
        {/* <img src={globeImg} alt="Stylized globe" /> */}{/* Posso meter o logo do restaurante*/ }
        <h1>Faça a sua encomenda</h1>
        <h3>
          Crie a sua refeição perfeita
        </h3>
      </div>
      <main>
        <Pratos
            title="Minha encomenda:"
        fallbackText="Sem pratos registrados."
            pratos={userPrato}
            onSelectPrato={handleStartRemovePrato}
          />
   
   
        <Pratos
          title="Pratos disponiveis:"
          fallbackText="Selecione os pratos para a sua encomenda."
          pratos={availablePratos}
          onSelectPrato={handleSelectPrato}
        />
   
   
      </main>
    </>
    );
  }