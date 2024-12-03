import { useState } from 'react'
import { LISTAPRENDAS } from '../data/listChristmasGifts';
import TabButton from '../components/TabButton';
import LinhaListaNatal from '../components/LinhaListaNatal';
import { getPresent } from '../https';
import { useNavigate } from "react-router-dom"


export default function ChristmasGifts() {
    const availablePresents=getPresent();
    const navigate=useNavigate()
    console.log(availablePresents)
    const [content, setContent] = useState();
    function handleSelected2(selectedButton) {
        setContent(selectedButton);
<<<<<<< HEAD
=======
    }
    function handleSubmitPrendas(event) {
        event.preventDefault()
        const formData= new FormData(event.target)
        const data = Object.fromEntries(formData.entries())
        if(!(parseInt(data.preco)>5)){
            alert(`O ${data.preco} e menor que 5€.`)
            return
        }
        const present={
            daPresente:data["daPresente"],
            remetente: data["remetente"],
            presente: data["presente"],
            preco: data["preco"]
        }
        const response = fetch("http://localhost:3000/listaPrendas", {
            method:"POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(present)
        })

        navigate("/",{
            state:{message: "Prenda registered!"}
        })
>>>>>>> f4010d60db69576ec9c16af350efa9f575629691
    }
    return (
        <div>
            {/* 
            <h1>Lista de Presentes</h1>
<<<<<<< HEAD
            <TabButton isActive={content == DUARTE} onSelect={() => handleSelected2("DUARTE")}>Duarte</TabButton>
            <TabButton isActive={content == MAE} onSelect={() => handleSelected2("MAE")}>Mae</TabButton>
            <TabButton isActive={content == PAI} onSelect={() => handleSelected2("PAI")}>Pai</TabButton>
=======
            <TabButton isActive={content == "DUARTE"} onSelect={() => handleSelected2("DUARTE")}>Duarte</TabButton>
            <TabButton isActive={content == "MAE"} onSelect={() => handleSelected2("MAE")}>Mae</TabButton>
            <TabButton isActive={content == "PAI"} onSelect={() => handleSelected2("PAI")}>Pai</TabButton>
>>>>>>> f4010d60db69576ec9c16af350efa9f575629691
            {/* div de cont dinamico */}
            {/* 
            {!LISTAPRENDAS[content] ? (<p>Selecione uma lista</p>) : LISTAPRENDAS[content].length ? (
                <div>
<<<<<<< HEAD
                    {LISTAPRENDAS[content].map((item) => (<LinhaListaNatal key={item.remetente} {...item}/>))}
=======
                    {LISTAPRENDAS[content].map((item) => (<LinhaListaNatal key={item.remetente} {...item} />))}
>>>>>>> f4010d60db69576ec9c16af350efa9f575629691
                </div>)
                : (<h4>Nao tem presentes</h4>)}
            {/* .div de cont dinamico */}
            <h1>Lista de Presentes</h1>
            <TabButton isActive={content == "DUARTE"} onSelect={() => handleSelected2("DUARTE")}>Duarte</TabButton>
            <TabButton isActive={content == "MAE"} onSelect={() => handleSelected2("MAE")}>Mae</TabButton>
            <TabButton isActive={content == "PAI"} onSelect={() => handleSelected2("PAI")}>Pai</TabButton>
            {/* div de cont dinamico */}
            {!availablePresents? (<p>Selecione uma lista</p>) : (
                <div>
                    {availablePresents.filter((item)=> item.daPresente==content).map(((item) => (<LinhaListaNatal key={item.remetente} {...item} />)))}
                </div>)
                }
            {/* .div de cont dinamico */}
            <form onSubmit={handleSubmitPrendas}>
            <div className="control-row">
            <label htmlFor="daPresente" >Quem comprou o presente?</label>
                <select id="daPresente" name="daPresente" required>
                    <option value="DUARTE">Duarte</option>
                    <option value="MAE">Mae</option>
                    <option value="PAI">Pai</option>
                </select>
                <div className="control">
                    <label htmlFor="remetente">Remetente</label>
                    <input type="text" id="remetente" name="remetente" required />
                </div>
                <div className="control">
                    <label htmlFor="presente">Presente</label>
                    <input type="text" id="presente" name="presente" required />
                </div>

                <div className="control">
                    <label htmlFor="preco">Preco</label>
                    <input type="text" id="preco" name="preco" required />
                </div>
                <p >
          <button type="submit" className="button">
            enter
          </button>
        </p>
            </div>
            </form>
        </div>
    )
}