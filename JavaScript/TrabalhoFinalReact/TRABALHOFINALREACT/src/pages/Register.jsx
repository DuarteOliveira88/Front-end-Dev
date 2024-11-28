import "../style/loginForm.css"
import { useState } from "react"
import { useNavigate } from "react-router-dom"
 
export default function Signup() {
    const [passwordAreNotEqual, setPasswordAreNotEqual] = useState(false)
    const navigate = useNavigate()
    const logado=localStorage.getItem("role");
    console.log("", logado)
    function handleSubmit(event) {
        event.preventDefault()
        const formData= new FormData(event.target)
        const data = Object.fromEntries(formData.entries())
        if(data.password != data.confirmPassword){
            setPasswordAreNotEqual(true)
            return
        }
        const user={
            email:data.email,
            passowrd: data.passowrd,
            firstName: data["first-name"],
            lastName: data["last-name"],
            role: data.role,
            termsAccepted: data.terms === "on"
        }
        const response = fetch("http://localhost:3000/signup", {
            method:"POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(data)
        })
 
        navigate("/",{
            state:{message: "Utilizador registado com sucesso"}
        })
    }
   
   
    return (
      <form onSubmit={handleSubmit}>
        <h2>Welcome on board!</h2>
        <p>We just need a little bit of data from you to get you started 🚀</p>
 
        <div className="control">
          <label htmlFor="email">Email</label>
          <input id="email" type="email" name="email" required/>
        </div>
 
        <div className="control-row">
          <div className="control">
            <label htmlFor="password">Password</label>
            <input id="password" type="password" name="password" required/>
          </div>
 
          <div className="control">
            <label htmlFor="confirm-password">Confirm Password</label>
            <input required
              id="confirm-password"
              type="password"
              name="confirmPassword"
            />
            {passwordAreNotEqual &&
            <div>Password tem que ser igual</div>}
 
          </div>
        </div>
 
        <hr />
 
        <div className="control-row">
          <div className="control">
            <label htmlFor="first-name">First Name</label>
            <input type="text" id="first-name" name="first-name" required/>
          </div>
 
          <div className="control">
            <label htmlFor="last-name">Last Name</label>
            <input type="text" id="last-name" name="last-name" required/>
          </div>
        </div>
 
        <div className="control">
          <label htmlFor="phone">What best describes your role?</label>
          <select id="role" name="role" required>
            <option value="Cliente">Cliente</option>
            {(logado=="Cozinheiro" || logado=="Gestor") && <option value="Cozinheiro">Cozinheiro</option>}
            {logado=="Gestor " &&<option value="Gestor">Gestor</option>}
          </select>
        </div>
        <div className="control">
          <label htmlFor="terms-and-conditions">
            <input type="checkbox" id="terms-and-conditions" name="terms" required/>Eu concordo com o termo e condiçoes
          </label>
        </div>
 
        <p className="form-actions">
          <button type="submit" className="button">
            Sign up
          </button>
        </p>
      </form>
    );
  }