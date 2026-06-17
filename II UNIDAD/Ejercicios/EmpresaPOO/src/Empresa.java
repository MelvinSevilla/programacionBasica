public class Empresa {

    // Atributos
    String nombre;
    int cantidadSucursales;
    boolean contadorPrivado;

    // Constructores de la clase

    // Constructor Vacio
    public Empresa() {

    }

    // Constructor Con Parametros
    public Empresa(String nombre, boolean contadorPrivado, int cantidadSucursales) {
        this.nombre = nombre;
        this.contadorPrivado = contadorPrivado;
        this.cantidadSucursales = cantidadSucursales;
    }


    // metodos Getters y Setters, de cada Atributo
    public int getCantidadSucursales() {
        return cantidadSucursales;
    }

    public void setCantidadSucursales(int cantidadSucursales) {
        this.cantidadSucursales = cantidadSucursales;
    }

    public boolean isContadorPrivado() {
        return contadorPrivado;
    }

    public void setContadorPrivado(boolean contadorPrivado) {
        this.contadorPrivado = contadorPrivado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo Personalizado
    public void mostrarInformacion() {
        System.out.println("Esta es la informacion de la Empresa");
    }

}