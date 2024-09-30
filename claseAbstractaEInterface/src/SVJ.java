import interfaces.IDetalles;

public class SVJ extends Carros implements IDetalles {
    int cantidadCilindros;

    public SVJ(String marca, int Cilindros) {

        super(marca);

        this.cantidadCilindros = Cilindros;
    }

    public @Override void motor() {
        System.out.println(marca + "Excelente motor italiano" + "Muyyy buen motor");
    }

    @Override
    public void detalles() {
        System.out.println("Excelente carro italiano con 12 cilindros en V");
    }

}
