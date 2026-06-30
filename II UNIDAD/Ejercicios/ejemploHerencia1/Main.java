import java.util.Scanner;

import persona.Estudiante;

public void main(String[] args) {

    Estudiante estudiante1 = new Estudiante(
    "0704199901025", 
    "Melvin Sevilla",
    26,
    "Masculino",
    "20172500020" ,
    "Informatica");

    // INgresando Informacion
    // Estudiante estudiante1 = new Estudiante(
    //     null,null,
    //     0,null,null,null
    // );


    // estudiante1.setDni("0704199952514");

    // Scanner teclado = new Scanner(System.in);
    // System.out.println("###################  Ingrese la Informacion del Estudiante:  ###################");
    
    // System.out.println("DNI:");
    // String dni = teclado.nextLine();
    // estudiante1.setDni(dni);        
        
    // System.out.println("Nombre:");
    // String nombre = teclado.nextLine();
    // estudiante1.setNombre(nombre);
        
    // System.out.println("Edad:");
    // int edad = teclado.nextInt();
    // teclado.nextLine();
    // estudiante1.setEdad(edad);
        
    // System.out.println("Sexo:");
    // String sexo = teclado.nextLine();
    // estudiante1.setSexo(sexo);
        
    // System.out.println("Numero Cuenta:");
    // String nCuenta = teclado.nextLine();
    // estudiante1.setNumeroCuenta(nCuenta);
    
    // System.out.println("Carrera:");
    // String carrera = teclado.nextLine();
    // estudiante1.setCarrera(carrera);

    // teclado.close();




    estudiante1.mostrarDatosEstudiante();



    // Persona persona = new Persona("121231","Melvin",12,"Masculino");        
    // System.out.println("\nDatos de Persona: "
    // +"\nDNI: "+persona.getDni()
    // +"\nNombre: "+persona.getNombre()
    // +"\nEdad: : "+persona.getEdad()
    // +"\nSexo: "+persona.getSexo());
        
    

}