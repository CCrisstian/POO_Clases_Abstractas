package org.CCristian.POO_Clases_Abstractas.Formulario.Elementos;

public class InputForm extends ElementoForm{

/*------------ATRIBUTOS----------------*/
    private String tipo = "Text";
/*------------ATRIBUTOS----------------*/


/*------------GETTER-SETTER----------------*/
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/*------------GETTER-SETTER----------------*/


/*------------CONSTRUCTOR----------------*/
    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }
/*------------CONSTRUCTOR----------------*/


/*------------MÉTODOS----------------*/
    @Override
    public String DibujarHTML() {
        return "<input type=\"" + this.tipo+
                "\" name=\"" + this.nombre+
                "\" value=\""+ this.valor +"\">";
    }
/*------------MÉTODOS----------------*/

}
