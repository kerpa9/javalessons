public class App {
    public static void main(String[] args) throws Exception {

        Circulo circulo = new Circulo(20);
        Rectangulo rectangulo = new Rectangulo(10, 20);

        circulo.imprimirInfo();
        // rectangulo.imprimirInfo();

        System.out.println("Área del circulo " + circulo.calcularArea());
        System.out.println("Área del rectangulo " + rectangulo.calcularArea());

    }
}
