import { Outlet,Navigate } from "react-router-dom"
import React from "react"

export default function RoutePagamento(){
    const userRole=localStorage.getItem("role")
    if(!userRole){
        return <Navigate to="/login" replace/>
    }
    return <Outlet/>
}