public class Carro {
    private int num;
    private String marca;
    private int modelo;

    public Carro() {
    }

    public Carro(int num, String marca, int modelo) {
        this.num = num;
        this.marca = marca;
        this.modelo = modelo;

    }

    public int getNum() {
        return num;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }


}
