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
              
              medio: 'T',
              identificador: '64355rfR'    
          },
        ],

        //definición de botones
        buttons: {
            addButton: '<input type="button" value="Agregar" class="btn btn-success" />',
            cancelButton: '<input type="button" value="Cancelar" class="btn btn-danger" />',
            deleteButton: '<input type="button" value="Borrar" class="btn btn-danger" />',
            editButton: '<input type="button" value="Editar" class="btn btn-secondary" />',
            saveButton: '<input type="button" value="Guardar" class="btn btn-success" />',
        },
        showActionColumn: true,
        //condicionales
        getControl: function (columnKey) {
            
            if (columnKey == "medio") {
              return '<select class="form-control"><option value="I">instagram</option><option value="C">correo</option><option value="T">telefono</option><option value="F">facebook</option><option value="TW">twitter</option></select>';
            }

            return '<input type="text" class="form-control" />';
        }

    });	    
});    