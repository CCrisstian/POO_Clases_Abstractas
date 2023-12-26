package org.CCristian.POO_Clases_Abstractas.Formulario;

import org.CCristian.POO_Clases_Abstractas.Formulario.Elementos.InputForm;

public class EjemploForm {
    InputForm UserName = new InputForm("UserName");
    InputForm Password = new InputForm("Clave","Password");
    InputForm Email = new InputForm("Email","Email");
    InputForm Edad = new InputForm("Edad","Number");
}
