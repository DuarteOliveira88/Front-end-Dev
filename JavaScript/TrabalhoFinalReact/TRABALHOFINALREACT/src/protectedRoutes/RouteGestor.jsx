import { Outlet,Navigate } from "react-router-dom"
import React from "react"

export default function RouteGestor(){
    const userRole=localStorage.getItem("role")
    if(userRole!=="Gestor"){
        return <Navigate to="/login" replace/>
    }
    return <Outlet/>
}