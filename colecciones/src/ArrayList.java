import java.util.List;

public class ArrayList {
    public static void main(String[] args) throws Exception {

        List<Carro> lista = new java.util.ArrayList<Carro>();
        lista.add(new Carro(1, "Ferrari", 2010));
        lista.add(new Carro(2, "Lamborgini", 2010));
        lista.add(new Carro(3, "Subaru", 2024));
        lista.add(new Carro(4, "Mercedez", 2021));
        lista.add(new Carro(5, "BMW", 2011));

        // Recorrer por indice FOR
        System.out.println("-----------------FOR--------------------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Carros: " + lista.get(i).getMarca());
        }

        System.out.println("-----------------FOREACH--------------------------");

        // Recorrer por elemento FOREACH

        for (Carro car : lista) {
            System.out.println("Carros: " + car.getMarca());
        }
    }
}