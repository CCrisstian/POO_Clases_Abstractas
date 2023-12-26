package org.CCristian.POO_Clases_Abstractas.Formulario.Elementos;

public class TextAreaForm extends ElementoForm{

/*------------ATRIBUTOS----------------*/
    private int filas;
    private int columnas;
/*------------ATRIBUTOS----------------*/


/*------------GETTER-SETTER----------------*/
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
/*------------GETTER-SETTER----------------*/


/*------------CONSTRUCTOR----------------*/
    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }
/*------------CONSTRUCTOR----------------*/


/*------------MÉTODOS----------------*/
    @Override
    public String DibujarHTML() {
        return "<TextArea name='"+this.nombre+
                "' cols='"+this.columnas+
                "' rows='"+this.filas+
                "'>" +this.valor+ "</TextArea>";
    }
/*------------MÉTODOS----------------*/

}
