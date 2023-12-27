package org.CCristian.POO_Clases_Abstractas.Formulario.Validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "el campo debe ser un NUMERO";

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
        try {
            Integer.parseInt(valor);
            return true;
        }catch (NumberFormatException e){
            return false;
        }

    }
}
