function primeiraOcurrencia(){
    let frase="A turma de FE é dinâmica e tem as caracteristicas essenciais para brilhar numa empresa."
    console.log("A letra F aparece no idex: "+frase.indexOf("F"));
    console.log("A letra d aparece no idex: "+frase.indexOf("d"));
    console.log(frase.length);
}
function listaCompras(){
    let myWishList=[],input;
    do{
        input=prompt("O que quer adicinar a sua wish list: ");
        myWishList.push(input);
    }while(input.toLocaleLowerCase()!="fim");
    myWishList.pop();
    for(let item of myWishList){
        console.log(item);
    }
    console.log("A lista tem "+myWishList.length+" prendas.");
}
function multiply(num1,num2){
    console.log(num1*num2);
}
function isShortWeather(temperatura){
    if(temperatura>25){
        console.log(true);
    }else{
        console.log(false);
    }
}
function apresenta(){
    let nome=prompt("Diga o seu nome: ");
    alert("Ola, "+nome);
}
function somaArray(array){
    let soma=0;
    for(let i=0;i<array.length;i++){   
        soma+=array[i];
    }
    console.log(soma);
}