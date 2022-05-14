const map = new Map();
const listaCotejo=new Set();
const mapWeak= new WeakMap();


function agregar(){
var identificador;
var nombre;
identificador=document.getElementById("identificador").value;
nombre=document.getElementById("nombre").value;
map.set(identificador,nombre);
verLista();

}

function verLista(){
var tabla="<table id='muestra'> "+
"<thead>"+
"<tr><th>Identificador</th><th>Nombre</th>"+
"</thead>"+
"<tbody>";
cuerpo="";
map.forEach((value,key)=>{
cuerpo=cuerpo+"<tr><td> <input type='text'>"+ key +" </td><td> "+ value +"</td> </tr> "
});
tabla=tabla+cuerpo;
tabla=tabla+"</tbody></table>";

a=document.getElementById("despliegaLista").innerHTML=tabla;
}