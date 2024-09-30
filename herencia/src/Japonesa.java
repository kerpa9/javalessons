public class Japonesa extends Motos {
    int velMax;

    public Japonesa(String marca, String modelo, int año) {

        super(marca, modelo, año);

    }

    @Override
    public String cilindros() {
        return "Tetracilindrica o crossplane";
    }

}
