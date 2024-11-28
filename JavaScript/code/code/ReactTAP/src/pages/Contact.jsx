import CONTACT from "../data/contactos"
export default function Contact(){
    return (
        <div>
            <h1>Contactos</h1>
            <br />  
        <h3>{CONTACT.nome}</h3>
        <h3>{CONTACT.profissao}</h3>
        <h3>{CONTACT.email}</h3>
        </div>
    )
}