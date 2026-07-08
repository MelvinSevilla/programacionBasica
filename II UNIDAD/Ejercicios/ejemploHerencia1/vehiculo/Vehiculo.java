package vehiculo;

public abstract class Vehiculo {
 
    String nPlaca;
    String duenio;
    String marca;
    int anio;

    public Vehiculo(String nPlaca, String duenio, String marca, int anio) {
        this.nPlaca = nPlaca;
        this.duenio = duenio;
        this.marca = marca;
        this.anio = anio;
    }

    public String getnPlaca() {
        return nPlaca;
    }
    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }

    public String getDuenio() {
        return duenio;
    }
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public abstract double calculosubsidio(double info);

    public void mostrarInformacion() {
        System.out.println("Placa: " + nPlaca);
        System.out.println("Dueño: " + duenio);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
    }

}