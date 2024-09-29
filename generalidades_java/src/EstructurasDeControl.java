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

        String bebida = "Vino";

        switch (bebida) {
            case "Café":
                System.out.println("Buena elección");
                break;
            case "Tea":
                System.out.println("No tan Buena eleccción");
                break;
            case "Agua":
                System.out.println("Buena eleccción para hidratar, pero mejor el café");
                break;
            case "Mate":
                System.out.println("No he probado pero igual y no sabe bien");
                break;
            case "Vino":
                int edadBebida = 22;
                if (edadBebida > 20) {
                    System.out.println("Buena eleccción, pero eres viejo");
                    break;
                } else {
                    System.out.println("No salgas con mamadas mary jane");
                    break;
                }
            case "Cerveza":
                int edadBebidaC = 19;
                if (edadBebidaC > 20) {
                    System.out.println("Buena eleccción, pero no me prendas eso jaja");
                    break;
                } else {
                    System.out.println("No salgas con mamadas mary jane");
                    break;
                }

            default:
                break;
        }

    }

}
