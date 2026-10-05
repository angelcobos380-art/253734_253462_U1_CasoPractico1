import java.util.Scanner;
import java.util.InputMismatchException;

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

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        System.out.println("====================== CARTELERA DE CINEUP ======================== ");
        System.out.println("Disfruta de nuestra gran Variedad de Peliculas ");

        do {
            try {
                System.out.println("\n¿Deseas visualizar nuestra cartelera disponible para hoy? 1.Si 0.No");
                System.out.print("Elige una opcion: ");
                opcion = sc.nextInt();

                if (opcion == 1) {
                    cartelera.mostrarCartelera();

                    System.out.print("¿Te intereso alguna pelicula? ¿Deseas ver detalles de alguna? (1 = si, 0 = no): ");
                    int respuesta = sc.nextInt();

                    if (respuesta == 1) {
                        System.out.print("Ingrese el numero que tiene asignado la pelicula: ");
                        int posicion = sc.nextInt();
                        cartelera.mostrarDetalles(posicion);
                    } else if (respuesta != 0) {
                        System.out.println("Opcion no valida, intenta de nuevo.");
                    }
                } else if (opcion != 0) {
                    System.out.println("Opcion no valida, intenta de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un numero entero, no letras o caracteres.");
                sc.nextLine(); 
            }

        } while (opcion != 0);

        System.out.println("Gracias por visitar CineUp");
        sc.close();
    }
}