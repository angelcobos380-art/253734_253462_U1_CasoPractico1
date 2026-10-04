public class Cartelera {
    private Pelicula[] listaPeliculas;

    public Cartelera(Pelicula[] listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public void mostrarCartelera(){

        System.out.println("====================== CARTELERA DE CINEUP ======================== ");
        System.out.println(" Disfruta de nuestra gran Variedad de Peliculas ");

        for (int i = 0; i < listaPeliculas.length; i++) {
        System.out.printf("Pelicula %d: %s | Genero: %s%n",
        i + 1, listaPeliculas[i].getTitulo(), listaPeliculas[i].getGenero());
}
    }
}
