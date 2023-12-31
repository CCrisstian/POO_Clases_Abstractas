package org.CCristian.POO_Clases_Abstractas.Formulario.Validador;

import java.util.stream.Stream;

public class RequeridoValidador extends Validador{

    protected String mensaje = "el campo %s es REQUERIDO!";

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
        return (valor != null && valor.length() > 0);
    }

}
