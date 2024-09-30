public class Loops {
    public static void main(String[] args) {
        // Bucle FOR
        int i, j, k;

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                for (k = 1; k <= 3; k++) {

                    // System.out.print(" i: " + i);
                    // System.out.println(" j: " + j);
                    // System.out.println(" k: " + k);
                }

            }
        }

        // Buble WHILE

        int index = 10;

        while (index < 20) {

            index++;
            // System.out.println(index);

        }

        // Buble DO WHILE

        int index2 = 6;
        do {
            System.out.println("Antes");
            System.out.println(index2);

            index2++;
        } while (index2 <= 10);
    }

}
