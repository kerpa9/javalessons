public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // Operadores aritmeticos

        int a = 20, b = 10;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        // Suma al valor anterior
        int sumaAnterior = a;
        sumaAnterior += 5;
        sumaAnterior += 5;
        sumaAnterior -= 5;
        sumaAnterior *= 5;
        sumaAnterior /= 5;

        // System.out.println(sumaAnterior);

        // Operadores lógicos

        boolean t = true;
        boolean f = false;
        // AND &&
        // OR ||
        // NOT !

        boolean and = t && f;
        boolean or = t || f;
        boolean not = !f;

        // System.out.println(not);

        boolean mayor = b > a;
        boolean menor = a < b;

    }

}
