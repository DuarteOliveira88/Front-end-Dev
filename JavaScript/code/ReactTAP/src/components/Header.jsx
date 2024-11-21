import reactLogo from "../assets/react.svg"

const moduleDescriptions = ["Aprendendo React", "Aprendendo JS", "Aprendendo SQL"]
const content = moduleDescriptions[genRandomInt(2)];

function genRandomInt(max) {
    return Math.floor(Math.random() * (max + 1))
}

export default function Header  () {

    // const myHeader=(<header>
    //   <img src="src/assets/react.svg" alt="imagemAleatioria" />
    // <h4>Aprendendo React!!!!!!</h4>
    // </header>)
    //     return myHeader;
  
    return (
      <header>
        <div>
          <a href="https://www.youtube.com/" target='_blank'>
            <img src={reactLogo} className="logo " alt="React logo" />
          </a>
          <h4>{content}</h4>
        </div>
      </header>
    )
  }