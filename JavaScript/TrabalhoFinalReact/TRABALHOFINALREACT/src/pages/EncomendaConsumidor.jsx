import { useState, useRef } from "react";
import Pratos from "../components/Pratos";
import Modal from "../components/Modal";
import DeleteConfirmation from "../components/DeleteConfirmation";
import { getData, pagamentoPratos } from "../https";
import { useNavigate } from "react-router-dom";
import "./EncomendaConsumidor.css"; // Importando o CSS

export default function EncomendaConsumidor() {
  const selectedPrato = useRef(null);
  const [userPrato, setUserPrato] = useState([]);
  const [modalIsOpen, setModalIsOpen] = useState(false);
  const availablePratos = getData(); // Obtém os pratos disponíveis
  const navigate = useNavigate(); // Hook para navegação

  function handleSelectPrato(selectedPrato) {
    setUserPrato((prevPickedPratos) => {
      if (!prevPickedPratos) {
        prevPickedPratos = [];
      }
      if (prevPickedPratos.some((prato) => prato.id === selectedPrato.id)) {
        return prevPickedPratos;
      }
      return [selectedPrato, ...prevPickedPratos];
    });
  }

  function handleStartRemovePrato(prato) {
    setModalIsOpen(true);
    selectedPrato.current = prato;
  }

  function handleStopRemovePrato() {
    setModalIsOpen(false);
  }

  async function handleRemovePrato() {
    setUserPrato((prevPickedPratos) =>
      prevPickedPratos.filter((prato) => prato.id !== selectedPrato.current.id)
    );
    setModalIsOpen(false);
  }

  async function handlePagamento() {
    try {
      await pagamentoPratos(userPrato);
      navigate("/pagamento", { state: { pratos: userPrato } });
    } catch (error) {
      console.error("Erro ao processar pagamento:", error);
    }
  }

  return (
    <div className="encomenda-container">
      <Modal open={modalIsOpen} onClose={handleStopRemovePrato}>
        <DeleteConfirmation
          onCancel={handleStopRemovePrato}
          onConfirm={handleRemovePrato}
        />
      </Modal>

      <header className="encomenda-header">
        <h1>Faça a sua encomenda</h1>
        <h3>Crie a sua refeição perfeita</h3>
      </header>

      <main className="encomenda-main">
        <Pratos
          title="Minha encomenda:"
          fallbackText="Sem pratos registrados."
          pratos={userPrato}
          onSelectPrato={handleStartRemovePrato}
        />
        <button className="btn-pagamento" onClick={handlePagamento}>
          Ir para Pagamento
        </button>
        <Pratos
          title="Pratos disponíveis:"
          fallbackText="Selecione os pratos para a sua encomenda."
          pratos={availablePratos}
          onSelectPrato={handleSelectPrato}
        />
      </main>
    </div>
  );
}
