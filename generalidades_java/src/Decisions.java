public class Decisions {

    public static void main(String[] args) {

        int fechaDeLazamiento = 2024;
        boolean incluidoEnElPlan = false;
        double notaDePelicula = 8.2;
        String plan="plus";

        if (fechaDeLazamiento > 2020) {

            System.out.println("Pélicula bien popular");

        } else {
            System.out.println("Pélicula retro");

        }if (incluidoEnElPlan && plan.equals("plus")){
            System.out.println("Disfruta");
        }else{
            System.out.println("No disponible");
        }
    }
}
