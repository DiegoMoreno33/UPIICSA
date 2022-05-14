const map = new Map();

function cancelar(){
	verLista();
}

function guardar(){
	var identificador;
	var nombre;
	nombre = document.getElementById("Mcontacto2").value;
	identificador = document.getElementById("nombre2").value;
	identificador = identificador.replace(/ /g, "");

	if (nombre != "none" && identificador != "") {
		map.delete(identificador);
		map.set(identificador,nombre);
		verLista();
		document.getElementById("Mcontacto").value = "none";
		document.getElementById("nombre").value = "";
	}
}

function editar(){

	var identificador;
	identificador = document.getElementById("editar").value;
	var tabla ="<table id='muestra'> "+
	"<thead>"+
	"<tr><th>Medio de Contacto</th><th>Valor</th><th>Acciones</th>"+
	"</thead>"+
	"<tbody>";
	cuerpo="";

	map.forEach((value,key)=>{
		switch (value) {
			case 'Facebook':
				cuerpo=cuerpo+"<tr><td><select name='Mcontacto2' id='Mcontacto2'><option value ='none'>Seleccione una Opcion</option><option value ='Facebook' selected>Facebook</option><option value ='Whatsapp'>Whatsapp</option><option value ='Instragram'>Instagram</option><option value ='Correo'>Correo</option></select></td><td> <input type='text' name='nombre2' id='nombre2' placeholder="+ key +" value="+ key +"> </td><td> <button type='submit' name='guardar' id='guardar' value="+ key.replace(/ /g, "") +" onclick='guardar()'><img id='img-resp' src='images/check.png'></button> <button type='submit' name='cancelar' id='cancelar' value="+ key.replace(/ /g, "") +" onclick='cancelar()'><img id='img-resp' src='images/cancel.png'></button> </td></tr>";
				break;
			case 'Whatsapp':
				cuerpo=cuerpo+"<tr><td><select name='Mcontacto2' id='Mcontacto2'><option value ='none'>Seleccione una Opcion</option><option value ='Facebook'>Facebook</option><option value ='Whatsapp' selected>Whatsapp</option><option value ='Instragram'>Instagram</option><option value ='Correo'>Correo</option></select></td><td> <input type='text' name='nombre2' id='nombre2' placeholder="+ key +" value="+ key +"> </td><td> <button type='submit' name='guardar' id='guardar' value="+ key.replace(/ /g, "") +" onclick='guardar()'><img id='img-resp' src='images/check.png'></button> <button type='submit' name='cancelar' id='cancelar' value="+ key.replace(/ /g, "") +" onclick='cancelar()'><img id='img-resp' src='images/cancel.png'></button> </td></tr>";
				break;
			case 'Instragram':
				cuerpo=cuerpo+"<tr><td><select name='Mcontacto2' id='Mcontacto2'><option value ='none'>Seleccione una Opcion</option><option value ='Facebook'>Facebook</option><option value ='Whatsapp'>Whatsapp</option><option value ='Instragram' selected>Instagram</option><option value ='Correo'>Correo</option></select></td><td> <input type='text' name='nombre2' id='nombre2' placeholder="+ key +" value="+ key +"> </td><td> <button type='submit' name='guardar' id='guardar' value="+ key.replace(/ /g, "") +" onclick='guardar()'><img id='img-resp' src='images/check.png'></button> <button type='submit' name='cancelar' id='cancelar' value="+ key.replace(/ /g, "") +" onclick='cancelar()'><img id='img-resp' src='images/cancel.png'></button> </td></tr>";
				break;
			case 'Correo':
				cuerpo=cuerpo+"<tr><td><select name='Mcontacto2' id='Mcontacto2'><option value ='none'>Seleccione una Opcion</option><option value ='Facebook'>Facebook</option><option value ='Whatsapp'>Whatsapp</option><option value ='Instragram'>Instagram</option><option value ='Correo' selected>Correo</option></select></td><td> <input type='text' name='nombre2' id='nombre2' placeholder="+ key +" value="+ key +"> </td><td> <button type='submit' name='guardar' id='guardar' value="+ key.replace(/ /g, "") +" onclick='guardar()'><img id='img-resp' src='images/check.png'></button> <button type='submit' name='cancelar' id='cancelar' value="+ key.replace(/ /g, "") +" onclick='cancelar()'><img id='img-resp' src='images/cancel.png'></button> </td></tr>";
				break;
			case 'Youtube':
				cuerpo=cuerpo+"<tr><td><select name='Mcontacto2' id='Mcontacto2'><option value ='none'>Seleccione una Opcion</option><option value ='Facebook'>Facebook</option><option value ='Whatsapp'>Whatsapp</option><option value ='Instragram'>Instagram</option><option value ='Correo' selected>Correo</option></select></td><td> <input type='text' name='nombre2' id='nombre2' placeholder="+ key +" value="+ key +"> </td><td> <button type='submit' name='guardar' id='guardar' value="+ key.replace(/ /g, "") +" onclick='guardar()'><img id='img-resp' src='images/check.png'></button> <button type='submit' name='cancelar' id='cancelar' value="+ key.replace(/ /g, "") +" onclick='cancelar()'><img id='img-resp' src='images/cancel.png'></button> </td></tr>";
				break;
			case 'Telegram':
				cuerpo=cuerpo+"<tr><td><select name='Mcontacto2' id='Mcontacto2'><option value ='none'>Seleccione una Opcion</option><option value ='Facebook'>Facebook</option><option value ='Whatsapp'>Whatsapp</option><option value ='Instragram'>Instagram</option><option value ='Correo' selected>Correo</option></select></td><td> <input type='text' name='nombre2' id='nombre2' placeholder="+ key +" value="+ key +"> </td><td> <button type='submit' name='guardar' id='guardar' value="+ key.replace(/ /g, "") +" onclick='guardar()'><img id='img-resp' src='images/check.png'></button> <button type='submit' name='cancelar' id='cancelar' value="+ key.replace(/ /g, "") +" onclick='cancelar()'><img id='img-resp' src='images/cancel.png'></button> </td></tr>";
				break;
			case 'Twitter':
				cuerpo=cuerpo+"<tr><td><select name='Mcontacto2' id='Mcontacto2'><option value ='none'>Seleccione una Opcion</option><option value ='Facebook'>Facebook</option><option value ='Whatsapp'>Whatsapp</option><option value ='Instragram'>Instagram</option><option value ='Correo' selected>Correo</option></select></td><td> <input type='text' name='nombre2' id='nombre2' placeholder="+ key +" value="+ key +"> </td><td> <button type='submit' name='guardar' id='guardar' value="+ key.replace(/ /g, "") +" onclick='guardar()'><img id='img-resp' src='images/check.png'></button> <button type='submit' name='cancelar' id='cancelar' value="+ key.replace(/ /g, "") +" onclick='cancelar()'><img id='img-resp' src='images/cancel.png'></button> </td></tr>";
				break;
		}
	});
	tabla=tabla+cuerpo;
	tabla=tabla+"</tbody></table>";

	a=document.getElementById("despliegaLista").innerHTML=tabla;  

}

