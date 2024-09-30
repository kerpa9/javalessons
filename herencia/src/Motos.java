public class Motos {

    String marca;
    String modelo;
    int año;
    static int numeroMotos=0;

    public Motos(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        numeroMotos++;

    }

    public String cilindros() {
        return "numero de cilindros";
    }

    public static int getNumeroMotos(){
        return numeroMotos;
    }

}
