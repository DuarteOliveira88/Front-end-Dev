import {Outlet, useRouteLoaderData} from "react-router-dom"
import { Link } from "react-router-dom"
export default function RootLayout(){
    const loader = useRouteLoaderData("root");
    const role=localStorage.getItem("role")
    return (
        <>
        <h1>As minhas funcionalidades</h1>
        <p><Link to="/">Home</Link></p>
        <p><Link to="/encomenda">Faz a tua encomenda</Link></p>
        {(role==="Cozinheiro" ||role==="Gestor" ) &&<p><Link to="/cozinha">Cozinha</Link></p>}
        {role==="Gestor" &&<p><Link to="/gestor">Pagina Gestor</Link></p>}
        <p><Link to="/register">Registar</Link></p>
        {!loader.login &&<p><Link to="/login">Logar</Link></p>}
        {loader.login &&<p><Link to="/logout">Deslogar</Link></p>}
        <Outlet/>
        </>
    )
}