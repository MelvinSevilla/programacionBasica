import java.util.Scanner;

import persona.Estudiante;

public void main(String[] args) {

    // Estudiante estudiante1 = new Estudiante(
    // "0704199901025", 
    // "Melvin Sevilla",
    // 26,
    // "Masculino",
    // "20172500020" ,
    // "Informatica");
    Estudiante estudiante1 = new Estudiante(
        null,null,
        0,null,null,null
    );


    estudiante1.setDni("0704199952514");

    Scanner teclado = new Scanner(System.in);
    System.out.println("###################  Ingrese la Informacion del Estudiante:  ###################");
    System.out.println("DNI:");
    String dni = teclado.nextLine();
    estudiante1.setDni(dni);

    teclado.close();
    estudiante1.mostrarDatosEstudiante();

}