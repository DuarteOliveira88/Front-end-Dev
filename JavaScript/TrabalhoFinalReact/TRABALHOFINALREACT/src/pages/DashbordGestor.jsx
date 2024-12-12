import { useState } from "react"
import { useNavigate } from "react-router-dom"

export default function DashbordGestor(){
    const navigate = useNavigate()
    function handleSubmit(event) {
        event.preventDefault()
        const formData= new FormData(event.target)
        const data = Object.fromEntries(formData.entries())
        if(data.password != data.confirmPassword){
            setPasswordAreNotEqual(true)
            return
        }
        const prato={
            id:data.id,
            nomePrato: data.nomePrato,
            tipo: data.tipo,
            image:{
                src:"",
                alt:data.alt
            },
            preco: data.preco,
            status:""
        }
        const response = fetch("http://localhost:3000/pratos", {
            method:"POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(prato)
        })
 
        navigate("/",{
            state:{message: "Prato adicionado com sucesso"}
        })
    }
   
   
    return (
      <form onSubmit={handleSubmit}>
        <h2 className="form-header">Adicionar Novo Prato</h2>
 
        <div className="control">
          <label htmlFor="id">id</label>
          <input id="text" type="id" name="id" required/>
        </div>
 
        <div className="control">
          <label htmlFor="nomePrato">Nome do prato</label>
          <input id="text" type="nomePrato" name="nomePrato" required/>
        </div>
 
        
 
        <div className="control-row">
          <div className="control">
            <label htmlFor="alt">alt para a imagem</label>
            <input type="text" id="alt" name="alt" required/>
          </div>
 
          <div className="control">
            <label htmlFor="preco">Preco do prato</label>
            <input type="text" id="preco" name="preco" required/>
          </div>
        </div>
 
        <div className="control">
          <label htmlFor="phone">tipo de prato</label>
          <select id="tipo" name="tipo" required>
            <option value="prato principal">prato principal</option>
            <option value="sobremesa">sobremesa</option>
            <option value="entrada">entrada</option>
          </select>
        </div>
        
        <p className="form-actions">
          <button type="submit" className="button">
            Adicionar prato
          </button>
        </p>
      </form>
    );
}