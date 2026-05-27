//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


//    Inicializa el carrito de compras del usuario cargando los siguientes artículos en orden: "Laptop", "Mouse", "Teclado", "Mouse".
    Vector<String> carrito = new Vector<>(List.of(
            "Laptop", "Mouse", "Teclado", "Mouse"
    ));

//    El cliente revisa su presupuesto y decide hacer tres cambios de última hora:
//    Decide que la "Laptop" es muy costosa; reemplázala en su misma posición por una "Tablet".
    carrito.set(0,"Tablet");

//    Revisa su saldo y decide quitar el "Teclado”, asume que conoce la posicion de la lista
    carrito.remove(2);

//    Considera que dos mouses son un exceso. Pide al sistema remover un "Mouse"
//    buscando directamente por el nombre del artículo.
    carrito.remove("Mouse");

//      El Ticket de Compra:
    System.out.println("*******  Los articulos comprados por cliente son: ***********");
    int numeracion = 0;
    for (String elemento:carrito){
        numeracion ++;
        System.out.println( numeracion+". "+ elemento+".");
    }
    System.out.println("*******  GRACIAS POR SU COMPRA ***********");


}
