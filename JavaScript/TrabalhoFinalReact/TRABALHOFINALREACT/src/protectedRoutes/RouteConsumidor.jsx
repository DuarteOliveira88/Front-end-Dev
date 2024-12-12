import { Outlet,Navigate } from "react-router-dom"
import React from "react"

export default function RouteComsumidor(){
    const userRole=localStorage.getItem("role")
    if(userRole==="Cliente"){
        return <Outlet/>
    }
    return <Navigate to="/login" replace/>
}