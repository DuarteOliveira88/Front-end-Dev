import { useLocation } from "react-router-dom"

export default function Homepage(){
    console.log(localStorage.getItem("token"))
    const location=useLocation()
    const message=location.state?.message;
    return (
        <div>
            <h1>Estou em casa</h1>
            {message && <div>{message}</div>}
        </div>
    )
}