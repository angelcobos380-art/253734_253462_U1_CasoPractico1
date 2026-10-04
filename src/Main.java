public class Main {
        public static void main(String[] args) {

        Director director1 = new Director("David Green", "Estados Unidos");
        Director director2 = new Director("Zach Cregger", "Estados Unidos");
        Director director3 = new Director("Destin Cretton", "Estados Unidos");
        Director director4 = new Director("Anthonio Russo", "Estados Unidos");
        Director director5 = new Director("Christopher Nolan", "Inglaterra");

        Pelicula[] listaPeliculas = new Pelicula[5];
        listaPeliculas[0] = new Pelicula("Coyote vs Acme", "Comedia, Drama", 103, director1);
        listaPeliculas[1] = new Pelicula("Resident Evil: Noche Cero", "Terror, Accion", 94, director2);
        listaPeliculas[2] = new Pelicula("Spider-Man: Un Nuevo Día", "Aventura, Accion", 145, director3);
        listaPeliculas[3] = new Pelicula("Avengers: Doomsday", "Accion, Ciencia Ficcion", 165, director4);
        listaPeliculas[4] = new Pelicula("La Odisea", "Accion, Epica", 172, director5);

        

        Cartelera cartelera = new Cartelera(listaPeliculas);

        // System.out.println(listaPeliculas[0].getTitulo());
        // System.out.println(listaPeliculas[0].getDirector().getNombre());
        // System.out.println(listaPeliculas[4].getTitulo());
        // System.out.println(listaPeliculas[4].getDirector().getNombre());

        cartelera.mostrarCartelera();
    }
}

