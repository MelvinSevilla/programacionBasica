//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Crea el registro de pasajeros a bordo e ingresa los nombres de los que van llegando a la puerta: "Alejandro", "Sofía", "Carlos" y "Lucía".
//            Un familiar se comunica con la aerolínea con urgencia para confirmar el estado de un pasajero.
//            Programa el sistema para responder las siguientes preguntas de forma automatizada:
    Vector<String> lista = new Vector<>(10);
    lista.add("Alejandro");
    lista.add("Sofía");
    lista.add("Carlos");
    lista.add("Lucía");

    System.out.println(lista);



//¿Se encuentra "Carlos" dentro de la lista de pasajeros a bordo? Si la respuesta es afirmativa,
// averigua e imprime el número exacto de asiento (índice de posición) donde está sentado.

    System.out.println("Esta Carlos en el avion?");
    if(lista.contains("Carlos")){
        System.out.println("Carlos esta en el asiento: "+ lista.indexOf("Carlos")+"\n\n");
    }


//¿Se encuentra "Mariana" a bordo? Si no se encuentra, despliega un mensaje de alerta.
    System.out.println("Esta Mariana en el avion?");
    if(lista.contains("Mariana")){
        System.out.println("Mariana esta en el asiento: "+ lista.indexOf("Carlos"));
    }else{
        System.out.println("Mariana NO ESTA EN EL AVION\n\n");
    }

//    Reporte del Capitán: Antes de despegar, el piloto solicita la lista completa de pasajeros con un formato limpio y simplificado.
    System.out.println("Los Pasajeros abordo son:");
    int contador = 1;
    for (String elemento:lista){
        System.out.println(contador+". "+elemento);
        contador++;
    }
}
