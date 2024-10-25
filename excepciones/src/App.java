public class App {
    public static void main(String[] args) throws Exception {
        int numeros[] = { 1, 2, 3, 4, 5 };

        try {
            // int resultado = 3 / 0;
            System.out.println("Entregame la posición de numeros 6 del array"+ numeros[5]);

        } catch (Exception error) {
            // System.out.println("No te sirvio el paso por la universidad");
            System.out.println("El indice no existe");
        }
    }
}
