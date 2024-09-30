public class Arreglos {
    public static void main(String[] args) {
        // Arreglos: Los arreglos es un tipo de dato el cual tiene una poscisión
        // especifica en memoria

        // Instancia para definir un arreglo de 5 elementos definición uno
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 3;
        numeros[3] = 10;
        numeros[4] = 13;

        // System.out.println(numeros.length);
        // Definicio´n dos

        int[] numeros1 = { 1, 1, 3, 10, 13 };

        for (int i = 0; i <= numeros1.length; i++) {
            // System.out.println("Arreglo: " + numeros1[i]);
        }

        //Uso de loop para arreglos forEach

        for (int numero : numeros1) {
            // System.out.println(numero);
        }
    }

}
