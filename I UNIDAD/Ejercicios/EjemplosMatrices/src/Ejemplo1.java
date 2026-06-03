import java.util.List;
import java.util.Vector;

public class Ejemplo1 {
     public static void main(String[] args) {
         // inicializar el vector
         Vector<Vector<Object>> platillos = new Vector<>(10);


         // llenar la matriz con filas
         platillos.add(new Vector<>(List.of("Hamburguesa", 155.40)));
         platillos.add(new Vector<>(List.of("Papas Fritas", 60.25)));
         platillos.add(new Vector<>(List.of("Refresco", 32.50)));

         System.out.println("Menu Inicial");
         System.out.println(platillos);


         // actualizacion de precio
         platillos.get(1).set(1,68.00);

        //eliminacion de un platillo/fila
         platillos.remove(0);

         // imprimir el menu final
        // 1. Papas Fritas ---->  L.68.00
        // 2. Papas Refresco ---->  L.32.50

         System.out.println("\n\nMenu Final:");

         for ( int i = 0; i < platillos.size(); i++){
             System.out.println((i+1) + ". "+platillos.get(i).get(0) +
                     " ---->  L." +platillos.get(i).get(1));
         }









    }
}
