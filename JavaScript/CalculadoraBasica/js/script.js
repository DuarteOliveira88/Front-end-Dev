let numAtual=""
let numAnterior=""
let operador=""

function inserir(botao) {
    // numAtual *= 10;
    numAtual += botao;
    document.getElementById("display").value = numAtual;
}

function operacao(op) {
    if(numAnterior !== ""){
        conta();
    }
    numAnterior = numAtual;
    numAtual = "";
    document.getElementById("display").value = numAtual;
    operador=op;
    
}

function conta() {
    let num1=parseFloat( numAnterior);
    let num2=parseFloat(numAtual)
    let resultado
    switch (operador) {
        case "+":
            resultado = (num1 + num2);
            numAtual=(num1 + num2);
            numAnterior=0;
            op="";
            break;
        case "-":
            resultado = num1 - num2;
            numAtual=num1 - num2
            numAnterior=0;
            op="";
            break;
        case "*":
            resultado= num1 * num2;
            numAtual=(num1 * num2) 
            numAnterior=0;
            op="";
            break
        case "/":
            resultado = num1 / num2;
            numAtual= num1 / num2;
            numAnterior=0;
            op="";
            break
    }
    document.getElementById("display").value = resultado;
}

function reset() {
    numAnterior = ""
    numAtual = ""
    op="";
    document.getElementById("display").value = numAtual;
}
for(let i=0;i<=9;i++){
    let aux=document.querySelector(`#num${i}`);
    aux.addEventListener("click",function() { inserir(`${i}`) } )
}
let opMult=document.querySelector("#opMult");
let opDiv=document.querySelector("#opDIv");
let opMais=document.querySelector("#opMais");
let opMenos=document.querySelector("#opMenos");
let cReset=document.querySelector("#C");
let result=document.querySelector("#resul");
opMult.addEventListener("click",function() { operacao('*') } )
opDiv.addEventListener("click",function(){operacao('/')})
opMais.addEventListener("click",function(){operacao('+')})
opMenos.addEventListener("click",function(){operacao('-')})
cReset.addEventListener("click",reset)
result.addEventListener("click",function(){ conta() } )