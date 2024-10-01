import Exceptions.CalculadoraExceptions;
import Exceptions.DividirPorCeroException;

public class App {
    public static void main(String[] args) throws Exception {

        double numero1 = 0;
        double numero2 = 5;
        double resultado;

        Calculadora calculadora=new Calculadora();

        try {
            resultado=calculadora.dividir(numero1, numero2);
            System.out.println(resultado);

        } catch (CalculadoraExceptions error) {

            error.printStackTrace();
        }finally{
            System.out.println("Ya se calculo");
        }
    }
}
