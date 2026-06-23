void main() {

    // Creando objeto 1 de tipo Empresa, con Contructor Vacio
    Empresa empresa1 = new Empresa();
    // Creando objeto 2 de tipo Empresa, con Contructor con Parametros
    Empresa empresa2 = new Empresa("Sula",false,2);

    // asignar valores a los atributos del objeto vacio
    empresa1.setNombre("CocaCola");
    empresa1.setCantidadSucursales(10);
    empresa1.setContadorPrivado(true);


    empresa1.mostrarInformacion();
    System.out.println();
    empresa2.mostrarInformacion();



}