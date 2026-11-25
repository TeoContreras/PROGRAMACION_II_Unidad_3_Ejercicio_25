public class MaterialBiblioteca {
    protected String titulo, editorial;
    protected int anioEdicion;
    public MaterialBiblioteca(String titulo, int anio, String editorial) {
        this.titulo = titulo; anioEdicion = anio; this.editorial = editorial;
    }
    public void mostrarCatalogo() {
        System.out.println(titulo + " - " + anioEdicion + " - " + editorial);
    }
}