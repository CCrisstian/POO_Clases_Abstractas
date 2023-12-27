package org.CCristian.POO_Clases_Abstractas.Formulario.Validador;

public class EmailValidador extends Validador{

    protected String mensaje = "el campo %s tiene un formato de email INVALIDO!";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
//    Expresión Regular para validar el email

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
        return valor.matches(EMAIL_REGEX);
    }

//    El método .matches() es un método de la clase String que se utiliza
//    para verificar si una cadena de texto coincide con un patrón específico
//    proporcionado en forma de expresión regular.
//    El método devuelve true si la cadena coincide completamente con la
//    expresión regular y false en caso contrario.

}
