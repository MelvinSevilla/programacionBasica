package persona;

public class Persona {
    
    private String dni;
    private String nombre;
    private int edad;
    private String sexo;

    public Persona(String dni, String nombre, int edad, String sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    // metodo personalizado
    public void mostrarDatosPersona() {
        // System.out.println("Datos de la persona son: ");
        // System.out.println("DNI: " + dni);
        // System.out.println("Nombre: " + nombre);
        // System.out.println("Edad: " + edad);
        // System.out.println("Sexo: " + sexo);
        
        System.out.println("\nDatos de la persona son: "
        +"\nDNI: "+dni
        +"\nNombre: "+nombre
        +"\nEdad: : "+edad
        +"\nSexo: "+sexo);
        
    }





}