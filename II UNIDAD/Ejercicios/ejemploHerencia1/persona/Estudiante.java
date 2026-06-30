package persona;

public final class Estudiante extends Persona {

    String numeroCuenta;
    String carrera;

    public Estudiante(String dni, String nombre, int edad, String sexo,
        String numeroCuenta, String carrera
    ){
        super( dni,  nombre,  edad,  sexo);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    } 
    
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    public String getCarrera(){
        return carrera;
    }

     public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    // metodo personalizado para estudiante
    public void mostrarDatosEstudiante(){
        super.mostrarDatosPersona("Estudiante");
         System.out.println(
        "Numero Cuenta: "+numeroCuenta
        +"\nCarrera: "+carrera);
    }

    public void metodoAbstracto(){
        System.out.println("Dentro de metodo abstracto estudiante");
    }

    @Override
    public void mostrarNada(){
        System.out.println("Dentro de metodo mostrarNada en clase Estudiante");
    
    }

    
 

    
}