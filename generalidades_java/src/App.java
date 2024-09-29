public class App {
    public static void main(String[] args) throws Exception {

        // Use the SOPL
        System.out.println("Bienvenido(a) a screen match!");
        System.out.println("Película: Matrix");
        // Types of datas primitives, reference and compose
        // Text block
        String lorem = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer imperdiet blandit orci eu ultricies. Vestibulum porttitor mi nisi, et elementum ipsum euismod id. Fusce ut lectus id nibh posuere feugiat at eu mauris. Donec ut facilisis ante, ac tempus odio. Praesent non magna sit amet ex dignissim varius in eget sem.
                        """;
        int fechaDeLazamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDePelicula = 8.2;
        String[] date = { "cama", "jota" };
        char letra = 'o';
        double media = (8.2 + 6.0 + 9.0) / 3;
        //Casting 
        int clasificacion = (int) (media / 2);

        System.out.println(lorem + "fecha de lanzamiento: " + fechaDeLazamiento);
        System.out.println(clasificacion);

    }
}
