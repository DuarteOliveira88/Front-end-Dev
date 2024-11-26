import { useNavigate } from "react-router-dom";
import "./auth.css"
import { useState } from "react";

export default function Login() {
  const navigate= useNavigate();
  const [enterdValue, setEnteredValue] = useState({
    email: "",
    password: "",
  })
  function handleSubmit(event) {
    event.preventDefault();
    console.log(enterdValue);
    const authData = enterdValue;

    const response = fetch('http://localhost:3000/login', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(authData),
    })
      .then((response) => {
        if (response.ok) {
          console.log('Response is OK:', response.ok);
          return response.json();
        } else {
          console.error('Response is not OK', response.status, response.statusText);
          throw new Error('Failed to authenticate');
        }
      })
      .then((data) => {
        console.log(data);
        localStorage.setItem("token", data.token);
        localStorage.setItem("role", data.role);
        navigate("/")
        navigate("/",{
          state:{message: "Login correto"}
        });        
      });
      
  }

  function handleInputChange(identifier, value) {
    setEnteredValue((prevValues) => ({
      ...prevValues,
      [identifier]: value,
    }))
  }

  return (
    <form onSubmit={handleSubmit}>
      <h2>Login</h2>

      <div className="control-row">
        <div className="control no-margin">
          <label htmlFor="email">Email</label>
          <input id="email" type="email" name="email" onChange={(event) => handleInputChange("email", event.target.value)}
            value={enterdValue.email}
          />
        </div>

        <div className="control no-margin">
          <label htmlFor="password">Password</label>
          <input id="password" type="password" name="password" onChange={(event) => handleInputChange("password", event.target.value)}
            value={enterdValue.password}
          />
        </div>
      </div>
      <p className="form-actions">
        <button className="button" type="submit">Login</button>
      </p>
    </form>
  );
}