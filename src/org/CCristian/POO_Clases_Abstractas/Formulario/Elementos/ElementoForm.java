package org.CCristian.POO_Clases_Abstractas.Formulario.Elementos;

abstract public class ElementoForm {

/*------------ATRIBUTOS----------------*/
    protected String valor;
    protected String nombre;
/*------------ATRIBUTOS----------------*/


/*------------SETTER----------------*/
    public void setValor(String valor) {
        this.valor = valor;
    }
/*------------SETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }
/*------------CONSTRUCTOR----------------*/


/*------------MÉTODOS----------------*/
    abstract public String DibujarHTML();
/*------------MÉTODOS----------------*/

}
