import interfaces.IDetalles;

public class Subaru extends Carros  implements IDetalles{
    

    public Subaru(String marca) {
        super(marca);
    }

    @Override
    public void motor() {
        System.out.println(marca + "Excelente marca");

    }

    @Override
    public void detalles() {
       System.out.println("Excelente carro Japones, realmente lo quiero");
    }

}
