import { useState } from 'react';
import BotaoCreateUser from './BotaoCreateUser';

export const user = {
    name: '',
    job:'',
    age:''
  };
  
  function Stats() {
    const [name, setName] = useState('');
    // Your goal: This function should be called WITH A VALUE for name when the <button> is clicked
    function handleCreateUser() {
      user.name = name;
      console.log(user.name);
    }
    function handleCreateUser2(name) {
      user.name = name;
      console.log(user.name);
    }
    return (
      <div id="app">
        <h1>User Login</h1>
        <p>
          <label>Name</label>
          {/* You don't need to do anything with this input! You'll learn how to handle user input later */}
          <input type="text" value={name} onChange={(e)=>setName(e.target.value)} /> 
        </p>
        <p id="actions">
        <BotaoCreateUser onSelect={()=>handleCreateUser2("Duarte")} >Botao 1</BotaoCreateUser>
        <BotaoCreateUser onSelect={()=>handleCreateUser2("Duarte")} >Botao 2</BotaoCreateUser>
        </p>
        
      </div>
    );
  }
  
  export default Stats;