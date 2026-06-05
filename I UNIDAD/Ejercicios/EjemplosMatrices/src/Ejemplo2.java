import java.util.List;
import java.util.Vector;

public class Ejemplo2 {

    public static void main(String[] args) {

        Vector<Vector<String>> pasajeros = new Vector<>(10);

        pasajeros.add(new Vector<>(List.of("TK-401","Carlos Mendoza","Aprobado")));
        pasajeros.add(new Vector<>(List.of("TK-402","Elena Ruiz","Bajo Revisión")));
        pasajeros.add(new Vector<>(List.of("TK-403","Carlos Duarte","Aprobado")));

        int encontrado = 0;

        for (int i = 0; i < pasajeros.size(); i++){
            if (pasajeros.get(i).contains("Luis Duarte")){
                encontrado = 1;
                System.out.println("El equipaje de Luis Duarte esta en la fila "+i);
                System.out.println("El estado actual de su filtro es: "+pasajeros.get(i).get(2));
            }
        }

        if (encontrado == 0){
            System.out.println("Pasajero limpio");
        }

    }

}
