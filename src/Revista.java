public class Revista extends MaterialBiblioteca {
    private int numeroEdicion;
    private String mesPublicacion;
    public Revista(String titulo, int anio, String editorial, int numero, String mes) {
        super(titulo, anio, editorial); numeroEdicion = numero; mesPublicacion = mes;
    }
    @Override
    public void mostrarCatalogo() { super.mostrarCatalogo(); System.out.println("Edicion: " + numeroEdicion + " - Mes: " + mesPublicacion); }
}