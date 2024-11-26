import {Outlet, useRouteLoaderData} from "react-router-dom"
import { Link } from "react-router-dom"
export default function RootLayout(){
    return (
        <>
        <h1>As minhas funcionalidades</h1>
        <p><Link to="/">Home</Link></p>
        <p><Link to="/encomenda">Faz a tua encomenda</Link></p>
        <p><Link to="/gestor">Pagina Gestor</Link></p>
        <Outlet/>
        </>
    )
}