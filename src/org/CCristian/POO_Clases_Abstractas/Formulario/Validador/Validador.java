package org.CCristian.POO_Clases_Abstractas.Formulario.Validador;

abstract public class Validador {

    protected String mensaje;

    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValido(String valor);

}
