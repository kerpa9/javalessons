import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("pelicula de tipo ");
        String pelicula=lectura.nextLine();
        System.out.println("ahora escribe fecha");
        int fechaLanzamiento=lectura.nextInt();
        System.out.println("Ultimo que nota le das ala pelicula");
        double nota=lectura.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaLanzamiento);
        System.out.println(nota);
    }

}
