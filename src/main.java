public class main {
    public static void main(String[] args) {
        MaterialBiblioteca[] materiales = new MaterialBiblioteca[2];
        materiales[0] = new Libro("El Principito", 1943, "Salamandra", 96, "Antoine de Saint-Exupery");
        materiales[1] = new Revista("Ciencia Hoy", 2024, "Editorial Ciencia", 120, "Mayo");
        for (int i = 0; i < materiales.length; i++) materiales[i].mostrarCatalogo();
    }
}