function eliminar(){
	var identificador;
	identificador = document.getElementById("eliminar").value;
	map.delete(identificador);
	verLista();
}

function agregar(){
	var identificador;
	var nombre;
	nombre = document.getElementById("Mcontacto").value;
	identificador = document.getElementById("nombre").value;
	identificador = identificador.replace(/ /g, "");
	if (nombre != "none" && identificador != "") {
		map.set(identificador,nombre);
		verLista();
		document.getElementById("Mcontacto").value = "none";
		document.getElementById("nombre").value = "";
	}
}

function verLista(){
	var tabla ="<table id='muestra'> "+
	"<thead>"+
	"<tr><th>Medio de Contacto</th><th>Valor</th>"+
	"</thead>"+
	"<tbody>";
	cuerpo="";
	map.forEach((value,key)=>{
		cuerpo=cuerpo+"<tr><td>"+ value +"</td><td>"+ key +"</td><td> <button type='submit' name='eliminar' id='eliminar' value="+ key.replace(/ /g, "") +" onclick='eliminar()'><img id='img-resp' src='images/delete.png'></button> <button type='submit' name='editar' id='editar' value="+ key.replace(/ /g, "") +" onclick='editar()'><img id='img-resp' src='images/edit.png'></button> </td></tr>"
	});
	tabla=tabla+cuerpo;
	tabla=tabla+"</tbody></table>";

	a=document.getElementById("despliegaLista").innerHTML=tabla;
}