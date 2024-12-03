import { useState } from "react";

export default function Delete() {
  const[botao,setBotao]=useState(false);
  const[proceed,setProceed]=useState(true);
  function certeza() {
    setBotao(true);
  }
  function comfirmado(){
    setProceed(false);
    setBotao(false);
  }
    return (
      
      <div>
        {botao &&(
        <div data-testid="alert" id="alert">
          <h2>Are you sure?</h2>
          <p>These changes can't be reverted!</p>
          <button onClick={comfirmado}>Proceed</button>
        </div>)}
        {proceed && (
        <button onClick={()=>setBotao(true)}>Delete</button>)}
      </div>    
    );
}