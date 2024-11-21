//Ex01
function cores(cor){
    const butao=document.getElementById(cor);
    butao.style.backgroundColor = cor;
}
red.addEventListener("click", function(){cores("red")})
blue.addEventListener("click", function(){cores("blue")})
green.addEventListener("click", function(){cores("green")})
//Ex02
function natal() {
let christmasGifts=[{name: "perfume",price: 40,},{name: "vinho",price: 10,},{name: "creme",price: 10,}]
let nomePresentes=[];
for(let presente of christmasGifts) {
    if(presente.price<20){
        let nome=presente.name;
        nomePresentes.push(nome);
    }
}
return nomePresentes;
}
//Ex03 e 4 e 5
function addFrase(){
    const frase01=document.createElement("p");
    frase01.innerText="É só mais um esforço para o curso de Front-end e serei um grande programador";
    frase01.style.fontSize="30px";
    document.body.appendChild(frase01);

    const aumenta=document.createElement("button");
    const diminui=document.createElement("button");
    aumenta.innerText="Aumente o texto";
    diminui.innerText="Dimuniu o texto";
    diminui.addEventListener("click",function(){diminuiTxt();} )
    aumenta.addEventListener("click",function(){aumentaTxt()})
    document.body.appendChild((aumenta));
    document.body.appendChild((diminui));
}
function diminuiTxt(){
    const frase=document.querySelector("p");
    let tam =parseInt(frase.style.fontSize);
    tam-=5;
    frase.style.fontSize=tam+"px";
    frase.style.textAlign="right";
}
function aumentaTxt(){
    const frase=document.querySelector("p");
    let tam =parseInt(frase.style.fontSize);
    tam+=5;
    frase.style.fontSize=tam+"px";
    frase.style.textAlign="center";
}
const frase=document.querySelector("#frase");
frase.addEventListener("click", ()=>{addFrase();});


//Ex6 e 7
function aprendido(){
    const lista=document.querySelectorAll("li");
    lista.forEach((item)=>{
        item.append("-aprendido");
    })
}
const butaoAprender=document.querySelector("#aprender");
butaoAprender.addEventListener("click",function(){aprendido();});

function adicionarAprendido(){
    let adiciona=prompt("Diga o que deseja adicionar")
    const linha=document.createElement("li");
    linha.innerText=adiciona;
    const lista=document.querySelector("ul");
    lista.appendChild(linha)
}
const butaoAdicionarAorender=document.querySelector("#adicionarAprender");
butaoAdicionarAorender.addEventListener("click",function(){adicionarAprendido();});

//Calculadora
function conta() {
    const p = document.querySelector("span");
    const numero1 = document.getElementById("num1").value;
    const numero2 = document.getElementById("num2").value;
    const operacao = document.querySelector("#op").value;
    let soma=0;
    switch (operacao) {
        case "+":
            p.innerHTML = parseFloat(numero1)+parseFloat(numero2);
            break
        case "-":
            p.innerHTML = numero1 - numero2;
            break
        case "*":
            p.innerHTML = numero1 * numero2;
            break
        case "/":
            p.innerHTML = numero1 / numero2;
            break
    }
}
const res = document.querySelector("#res");
res.addEventListener("click", conta());



