public class App {
    public static void main(String[] args) throws Exception {

        enum Nombres{
            Juna, Jose, Jenny
        }

        for (Nombres nombre:Nombres.values()){
            System.out.println("El nombre es " + nombre);
        }

    }
}
