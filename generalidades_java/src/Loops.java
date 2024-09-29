import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double nota = 0;
        int i;
        double mediaEvaluaciones = 0;

        for (i = 0; i < 3; i++) {
            System.out.println("Escribe la nota de la pelí");
            nota = lectura.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println(mediaEvaluaciones / 10);
    }
}
