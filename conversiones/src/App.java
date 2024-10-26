public class App {
    public static void main(String[] args) throws Exception {

        double num = 1.67;

        // Casteo a entero

        int numInt = (int) num;

        // Casteo a long
        Long numlong = (long) num;

        // Casteo
        String nombre = "Juan";
        String cantidad = "15";
        String precio = "150.23";
        
        // Parseo de String a Entero
        int cantEntero = Integer.parseInt(cantidad);
        
        // Parseo de String a double
        double precioDouble= Double.parseDouble(precio);
        System.out.println(precioDouble);
        
        //
        int cantidad1 = 15;
        double precio1 = 150.23;

        String cantString=String.valueOf(cantidad1);
        String precioString=String.valueOf(precio1);

        System.out.println( cantString);
    }
}
