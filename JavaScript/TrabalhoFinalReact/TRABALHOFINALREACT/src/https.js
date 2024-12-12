import { useEffect, useState } from "react";
 
export function getData() {
    const[availablePratos, setAvailablePratos] = useState([]);
    useEffect(() =>
        {
          fetch('http://localhost:3000/pratos')
          .then((response) => { return response.json()})
          .then((resData) => {  
           console.log(resData)
          setAvailablePratos(resData.pratos);
          });
        },
        []);
        return availablePratos;
}
export async function updatePratos(userPratos) {
    console.log(userPratos)
    const responde= await fetch("http://localhost:3000/pratosConsumidor",{
        method:"PUT",
        body: JSON.stringify({pratos: userPratos}),
        headers: {
            "Content-Type": "application/json",
        },
    })
    const data = await responde.json();
    if(!response.ok){
        console.log("Failed");
    }
    return data.message;
}
export async function pagamentoPratos(pratos) {
    try {
      const response = await fetch("http://localhost:3000/pratosConsumidor", {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ pratos }), // Envia o array de pratos
      });
  
      if (!response.ok) {
        throw new Error("Erro ao atualizar os pratos.");
      }
  
      const data = await response.json();
      return data;
    } catch (error) {
      console.error("Erro na atualização dos pratos:", error);
      throw error; // Relança o erro para permitir tratamento posterior
    }
  }