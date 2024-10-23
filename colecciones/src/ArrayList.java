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

        // Valor n
        System.out.println("Valor 0: " + lista.get(0).getMarca());

        //Remove si se sabe la posición del dato
        
        System.out.println( "--------------USO DEL REMOVE--------------------");
        lista.remove(0);
        for (Carro car : lista) {
            System.out.println("Carros: " + car.getMarca());
        }
        
        //Metodos ArrayList
        System.out.println( "--------------Tamaño de lista--------------------");
        System.out.println( "El tamaño de la ArrayList es: "+ lista.size());
        System.out.println( "--------------Borrar toda la lista--------------------");
        System.out.println( "Lista eliminada: ");
        // lista.clear();
        System.out.println( "--------------¿Está vacía la lista?--------------------");
        System.out.println( "¿Lista vacia?: "+ lista.isEmpty());






    }
}
