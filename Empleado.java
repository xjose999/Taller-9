class Empleado extends Persona {
    String departamento;

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}