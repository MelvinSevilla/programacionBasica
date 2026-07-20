package vehiculo;

public final class Bus extends Vehiculo {
    
    int nViajes;

    public Bus(String nPlaca, String duenio, String marca, int anio, int nViajes) {
        super(nPlaca, duenio, marca, anio);
        this.nViajes = nViajes;
    }

    public int getNViajes() {
        return nViajes;
    }
    public void setNViajes(int nViajes) {
        this.nViajes = nViajes;
    }

    @Override
    public double calculosubsidio(double info) {
        return this.nViajes * info; 
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de viajes: " + nViajes);
    }

}
