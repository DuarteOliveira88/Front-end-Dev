let num1=5;
let num2=8;
let jsDone=true;
function helloStudent(name,age) {
    console.log("Ola "+name);
    return age;
}
let hello =helloStudent("Rita",31);
let age =helloStudent("Rita",31);

// let safePasses=[];
// for(let pass of passwords){
//     if(pass.length > 6){
//         safePasses.push(pass);
//     }
// }

const studentGrades=[{'studentName':'Rita','grade':16,nameAndGrade(){return `A ${this.studentName} tem nota ${this.grade}.`}},{'studentName':'Luis','grade':20}]
studentGrades.forEach(function(student){
    console.log(`A nota da ${student.studentName} é ${student.grade}.`);
})
const botaoTeste=document.querySelector("button");
function submeterTeste(){
    event.preventDefault();
    const submeter=document.querySelector("input");
    const linha=document.createElement("li");
    linha.innerText=submeter.value;
    const lista=document.querySelector("ul");
    lista.appendChild(linha)
}
botaoTeste.addEventListener("click", submeterTeste);
const lista=document.querySelectorAll("li");
    lista.forEach((item)=>{
        item.append("-com sucesso!");
});

window.addEventListener("keydown",function(e){
    console.log(e.key);
})
window.addEventListener("keydown",function(e){
    if(e.key=="Escape"){
        alert("Tens a certeza que queres entregar o teste?")
    }
})