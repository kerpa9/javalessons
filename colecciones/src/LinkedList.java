import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<Carro> lista = new java.util.LinkedList<Carro>();
        lista.add(new Carro(1, "Ferrari", 2010));
        lista.add(new Carro(2, "Lamborgini", 2010));
        lista.add(new Carro(3, "Subaru", 2024));
        lista.add(new Carro(4, "Mercedez", 2021));
        lista.add(new Carro(5, "BMW", 2011));
        lista.add(new Carro(6, "Mustang", 1999));

        int finLista = lista.size();

        lista.add(finLista, new Carro(6, "Aston Martin", 2025));

        System.out.println("------------------------LinkedList-----------------------------");
        for (Carro car : lista) {
            System.out.println("Carros: " + car.getMarca());
        }

        // Remove

        String nombreCarro = "Mustang";
        for (Carro carro2 : lista) {
            if (carro2.getMarca().equals(nombreCarro)) {
                lista.remove(carro2);
                break;
            }
        }

        System.out.println("------------------------Uso del Remove LinkedList-----------------------------");
        for (Carro car : lista) {
            System.out.println("Carros: " + car.getMarca());
        }


        //Metodos LinkedList
        System.out.println( "--------------Tamaño de lista--------------------");
        System.out.println( "El tamaño de la LinkedList es: "+ lista.size());

        System.out.println( "--------------Entrega el primer y ultimo dato--------------------");
        System.out.println( "Primer dato LinkedList es: "+ lista.getFirst().toString());
        System.out.println( "Último dato LinkedList es: "+ lista.getLast().toString());

        System.out.println( "--------------Borrar toda la lista--------------------");
        System.out.println( "Lista eliminada: ");
        // lista.clear();
        System.out.println( "--------------¿Está vacía la lista?--------------------");
        System.out.println( "¿Lista vacia?: "+ lista.isEmpty());



    }

}
