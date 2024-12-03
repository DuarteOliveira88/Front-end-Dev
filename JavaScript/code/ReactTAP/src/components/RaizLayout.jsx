import { Outlet } from "react-router-dom";
import { Link } from "react-router-dom";
export default function RaizLayout(){
    return (
        <>
        <h1>As Minhas Funcionalidades</h1>
        <p><Link to="/">Home</Link></p>
         <p><Link to="/shopping-list">Lista de compras</Link></p>
         <p><Link to="/contact">Contactos</Link></p>
         <p><Link to="/christmas-gitf">Lista de presentes de Natal</Link></p>
         <p><Link to="/places">placesssssssssss</Link></p>
         <p><Link to="/planetas">Planetas Star wars</Link></p>
         <p><Link to="/filmes">Filmes Star wars</Link></p>
         <p><Link to="/login">Login</Link></p>
         <p><Link to="/register">Registar</Link></p>
        <Outlet/>
        </>
    )
}