import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<Carro> lista=new java.util.LinkedList<Carro>();
        lista.add(new Carro(1, "Ferrari", 2010));
        lista.add(new Carro(2, "Lamborgini", 2010));
        lista.add(new Carro(3, "Subaru", 2024));
        lista.add(new Carro(4, "Mercedez", 2021));
        lista.add(new Carro(5, "BMW", 2011));
        lista.add(new Carro(6, "Mustang", 1999));

        int finLista=lista.size();

        lista.add(finLista, new Carro(6,"Aston Martin",2025));

        System.out.println("------------------------LinkedList-----------------------------");
        for (Carro car : lista) {
            System.out.println("Carros: " + car.getMarca());
        }


        
    }
    
}
