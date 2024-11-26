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