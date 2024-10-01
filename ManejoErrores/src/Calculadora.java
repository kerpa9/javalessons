import java.util.concurrent.CancellationException;

import Exceptions.CalculadoraExceptions;
import Exceptions.DividirPorCeroException;

public class Calculadora {

    public double dividir(double divisor, double dividendo) throws CalculadoraExceptions {
        if (divisor == 0)
            throw new CalculadoraExceptions("No se puede dividir por cero");
        return dividendo / divisor;
    }

}
