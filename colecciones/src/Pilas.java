import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacia " + pila);
        System.out.println("Pila vacia " + pila.empty());
        // Agregar datos
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(16);
        System.out.println("Pila " + pila);
        System.out.println("Pila " + pila.pop());
        System.out.println("Pila " + pila.pop());

        // Recorrer pila
        System.out.println("----------------Recorrer Pila---------------------");
        for (Integer pila1 : pila) {
            System.out.println(pila1);
        }

        // Preguntar si existe un dato en puntual
        System.out.println("¿Está el valor 16? " + pila.search(3));
        System.out.println("¿Últmo dato agregado? " + pila.peek());
    }

}
