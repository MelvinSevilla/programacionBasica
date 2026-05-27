void main() {
// --------- Clase 1
//    Vector<String> vectorNombre = new Vector<>(3);
//    System.out.println(vectorNombre);
//    vectorNombre.add("Primero");
//    vectorNombre.add("Segundo");
//    vectorNombre.add("Tercero");
//    vectorNombre.add("Cuarto");
//    System.out.println("la capacidad del vector es igual a: " + vectorNombre.capacity());
//
//    System.out.println(vectorNombre);
//
//    for (int i = 0; i < 4; i++) {
//        System.out.println(vectorNombre.get(i));
//    }


// --------- Clase 2
// *************** Gestión de Turnos Bancarios *************
//    Estructura: Crear almacenamiento dinámico para clientes.

    //variables
    Vector<String> filaVector = new Vector<>(5);
    Scanner teclado = new Scanner(System.in);
    int ingresando = 0;

    filaVector.add("Melvin");
    filaVector.add("David");
    filaVector.add("Lunin");


    System.out.println(" =========  Ingreso de la lista de Clientes: =========== \n");

    while(ingresando == 1){
        System.out.println("Ingresa el nombre del cliente:");
        String nombre = teclado.nextLine();
        filaVector.add(nombre);


        System.out.println("Desea ingresar otro cliente?,   1:Si  o   0:No");
        int opcion = teclado.nextInt();
        teclado.nextLine(); // para limpiar el buffer

        if (opcion == 1){
            ingresando = 1;
        }else{
            ingresando = 0;
        }

    }

    teclado.close();


/**/
//    Prioridad: Insertar adultos mayores al inicio de la fila sin borrar el resto.
    System.out.println("Suponga que llega Porfirio, adulto mayor, ingreselo con priodidad;");
    filaVector.add(0,"Porfirio");


//   PRACTIQUE
//    Reporte: Identificar de inmediato al siguiente y al último cliente.
    System.out.println("");
    System.out.println("");
    System.out.println("El siguiente en pasar a la ventanilla sera:");
    System.out.println(filaVector.firstElement());
    System.out.println("");
    System.out.println("El ultimo en pasar a la ventanilla sera:");
    System.out.println(filaVector.lastElement());



//    Atención: Ciclo iterativo que atiende uno a uno desde el inicio.

    System.out.println("\n\n###########Atencion de la ventanilla  1 ###########");

    while (!filaVector.isEmpty()){
        System.out.println("Por favor pase "+filaVector.get(0)+" a la ventanilla 1 \n");
        filaVector.remove(0);
    }

    if (filaVector.isEmpty()){
        System.out.println("\n########### La fila esta vacia ###########");
    }



//    Rezago: Lista dinámica de personas que llegaron tarde para el siguiente día.






    System.out.println(filaVector);
    System.out.println("-------------FINAL DEL PROGRAMA------------");
}
