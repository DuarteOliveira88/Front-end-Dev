import React from 'react';
import { Link, useRouteLoaderData } from 'react-router-dom';
import './Navbar.css'; // Importe o arquivo CSS

export default function Navbar() {
    const loader = useRouteLoaderData("root");
    const role = localStorage.getItem("role");

    return (
        <nav className="navbar">
            <div className="logo-container">
                <img src="src/assets/logo-solo.png" alt="Logo" className="logo" />
            </div>
            <ul className="nav-list">
                <li className="nav-item">
                    <Link to="/" className="nav-link">Home</Link>
                </li>
                <li className="nav-item">
                    <Link to="/encomenda" className="nav-link">Faz a tua encomenda</Link>
                </li>
                {(role === "Cozinheiro" || role === "Gestor") && (
                    <li className="nav-item">
                        <Link to="/cozinha" className="nav-link">Cozinha</Link>
                    </li>
                )}
                {role === "Gestor" && (
                    <li className="nav-item">
                        <Link to="/gestor" className="nav-link">Página Gestor</Link>
                    </li>
                )}
                <li className="nav-item">
                    <Link to="/register" className="nav-link">Registar</Link>
                </li>
                {!loader.login ? (
                    <li className="nav-item">
                        <Link to="/login" className="nav-link">Logar</Link>
                    </li>
                ) : (
                    <li className="nav-item">
                        <Link to="/logout" className="nav-link">Deslogar</Link>
                    </li>
                )}
            </ul>
        </nav>
    );
}
