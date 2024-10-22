public class Sobrecarga {

    String paisOrigen;
    String marca;
    String disposicionMotor;

    public Sobrecarga(String paisOrigen, String marca, String disposicionMotor) {

        this.paisOrigen = paisOrigen;
        this.marca = marca;
        this.disposicionMotor = disposicionMotor;

    }

    public void italiano() {
        System.out.println("ijvi");
    }

    public void italiano(String modelo) {
        System.out.println("ijvi" + modelo);
    }

}
