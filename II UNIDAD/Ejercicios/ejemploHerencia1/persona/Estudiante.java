package persona;

public class Estudiante extends Persona {

    String numeroCuenta;
    String carrera;

    public Estudiante(String dni, String nombre, String edad, String sexo,
        String numeroCuenta, String carrera
    ){
        super( dni,  nombre,  edad,  sexo);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }
    
}
