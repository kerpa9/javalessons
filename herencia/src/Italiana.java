public class Italiana extends Motos {
    int velMax;

    public Italiana(String marca, String modelo, int año) {

        super(marca, modelo, año);
    }

    @Override
    public String cilindros() {
        return "V4";
    }

}
