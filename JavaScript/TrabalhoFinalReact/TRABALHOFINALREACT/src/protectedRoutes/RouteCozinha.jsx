import { Outlet,Navigate } from "react-router-dom"
import React from "react"

export default function RouteCozinha(){
    const userRole=localStorage.getItem("role")
    if(userRole==="Gestor" || userRole==="Cozinheiro"){
        return <Outlet/>
    }
    return <Navigate to="/login" replace/>
}