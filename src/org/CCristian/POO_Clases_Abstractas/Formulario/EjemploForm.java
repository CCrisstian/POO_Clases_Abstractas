package org.CCristian.POO_Clases_Abstractas.Formulario;

import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.*;
import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.Select.Opcion;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm UserName = new InputForm("UserName");
        InputForm Password = new InputForm("Clave","Password");
        InputForm Email = new InputForm("Email","Email");
        InputForm Edad = new InputForm("Edad","Number");

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        lenguaje.addOpcion(new Opcion("1","Java"));
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","JavaScript").setSelected());
        lenguaje.addOpcion(new Opcion("4","TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String DibujarHTML() {
                return "<input disabled name='"+this.nombre+"' value=\"" +this.valor+"\">";
            }
        };

//        En Java, una "clase anónima" se refiere a una clase que se declara e instancia
//        al mismo tiempo, sin proporcionar un nombre para la clase. Estas clases son útiles
//        cuando solo necesitas una instancia de una clase y no planeas reutilizar la definición
//        de la clase en otro lugar.
//        La principal aplicación de las clases anónimas se encuentra en la implementación de
//        interfaces y clases abstractas.

        saludar.setValor("Esta campo esta deshabilitado!");
        UserName.setValor("John Doe");
        Password.setValor("a1b2c3");
        Email.setValor("John.Doe@correo.com");
        Edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia ...");

        List<ElementoForm> elementos =  Arrays.asList(UserName,
                Password,
                Email,
                Edad,
                experiencia,
                lenguaje,
                saludar);

        elementos.forEach(e -> {
            System.out.println(e.DibujarHTML());
            System.out.println();
        });

//        e -> { ... }: Esta es la expresión lambda. La parte antes de la flecha (->)
//        especifica los parámetros del método (en este caso, "e" que representa cada
//        elemento en la iteración), y la parte después de la flecha especifica
//        el cuerpo del método.


    }
}
