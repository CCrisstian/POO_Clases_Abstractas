package org.CCristian.POO_Clases_Abstractas.Formulario.Elementos;

import org.CCristian.POO_Clases_Abstractas.Formulario.Validador.LargoValidador;
import org.CCristian.POO_Clases_Abstractas.Formulario.Validador.Mensaje.MensajeFormateable;
import org.CCristian.POO_Clases_Abstractas.Formulario.Validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

/*------------ATRIBUTOS----------------*/
    protected String valor;
    protected String nombre;
    private List<Validador> validadores;
    private List<String> errores;
/*------------ATRIBUTOS----------------*/

/*------------GETTER-SETTER----------------*/
    public void setValor(String valor) {
        this.valor = valor;
    }


    public List<String> getErrores() {
        return errores;
    }
/*------------GETTER-SETTER----------------*/

/*------------CONSTRUCTOR----------------*/
    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }
/*------------CONSTRUCTOR----------------*/

/*------------MÉTODOS----------------*/

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public Boolean esValido(){
        for (Validador v : this.validadores){
            if (!v.esValido(this.valor)){
                if (v instanceof MensajeFormateable){
                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(nombre));
                }else {
                this.errores.add(String.format(v.getMensaje(),nombre));
                }
            }
        }
        return errores.isEmpty();
    }

    abstract public String DibujarHTML();
/*------------MÉTODOS----------------*/

}
