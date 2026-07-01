package persona;

public final class Empleado extends Persona {
    
     double salario;
     String cargo;


    public Empleado(String dni, String nombre, int edad, String sexo,
        double salario, String cargo) {
        super(dni, nombre, edad, sexo);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void metodoAbstracto(){
        System.out.println("Dentro de metodo abstracto estudiante");
    }

}