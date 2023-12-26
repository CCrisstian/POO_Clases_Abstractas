package org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.Select;

public class Opcion {

/*------------ATRIBUTOS----------------*/
    private String valor;
    private String nombre;
    private boolean selected;
/*------------ATRIBUTOS----------------*/


/*------------GETTER-SETTER----------------*/

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
/*------------GETTER-SETTER----------------*/


/*------------CONSTRUCTOR----------------*/
    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }
/*------------CONSTRUCTOR----------------*/

}
