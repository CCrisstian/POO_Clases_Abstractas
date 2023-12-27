package org.CCristian.POO_Clases_Abstractas.Formulario.Validador;

public class LargoValidador extends Validador{

    protected String mensaje = "el campo debe tener un MÍNIMO de %d y un MÁXIMO %d caracteres";

//    %d: Especifica un formato para valores enteros (números enteros). Cuando utilizas %d en una
//    cadena de formato, esperas que el valor que se insertará en ese lugar sea un número entero.

//    %s: Especifica un formato para cadenas de texto. Se utiliza para insertar una cadena de texto
//    en ese lugar en la cadena de formato.


    private int min;
    private int max = Integer.MAX_VALUE;


    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }


//Para asignar los valores mínimos y máximos, o solo uno de ellos
    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }


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
        this.mensaje = String.format(this.mensaje, this.min, this.max);

        if (valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }
}
