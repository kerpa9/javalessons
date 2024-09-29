import java.util.Scanner;

public class EstructurasDeControl {
    public static void main(String[] args) {
        // Condicional IF ELSE

        int edad = 19;

        if (edad > 19) {
            // System.out.println("Ingresa ");
        } else {
            // System.out.println("Mejor no x");
        }
        // Control Condicional SWITCH

        Scanner scanner = new Scanner(System.in);

        String descripcion = """
                Bienvenido a la maquina de bebidas
                Elige una opción:
                1. Café
                2. Tea
                3. Agua
                4. Mate
                5. Vino
                6. Cerveza
                """;
        System.out.println(descripcion);

        int bebida = scanner.nextInt();

        switch (bebida) {
            case 1:
                System.out.println("Buena elección, Café");
                break;
            case 2:
                System.out.println("No tan Buena eleccción, Tea");
                break;
            case 3:
                System.out.println("Buena eleccción para hidratar, pero mejor el café, Agua");
                break;
            case 4:
                System.out.println("No he probado pero igual y no sabe bien, Mate");
                break;
            case 5:
                int edadBebida = 22;
                if (edadBebida > 20) {
                    System.out.println("Buena eleccción, pero eres viejo, Vino");
                    break;
                } else {
                    System.out.println("No salgas con mamadas mary jane, Primero limpia bien tu yiyopo");
                    break;
                }
            case 6:
                int edadBebidaC = 19;
                if (edadBebidaC > 20) {
                    System.out.println("Buena eleccción, pero no me prendas eso jaja");
                    break;
                } else {
                    System.out.println("No salgas con mamadas mary jane, Cerveza");
                    break;
                }

            default:
                System.out.println("Fin ...");
                break;
        }

        System.out.println("Distruta");
        scanner.close();

    }

}
