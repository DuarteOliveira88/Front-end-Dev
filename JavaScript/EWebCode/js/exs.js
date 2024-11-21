// let myLuckyNumber = 8;
// let myName = 'duarte';
// alert('O meu nome e '+ myName + ' ' + 'e o meu numero preferido e ' + myLuckyNumber);

// const message = '   TASTE THE RAINBOW!  ';
// let wishper= message.trim().toLowerCase();
// alert(message);
// alert(wishper);

// const word = 'skateboard';
// let retira = word.slice(5).replace('o','e');
// alert(retira);

// let fisrtName = prompt('O seu primeiro nome');
// let lastName = prompt('O seu ultimo nome');
// let age = parseInt(prompt('A sua idade'));
// if(age > 30){
//     alert('Olá senhor ' + fisrtName + ' '+ lastName);
// }else{
// alert('Olá jovem ' + fisrtName + ' '+ lastName);
// }

// let diaSemana = prompt('Dia da semana de hoje');
// diaSemana = diaSemana.toLowerCase();
// switch(diaSemana){
//     case 'sexta':
//         alert('Sextouuuuuuuuuuuuuuuuu');
//         break;
//     default:
//         alert('keep dreaming');
// }

// let password=prompt('Diga uma palavra pass com pelo menos 6 caracteres');
// if (password.length < 6){
//     alert('Password invalida');
// } else {
//     alert('Valid Password');
// }

// let planetas=["Mercúrio","Vénus","Terra","Mart","Jupiter","Saturno","Urano","Neptuno","Plutão"];
// planetas[3]="Marte"
// planetas.pop()
// planetas.unshift("Lands Between")
// console.log(planetas)

// let sentosAviao=[['Ruth','aa','bb'],['cc','dd','ee'],['ff','gg','hh'],['ii',null,'kk'],['ll','mm','nn']]
// sentosAviao[4][1]='Duarte'
// console.log(sentosAviao[4][1])

// let produto={nome: 'Wee', inStock: true,preco: 1.99,colors: ['vermelho','azul','verde']}
// console.log(produto.preco);
// console.log(produto.colors[2]);
// produto.preco=2.55;
// console.log(produto.preco)

// let frase = "Da ba dee da ba daa"
// let num = 25;
// for(let i=0;i<6;i++){
//     console.log(frase+"\n")
// }
// for(let i=0;i<5;i++){~
//     console.log(num)
//     num-=5;
// }

// const people=["Scooby","Velma","Daphne","Shaggy","Fred"]
// for(let i=0;i<people.length;i++){
//     console.log(i, people[i].toUpperCase())
// }

// let compras=[`leite`,`ovos`]
// let codigoFim = [`fim`,`Fim`,`FIM`,`FIm`]
// let codigoFimS=`fim`
// let user=prompt(`O que quer adicionar a lista?`)
// while(user!=codigoFim[0]&&user!=codigoFim[1]&&user!=codigoFim[2]&&user!=codigoFim[3]){
//     compras.push(user)
//     user=prompt(`O que quer adicionar a lista?`)
// }
// while(user.toLocaleLowerCase()!=codigoFimS){
//     compras.push(user)
//     user=prompt(`O que quer adicionar a lista?`)
// }
// for(let i=0;i<compras.length;i++){
//     console.log(i, compras[i])
// }

function printHeart() {
    let print = `<3`;
    alert(print);
}
function rant(message) {
    for (let i = 0; i < 3; i++) {
        console.log(message.toUpperCase())
    }
}
function isSnakeEyes(num1, num2) {
    if (num1 == 1 && num2 == 1) {
        console.log(`Yay, Snake Eyes`)
    } else {
        console.log(`Nao sao olhos de cobra`)
    }
}
function harryFistName(){
const fullNames = [{ first: 'Albus', last: 'Dumbledore' }, { first: 'Harry', last: 'Potter' }, { first: 'Hermione', last: 'Granger' }, { first: 'Ron', last: 'Weasley' }, { first: 'Rubeus', last: 'Hagrid' }, { first: 'Minerva', last: 'McGonagall' }, { first: 'Severus', last: 'Snape' }];
const firstNames= fullNames.map(function (n){
    return n.first;
})
console.log(firstNames)
}
const greet= (nome) => {
    return "hey "+nome+"!"
}
function validUserNames(array){
    const validUser=array.filter(n =>{
        return n.length<10
    })
    console.log(validUser)
}
const allEven = array=> (array.every((num) => (num%2)==0 ))