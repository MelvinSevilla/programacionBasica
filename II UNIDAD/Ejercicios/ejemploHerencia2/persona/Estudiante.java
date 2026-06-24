package persona;

public class Estudiante extends Persona {

    String numeroCuenta;
    String carrera;

    public Estudiante(String dni, String nombre, int edad, String sexo,
        String numeroCuenta, String carrera
    ){
        super( dni,  nombre,  edad,  sexo);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    // metodo personalizado para estudiante
    public void mostrarDatosEstudiante(){
        super.mostrarDatosPersona();
         System.out.println(
        "Numero Cuenta: "+numeroCuenta
        +"\nCarrera: "+carrera);
    }
    
}
