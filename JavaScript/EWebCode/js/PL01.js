let nome='Duarte',sobrenome='Oliveira',email='aaa@bbb.com';
let idade=123;
// alert(`${nome} ${sobrenome}`); 
// console.log(`Nome: ${nome} (${nome.length})\nSobrenome: ${sobrenome} (${sobrenome.length})\nIdade: ${idade}\nEmail: ${email}`)
// console.log(`Nome: ${nome.toUpperCase()} (${nome.length})\nSobrenome: ${sobrenome.toLowerCase()} (${sobrenome.length})\nIdade: ${idade}\nEmail: ${email}`)
let fraseEX='Eu qui proident reprehenderit minim est minim adipisicing est. Lorem amet consequat irure incididunt. Tempor exercitation duis minim in adipisicing eiusmod reprehenderit ex culpa sunt ea. Consectetur ipsum ea commodo non sit dolore eu elit magna esse. Ut dolore enim nulla laborum.'
function primeiraOcu(frase,letra) {
    console.log(frase.indexOf(letra))
}
function ultimaOcu(frase,letra) {
    let aux,pos=-1;
    for(let i=0;i<frase.length;i++){
        if(frase[i]==letra){
            if(i>pos){
                pos=i;
            }
        }
    }
    console.log(pos)
}
function opMath(num1,num2){
    console.log(`Soma: ${num1+num2}\nSub: ${num1-num2}\nMult: ${num1*num2}\nDiv: ${num1/num2}\nRaiz: ${Math.sqrt(num1)}\nAbs: ${Math.abs(num1)}`)
}
//console.log(Math.random())//numero random entre 0-1
function randomNUM(num) {
    return Math.random() * num
}
function arredonda(num) {
    let parteInt,dec;
    parteInt=Math.trunc(num);
    for(let i=0;i<num.length;i++){
        if(num[i]=='.'){
            dec=num[i+1];
        }
    }
    if(dec>5){
        parteInt++;
    }
    console.log(parteInt)
}
function febre(num) {
    if(num>=37.5){
        console.log("Tem febre, toma um benurom")
    }else if(num<35){
        console.log("Temperatura muito baixa veste roupa home")
    }else{
        console.log("Esta saudavel")
    }
}
function maioral(idade,genero){
    switch(genero.toLowerCase()){
        case "masculino":
            if(idade<25){
                if(idade<18){
                    console.log('O jovem e menor de idade')
                    break;
                }
                console.log('O jovem e maior de idade')
                break;
            }
            console.log('O homem e maior de idade')
            break;
        case "feminino":
            if(idade<25){
                if(idade<18){
                    console.log('A jovem e menor de idade')
                    break;
                }
                console.log('A jovem e maior de idade')
                break;
            }
            console.log('A mulher e maior de idade')
            break;
        default:
            console.log("Genero nao detetado.")
    }
}
function eMult(num1,num2){
    if(num1>num2){
        if(num1%num2==0){
            console.log(`Os numeros ${num1} e ${num2} sao multipos`)
        }else{
            console.log("Nao sao multiplos")
        }
    }else{
        if(num2%num1==0){
            console.log(`Os numeros ${num1} e ${num2} sao multipos`)
        }else{
            console.log("Nao sao multiplos")
        }
    }
}
function ePar(num1){
    if(num1%2==0){
        console.log("E par")
    }else{
        console.log("E impar")
    }
}
function temCen(num){
    let dez,uni
    if(num>=100){
        uni=num%10
        num/=10
        dez=num%10
        num/=10
        console.log(`${num}  ${dez}  ${uni}`)
    }else{
        console.log("Nao tem centenas")
    }
    // if(num>=100){
    //     while(num1>=1){
    //         console.log(num%10)
    //         num=num/10
    //     }
    // }
}
function menor3(num1,num2,num3){
    if(num1<num2&&num1<num3) {
        if(num2<num3){
            console.log(`${num1}  ${num2}  ${num3}`)
        }else{
            console.log(`${num1}  ${num3}  ${num2}`)
        }
    }else if(num2<num3){
        if(num1<num3){
            console.log(`${num2}  ${num1}  ${num3}`)
        }else{
            console.log(`${num2}  ${num3}  ${num1}`)
        }
    }else{
        if(num1<num2){
            console.log(`${num3}  ${num1}  ${num2}`)
        }else{
            console.log(`${num3}  ${num2}  ${num1}`)
        }
    }
}
function temFah(num){
    return num*1.8+32
}
function convMoedas(num){
    let dolar=num*1.2,libra=num*0.9,reais=num*4,pesos=num*28.5;
    console.log(`${dolar} dolars ${libra} libras ${reais} reais ${pesos} pesos`)
}
function capicua(num){
    let str=num.toString();
    let strInv=str.split('').reverse().join('')
    if(str==strInv){
        console.log(`O num ${num} e capicua`)
    }else{
        console.log("Nao e capicua")
    }
}
function de0a10(num){
    let lista=[];
    if(num>10){
        for(let i=0;i<=num;i++){
            lista.push(i);
        }
    }else{
        console.log("Numero tem de ser superior a 10")
    }
    console.log(lista)
    return lista;
}
function printPar(num){
    let lista= [];
    for(let i=0;i<=num;i++){
        if(i%2==0){
            lista.push(i);
        }
    }
    return lista;
}
function printaMult5(num){
    let lista= [];
    for(let i=0;i<=num;i++){
        if(i%5==0){
            lista.push(i);
        }
    }
    return lista;
}
function fibonacci(num){
    let lista=[0,1];
    for(let i=1;i<=num-2;i++){
        lista[i+1]=lista[i]+lista[i-1];
    }
    return lista;    
}
function reveion(dia,mes,ano){
    let diasf=0,aux;
    mes31=[1,3,5,7,8,10,12]
    mes30=[4,6,9,11]
    if(ano%4==0){
        if(mes31.includes(mes)){
            diasf+=31-dia;
            mes++
        }else if(mes30.includes(mes)){
            diasf+=30-dia;
            mes++
        }else{
            diasf+=29-dia;
            mes++
        }
        for(let i=mes;i<=12;i++){
            if(mes30.includes(i)){
                diasf+=30
                console.log(i,diasf)
            }
            else if(mes31.includes(i)){
                diasf+=31
                console.log(i,diasf)
            }else{
                diasf+=29
                console.log(i,diasf)
            }
        }
    }else{
        if(mes31.includes(mes)){
            diasf+=31-dia;
            mes++
        }else if(mes30.includes(mes)){
            diasf+=30-dia;
            mes++
        }else{
            diasf+=28-dia;
            mes++
        }
        for(let i=mes;i<=12;i++){
            if(mes30.includes(i)){
                diasf+=30
                console.log(i,diasf)
            }
            else if(mes31.includes(i)){
                diasf+=31
                console.log(i,diasf)
            }else{
                diasf+=28
                console.log(i,diasf)
            }
        }
    }
    return diasf;
}
function calc(num1,num2,op) {
    switch(op){
        case "+":
            return num1+num2;
        case "-":
            return num1-num2;
        case "*":
            return num1*num2;
        case "/":
            return num2/num2;

    }
}