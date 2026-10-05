public class Cartelera {
    private Pelicula[] listaPeliculas;

    public Cartelera(Pelicula[] listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public void mostrarCartelera(){
        
            for (int i = 0; i < listaPeliculas.length; i++) {
            System.out.printf("Pelicula %d: %s | Genero: %s%n",
            i + 1, listaPeliculas[i].getTitulo(), listaPeliculas[i].getGenero());
            }
        }

    public Pelicula getPelicula(int posicion) {
        if (posicion >= 1 && posicion <= listaPeliculas.length) {
            return listaPeliculas[posicion - 1];
        } else {
            return null;
        }
    }

    public void mostrarDetalles(int posicion) {
        Pelicula pelicula = getPelicula(posicion);

        if (pelicula != null) {
            System.out.println("============= DETALLES ============");
            System.out.println("Titulo: " + pelicula.getTitulo());
            System.out.println("Duracion: " + pelicula.getDuracion() + " minutos");
            System.out.println("Genero: " + pelicula.getGenero());
            System.out.println("Director: " + pelicula.getDirector().getNombre());
            System.out.println("Pais de Origen: " + pelicula.getDirector().getPais());
        } else {
            System.out.println("Esa pelicula no existe, revisa el numero.");
        }
    }
}
