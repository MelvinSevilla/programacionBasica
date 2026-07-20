package vehiculo;

public final class Taxi  extends Vehiculo {
    
    int gasolinaUsada;

    public Taxi(String nPlaca, String duenio, String marca, int anio, int gasolinaUsada) {
        super(nPlaca, duenio, marca, anio);
        this.gasolinaUsada = gasolinaUsada;
    }

    public int getGasolinaUsada() {
        return gasolinaUsada;
    }
    public void setGasolinaUsada(int gasolinaUsada) {
        this.gasolinaUsada = gasolinaUsada;
    }

    @Override
    public double calculosubsidio(double info) {
        return this.gasolinaUsada * (info/100); 
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Gasolina usada: " + gasolinaUsada);
    }
    
}
