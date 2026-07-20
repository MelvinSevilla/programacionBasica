package vehiculo;

import java.util.Scanner;
import java.util.Vector;

public class VehiculoMain {
 
    public static void main() {

        Vector<Vehiculo> vehiculos = new Vector<>(5);
        vehiculos.add(new Taxi("HCD 4554", "Erling", "Honda", 2015, 15000));
        vehiculos.add(new Taxi("HCD 1221", "Kiliam", "Toyota", 2012, 12500));
        vehiculos.add(new Bus("HCD 4578", "Lionel", "BlueBird", 1998, 150));
        vehiculos.add(new Bus("HCD 4585", "Harry", "Mercedez", 2000, 160));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el porcentaje de subsidio para los taxistas: ");        
        double porcentajeSubsidioGasolina =  scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Ingrese el bono de viaje para los buses: ");        
        double bonoViajeBus =  scanner.nextDouble();
        scanner.nextLine(); 
        scanner.close();


        double totalSubsidioTaxi = 0;
        double totalSubsidioBus = 0;
        double totalSubsidio = 0;

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\nInformación del vehículo:");
            vehiculo.mostrarInformacion();

            if (vehiculo instanceof Taxi) {
                double subsidioTaxi = vehiculo.calculosubsidio(porcentajeSubsidioGasolina);
                System.out.println("Subsidio del Taxi: " + subsidioTaxi);
                totalSubsidioTaxi += subsidioTaxi;
                totalSubsidio += subsidioTaxi;
            } else if (vehiculo instanceof Bus) {
                double subsidioBus = vehiculo.calculosubsidio(bonoViajeBus);
                System.out.println("Subsidio del Bus: " + subsidioBus);
                totalSubsidioBus += subsidioBus;
                totalSubsidio += subsidioBus;
            }
        }

        System.out.println("\nTotal subsidio para taxistas: " + totalSubsidioTaxi);
        System.out.println("Total subsidio para buses: " + totalSubsidioBus);
        System.out.println("Total subsidio: " + totalSubsidio);
    }

}