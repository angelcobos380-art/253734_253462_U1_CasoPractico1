public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private Director director; 

    public Pelicula(String titulo, String genero, int duracion, Director director) { 
        this.titulo = titulo;    
        this.genero = genero;    
        this.duracion = duracion;
        this.director = director;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public Director getDirector() {
        return director;
    }
}
