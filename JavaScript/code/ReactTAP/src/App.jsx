import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import './components/Cartoes.css'
import Header from './components/Header'
import MainGoal from './components/MainGoal'
import Cartoes from './components/Cartoes'
import frases from './data/frases'
import { userData, userData2 } from './data/cartoes'
import Titulo from './components/Titulo'
import TabButton from './components/TabButton'
// import Login from "./components/login"
import Delete from "./components/delete"
import Stats from "./components/stats"
import Discount from './components/Discount'
import { EXAMPLES, CORE_CONCEPTS } from './data/data'
import ComponentsCard from './components/ComponentsCard'
import listaCompras from './data/compras'
import ListaCompra from './components/ListaCompra'
import HomePage from './pages/HomePage'
import { createBrowserRouter, RouterProvider } from "react-router-dom"
import IndexShoppingList from './pages/IndexShoppingList'
import Contact from './pages/Contact'
import RaizLayout from './components/RaizLayout'
import ErrorPage from './pages/Error'
import ChristmasGifts from './pages/ChristmasGifts'
import AvailablePlaces from "./AvailablePlaces/AvailablePlaces"
import PlanetasStarWars from './pages/PlanetasStarWars'
import FilmesStarWars from './pages/FilmesStarWars'
import Login from './pages/auth/Login'
import Register from "./pages/auth/Register"

let index = 0;
const ROUTER = createBrowserRouter([{path:"/",element: <RaizLayout/>, errorElement: <ErrorPage/> ,
  children:[{path:"/",element:<HomePage/>},
    {path:"/shopping-list", element:<IndexShoppingList/>},
    {path:"/contact",element:<Contact/>},
    {path:"/christmas-gitf",element: <ChristmasGifts/>},
    {path:"/places",element:<AvailablePlaces/>},
    {path:"/planetas",element:<PlanetasStarWars/>},
    {path:"/filmes",element:<FilmesStarWars/>},
    {path:"/login",element:<Login/>},
    {path:"/register",element:<Register/>}
    ]},
    // {path:"/places",element:<AvailablePlaces/>}
])  
function App() {
  
  return <RouterProvider router={ROUTER}/>



  const [content, setContent] = useState();
  function handleSelected(selectedButton) {
    // let botao=document.getElementById("contDina")
    // botao.innerHTML=selectedButton
    setContent(EXAMPLES[selectedButton]);

  }
  return (
    <>
      <div>
        <Header />
        <div className='container'>
          {CORE_CONCEPTS.map((item) => <ComponentsCard key={item.title} title={item.title} description={item.description} 
          image={item.image} />)}
        </div>
        <div >
          <h2>Lista de compras</h2>
          {listaCompras.map((item) => <ListaCompra key={item.produto} produto={item.produto} quantidade={item.quantidade} />)}
        </div>
        <br />
        <br />
        <MainGoal frase={frases[0]} />
        <MainGoal frase={frases[1]} />
        <MainGoal frase={frases[2]} />
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
      </div>
      <Titulo Titulo={"Front End DEV:"} disciplina={"React"} />
      <div className='card-container'>
        {/* <Cartoes name={userData.user1.firstName}surname={userData.user1.lastName}job={userData.user1.title}/>
        <Cartoes
          name={userData.user2.firstName}
          surname={userData.user2.lastName}
          job={userData.user2.title}
        />
        <Cartoes
          name={userData.user3.firstName}
          surname={userData.user3.lastName}
          job={userData.user3.title}
        /> */}
        {userData2.map((item) => <Cartoes key={index++} name={item.firstName} surname={item.lastName} job={item.title} />)}
      </div>

      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
      <TabButton isActive={content == EXAMPLES.jsx} onSelect={() => handleSelected("jsx")}>JSX</TabButton>
      <TabButton isActive={content == EXAMPLES.props} onSelect={() => handleSelected("props")}>Props</TabButton>
      <TabButton isActive={content == EXAMPLES.state} onSelect={() => handleSelected("state")}>State</TabButton>
      {/* div de cont dinamico */}
      {!content ? (<p>Selecione um topico</p>) : (
        <div id='tab-content'>
          <h2>{content.title}</h2>
          <p>{content.description}</p>
          <pre>
            <code>{content.code}</code>
          </pre>
        </div>)
      }
      {/* .div de cont dinamico */}
      <Stats />
      <Discount />
      <Delete />
    </>

  )
}

export default App
