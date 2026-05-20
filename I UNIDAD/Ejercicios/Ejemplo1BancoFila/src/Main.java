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
    int ingresando = 1;


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



//    Prioridad: Insertar adultos mayores al inicio de la fila sin borrar el resto.
    System.out.println("Suponga que llega Porfirio, adulto mayor, ingreselo con priodidad;");
    filaVector.add(0,"Porfirio");


// PRACTIQUE
//    Reporte: Identificar de inmediato al siguiente y al último cliente.
//    Atención: Ciclo iterativo que atiende uno a uno desde el inicio.
//    Rezago: Lista dinámica de personas que llegaron tarde para el siguiente día.






    System.out.println(filaVector);
    System.out.println("-------------FINAL DEL PROGRAMA------------");
}
