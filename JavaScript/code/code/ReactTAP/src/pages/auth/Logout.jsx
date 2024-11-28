import { useEffect } from "react";
import { useNavigate } from "react-router-dom";


export default function Logout(){
    const navigate= useNavigate();
    localStorage.clear();
    useEffect(()=>{
        localStorage.clear();
        navigate("/",{
            state: {message: "LogOut sucefully"}
        });
    },[navigate])
    return (
        <div>
            loggin out
        </div>
    )
}