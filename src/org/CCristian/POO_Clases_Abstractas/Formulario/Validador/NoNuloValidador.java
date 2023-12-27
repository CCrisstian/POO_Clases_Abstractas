package org.CCristian.POO_Clases_Abstractas.Formulario.Validador;

public class NoNuloValidador extends Validador{

    protected String mensaje = "el campo NO puede ser NULO";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }

}
