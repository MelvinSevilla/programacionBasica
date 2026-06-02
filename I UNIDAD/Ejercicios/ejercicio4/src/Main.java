//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Vector<String> bodegaA = new Vector<>(5);

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresando Productos a la bodega...");

    int ingresando = 1;

    while (ingresando == 1){
        if(bodegaA.isEmpty()){
            System.out.println("********** ALERTA: La bodega esta completamente vacia *********");
        }

        System.out.println("Ingresa el nombre de un contenedor:");
        String contenedor = teclado.nextLine();
        bodegaA.add(contenedor);

        System.out.println("1: Para continuar      2: para salir");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        if (opcion != 1){
            ingresando = 0;
        }

        if (bodegaA.size() == 5){
            ingresando = 0;
            System.out.println("ERROR: Capacidad máxima alcanzada. Compuertas bloqueadas.");
        }
    }
    System.out.println(bodegaA);

}
