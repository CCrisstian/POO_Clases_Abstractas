package org.CCristian.POO_Clases_Abstractas.Formulario;

import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.ElementoForm;
import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.InputForm;
import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.Select.Opcion;
import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.SelectForm;
import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.TextAreaForm;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm UserName = new InputForm("UserName");
        InputForm Password = new InputForm("Clave","Password");
        InputForm Email = new InputForm("Email","Email");
        InputForm Edad = new InputForm("Edad","Number");

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion Java = new Opcion("1","Java");
        lenguaje.addOpcion(Java);
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","JavaScript"));
        lenguaje.addOpcion(new Opcion("4","TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));

        UserName.setValor("John Doe");
        Password.setValor("a1b2c3");
        Email.setValor("John.Doe@correo.com");
        Edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia ...");
        Java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(UserName);
        elementos.add(Password);
        elementos.add(Email);
        elementos.add(Edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for (ElementoForm e: elementos){
            System.out.println(e.DibujarHTML());
            System.out.println("<br>");
        }
    }
}
