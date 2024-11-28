import { useEffect, useState } from "react";

export function getData() {
    const[availablePlaces, setAvailablePlaces] = useState([]);
    useEffect(() =>
        {
          fetch('http://localhost:3000/places')
          .then((response) => { return response.json()})
          .then((resData) => {  
           console.log(resData)
          setAvailablePlaces(resData.places);
          });
        },
        []);
        return availablePlaces;
}
export async function updatePlaces(userPlaces) {
    console.log(userPlaces)
    const responde= await fetch("http://localhost:3000/user-places",{
        method:"PUT",
        body: JSON.stringify({places: userPlaces}),
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
export function getPresent() {
    const[availablePresents, setAvailablePresents] = useState([]);
    useEffect(() =>
        {
          fetch('http://localhost:3000/listaPrendas')
          .then((response) => { return response.json()})
          .then((resData) => {  
           console.log(resData)
           setAvailablePresents(resData.present);
          });
        },
        []);
        return availablePresents;
}