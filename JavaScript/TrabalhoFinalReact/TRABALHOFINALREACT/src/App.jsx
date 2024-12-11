import { Children, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import RootLayout from './components/RootLayout'
import ErrorPage from './pages/ErrorPage'
import EncomendaConsumidor from './pages/EncomendaConsumidor'
import Homepage from './pages/Homepage'
import DashbordGestor from './pages/DashbordGestor'
import Cozinha from './pages/Cozinha'
import Register from "./pages/Register"
import Login from "./pages/Login"
import Logout from './pages/Logout'
import Pagamento from './pages/Pagamento'
import RouteCozinha from './protectedRoutes/RouteCozinha'
import RouteGestor from './protectedRoutes/RouteGestor'
import RoutePagamento from './protectedRoutes/RoutePagamento'
import RouteComsumidor from './protectedRoutes/RouteConsumidor'

const Router=createBrowserRouter([{path:"/",element: <RootLayout/>, errorElement: <ErrorPage/>,id:"root",loader:()=>{
  return {login: localStorage.getItem("token") ? true:false}
},
    children:[
      {path:"/", element: <Homepage/>},
      {path:"/encomenda", element: <RouteComsumidor/>, children:[{path:"",element:<EncomendaConsumidor/>}]},
      {path:"/cozinha",element:<RouteCozinha/>, children: [{path:"",element:<Cozinha/>}]},
      {path:"/gestor",element:<RouteGestor/>, children: [{path:"",element:<DashbordGestor/>}]},
      {path:"/register",element:<Register/>},
      {path:"/login",element:<Login/>},
      {path:"/logout",element:<Logout/>},
      {path:"/pagamento",element:<RoutePagamento/>, children: [{path:"",element:<Pagamento/>}]}
    ]

  }])
function App() {
  return <RouterProvider router={Router}/>
}

export default App
