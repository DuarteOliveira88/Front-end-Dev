let myForm=document.querySelector("form");
let myList=document.querySelector("ul");
let myInput=document.querySelector("#myInput1");
let myInput2=document.querySelector("#myInput2");
myForm.addEventListener("submit",function(e){
    e.preventDefault();
    let novaLinha=document.createElement("li");
    novaLinha.innerText=myInput.value + " " + myInput2.value;
    myList.appendChild(novaLinha);
    this.reset();
})