import java.util.List;
import java.util.Vector;

public class Ejemplo3 {

    public static void main(String[] args) {

        Vector<Vector<Object>> calificaciones = new Vector<>(10);
        calificaciones.add(new Vector<>(List.of("Ana Ortiz", 55.4, 25.3)));
        calificaciones.add(new Vector<>(List.of("Pedro Gómez", 40.2, 24.5)));

        double sumatoriaFinales = 0;
        System.out.println("Notas Finales de los alumnos:");
        for (int i = 0;i < calificaciones.size(); i++ ){
            double acumulado = (double) calificaciones.get(i).get(1);
            double examen = (double) calificaciones.get(i).get(2);
            double promedio = Math.round(acumulado + examen);
            calificaciones.get(i).add(promedio);

            sumatoriaFinales = sumatoriaFinales + promedio;
            System.out.println((i+1)+". "+calificaciones.get(i).get(0)+": "+calificaciones.get(i).get(3));
        }
        

        double promedioclase = sumatoriaFinales/ calificaciones.size();
//        System.out.println("Notas Finales de los alumnos: \n");
//        for (int i = 0; i < calificaciones.size(); i++) {
//            System.out.println((i+1)+". "+calificaciones.get(i).get(0)+": "+calificaciones.get(i).get(3));
//        }
        System.out.println("\nEl promedio de la clase es: "+promedioclase);


    }
}
