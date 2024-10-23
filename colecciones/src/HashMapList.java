import java.util.HashMap;
import java.util.Map;

public class HashMapList {
    public static void main(String[] args) {
        Map<Integer, String> mapaCarros = new HashMap<>();

        mapaCarros.put(1, "Mustang");
        mapaCarros.put(2, "Bugatti");
        mapaCarros.put(3, "Corvette");
        mapaCarros.put(4, "AMG");
        mapaCarros.put(5, "Aston Martin");
        mapaCarros.put(6, "BMW");
        mapaCarros.put(7, "Rimac");

        // Metodos
        boolean contain = mapaCarros.containsValue("Rimac");
        boolean containkey = mapaCarros.containsKey(10);
        // Valor
        if (contain) {
            System.out.println("Si contiene");
        } else {
            System.out.println("No exite");
        }
        // Llave
        if (containkey) {
            System.out.println("Si contiene");
        } else {
            System.out.println("No exite");
        }
        // Values .values() devuelve en un arreglo de valores
        System.out.println(mapaCarros.values());

        // Values .keySet() devuelve en un arreglo las claves
        System.out.println(mapaCarros.keySet());

        String marca = mapaCarros.get(2);
        System.out.println("Marca " + marca);


        //Remove
        mapaCarros.remove(1);
    }

}
