import { Outlet, Navigate } from "react-router-dom";
import React from "react";


export default function ProtectedRoute(){
    const userRole=localStorage.getItem("role");
    if(userRole !== "student"){
        return <Navigate to="/login" replace/>
    }
    return <Outlet/>
}