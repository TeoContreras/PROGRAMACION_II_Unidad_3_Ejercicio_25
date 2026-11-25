public class Libro extends MaterialBiblioteca {
    private int cantidadPaginas;
    private String autor;
    public Libro(String titulo, int anio, String editorial, int paginas, String autor) {
        super(titulo, anio, editorial); cantidadPaginas = paginas; this.autor = autor;
    }
    @Override
    public void mostrarCatalogo() { super.mostrarCatalogo(); System.out.println("Autor: " + autor + " - Paginas: " + cantidadPaginas); }
}