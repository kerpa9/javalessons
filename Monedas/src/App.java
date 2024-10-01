import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String texto = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        String cuenta = "Corriente";
        String cliente = "Tony Stark";

        int opcion1 = 0;
        double saldo = 1599.99;

        while (opcion1 != 9) {
            System.out.println("********************************************");
            System.out.println("Nombre del cliente: " + cliente);
            System.out.println("Tipo de cuenta: " + cuenta);
            System.out.println("Saldo disponible: " + "$" + saldo);
            System.out.println("");
            System.out.println("********************************************");
            System.out.println(texto);
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:

                    System.out.print("Elige el monto a retirar: ");
                    double monto = scanner.nextDouble();
                    if (monto < saldo && monto > 0) {
                        double total = saldo - monto;
                        saldo = total;
                        System.out.println("Saldo actual: " + "$" + total);

                    } else {
                        System.out.println("Ingresaste un valor no disponible: " + "$" + saldo);
                    }

                    break;
                case 3:
                    System.out.print("Elige el monto a depositar: ");
                    double monto2 = scanner.nextDouble();
                    if (monto2 > 0) {
                        double total2 = saldo + monto2;
                        saldo = total2;
                        System.out.println("Saldo actual :" + total2);

                    } else {
                        System.out.println("El monto a depositar debe ser mayor a cero $");
                    }

                    break;

                default:
                    System.out.println("Buen día");
                    break;
            }
            // saldo=total;
            opcion1 = opcion;

        }

    }
}
