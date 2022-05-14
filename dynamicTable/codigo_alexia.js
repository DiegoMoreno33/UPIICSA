$(document).ready(function(){     
  $("#myTable").dynamicTable({
        //columnas iniciales    
        columns: [ 
          
          {
              text: "Tipo de medio",
              key: "medio"
          },
          {
              text: "Valor",
              key: "identificador"
          },        
        ],
 
        //carga de datos
       data: [{
              
              medio: 'youtube',
              identificador: 'alexia'    
          },
        ],
        //definición de botones
        buttons: {
            addButton: '<input type="button" value="Agregar" class="btn btn-success" />',
            cancelButton: '<input type="button" value="Cancelar" class="btn btn-secondaryr" />',
            deleteButton: '<input type="button" value="Borrar" class="btn btn-danger" />',
            editButton: '<input type="button" value="Editar" class="btn btn-secondary" />',
            saveButton: '<input type="button" value="Guardar" class="btn btn-success" />',
        },
        showActionColumn: true,
        //condicionales
        getControl: function (columnKey) {
            
            if (columnKey == "medio") {
              return '<select class="form-control"><option value="telefono">Telefono</option><option value="facebook"><Facebook</option><option value="twitter">twitter</option><option value="youtube">youtube</option></select>';
            }

            return '<input type="text" class="form-control" />';
        }

    });	    
});    