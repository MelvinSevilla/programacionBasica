void main() {

    Vector<String> vectorNombre = new Vector<>(3);
    System.out.println(vectorNombre);
    vectorNombre.add("Primero");
    vectorNombre.add("Segundo");
    vectorNombre.add("Tercero");
    vectorNombre.add("Cuarto");
    System.out.println("la capacidad del vector es igual a: " + vectorNombre.capacity());

    System.out.println(vectorNombre);


    for (int i = 0; i < 4; i++) {
        System.out.println(vectorNombre.get(i));
    }
}
