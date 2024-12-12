import { useLocation } from "react-router-dom"

export default function Homepage(){
    console.log(localStorage.getItem("token"))
    const location=useLocation()
    const message=location.state?.message;
    return (
        <div>
            <h1>Bem vindo a El Celler de Can Roca</h1>
            {message && <div>{message}</div>}
        </div>
    )
}