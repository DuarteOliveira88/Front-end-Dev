import { useState } from "react"

export default function Discount(){
    const [preco,setPreco]=useState(100)
    function aplica(){
        if(preco=="$100"){
            setPreco(75)
        }else{
            setPreco(100)
        }
    }
    function aplica2(){
        setPreco(preco*0.75)
    }
    return (
        <div>
            <p data-testid="price">${preco}</p>
            <button onClick={aplica2}>Apply Discount</button>
        </div>
    )
}  