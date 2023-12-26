package org.CCristian.POO_Clases_Abstractas.Formulario.Elementos;

import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.Select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

/*------------ATRIBUTOS----------------*/
    private List<Opcion> opciones;
/*------------ATRIBUTOS----------------*/


/*------------CONSTRUCTOR----------------*/
    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }
/*------------CONSTRUCTOR----------------*/


/*------------MÉTODOS----------------*/
    public SelectForm AddOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String DibujarHTML() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion: this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){
                sb.append("selected");
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option");
        }
        sb.append("</selected");
        return sb.toString();
    }
/*------------MÉTODOS----------------*/

}
