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

const Router=createBrowserRouter([{
  path:"/",
  element: <RootLayout/>, 
  errorElement: <ErrorPage/>,
    children:[
      {path:"/", element: <Homepage/>},
      {path:"/encomenda", element: <EncomendaConsumidor/>},
      {path:"/gestor",element:<DashbordGestor/>}
    ]

  }])
function App() {
  return <RouterProvider router={Router}/>
}

export default App
