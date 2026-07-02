import java.util.Scanner;
import java.util.Vector;

import persona.Estudiante;
import persona.Empleado;
import persona.Persona;

public void main(String[] args) {


    
    // **************************  Ingresando Informacion -> Desde la consola
    // Estudiante estudiante1 = new Estudiante(
    //     null,null,
    //     0,null,null,null
    // );

    // actualizando un objeto
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
    // estudiante1.mostrarDatosEstudiante();
    // ************************** FIN Ingresando Informacion -> Desde la consola


    // **************************  Ingresando Informacion -> forma Manual
    // Inicializando un objeto con informacion
    // Estudiante estudiante1 = new Estudiante(
    // "0704199901025", 
    // "Melvin Sevilla",
    // 26,
    // "Masculino",
    // "20172500020" ,
    // "Informatica");

    // Persona persona = new Persona("121231","Melvin",12,"Masculino");        
    // System.out.println("\nDatos de Persona: "
    // +"\nDNI: "+persona.getDni()
    // +"\nNombre: "+persona.getNombre()
    // +"\nEdad: : "+persona.getEdad()
    // +"\nSexo: "+persona.getSexo());
    // **************************  Ingresando Informacion -> forma Manual
        
    


    // **************************  Polimorfismo

    Vector<Persona> personasVector = new Vector<Persona>(5);

    personasVector.add(new Estudiante("704199901067", "Melvin",26, 
    "M", "20172500020" ,"Informatica"));

    personasVector.add(new Empleado("0703195265325", "Henry",52,
    "M", 10026, "Administrador"));

    personasVector.add(new Empleado("070419995254", "Leonor",39,
    "F", 10026, "Vendedor"));


    //  obtencion de un dato en especifico
    System.out.println( personasVector.get(2).getDni());


    // Sumar las edades de todos
    // Sumar las edades de solo los Estudiantes
    // Sumar las edades de solo los Empleados
    // Cuantos estuadiantes y Cuantos empleados hay en el vector

    // Imprimir el siguiente formato
    // ######### Lista de las Personas ########
    // 1. Melvin tiene 26 años y estudia Informatica
    // 2. Henry tiene 52 años y trabaja de Administrador
    // 3. Leonor tiene 39 años y trabaja de Vendedor

    int sumaEdades = 0;
    int sumaEdadesEstudiantes = 0;
    int sumaEdadesEmpleados = 0;
    int contadorEstudiantes = 0;
    int contadorEmpleados = 0;
    int index = 0;

    System.out.println("######### Lista de las Personas ########");
    for(Persona persona : personasVector){
        index++;
        sumaEdades += persona.getEdad();
        if(persona instanceof Estudiante){
            System.out.println(index + ". " + persona.getNombre() + " tiene " + persona.getEdad() + 
            " años y estudia "+ ((Estudiante) persona).getCarrera());
            sumaEdadesEstudiantes += persona.getEdad(); 
            contadorEstudiantes++;
        }
        if(persona instanceof Empleado){
              System.out.println(index + ". " + persona.getNombre() + " tiene " + persona.getEdad() + 
            " años y trabaja de "+ ((Empleado) persona).getCargo());
            sumaEdadesEmpleados += persona.getEdad();
            contadorEmpleados++;
        }
    }
    System.out.println("\nSuma de edades de todos: "+sumaEdades);
    System.out.println("Suma de edades de Estudiantes: "+sumaEdadesEstudiantes);
    System.out.println("Suma de edades de Empleados: "+sumaEdadesEmpleados);
    System.out.println("Cantidad de Estudiantes: "+contadorEstudiantes);
    System.out.println("Cantidad de Empleados: "+contadorEmpleados);

    





    

    // ************************** FIN Polimorfismo


}