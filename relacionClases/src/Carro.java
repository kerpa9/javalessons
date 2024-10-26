import java.util.List;

public class Carro {
    private int idc;
    private String marca;
    private String modelo;
    // Relación 1:1
    // private Propietario prop;

    // Relación 1:N
    private List<Propietario> listProps;

    public Carro() {
    }
    // Relación 1:1

    // public Carro(int id, String marca, String modelo, Propietario prop) {
    // this.id = id;
    // this.marca = marca;
    // this.modelo = modelo;
    // this.prop = prop;

    // }

    // Relación 1:N

    public Carro(int idc, String marca, String modelo, List<Propietario> listProps) {
        this.idc = idc;
        this.marca = marca;
        this.modelo = modelo;
        this.listProps = listProps;

    }

    // GET

    public int getId() {
        return idc;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Relación 1:1
    // public Propietario getProp() {
    // return prop;
    // }

    // Relación 1:N
    public List<Propietario> getProplist() {
        return listProps;
    }

    // SET

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Relación 1:1

    // public void setPropietario(int id, String nombre, String apellido) {
    // this.prop = prop;
    // }

    // Relación 1:N
    public void setPropietario(List<Propietario> listProps) {
        this.listProps = listProps;
    }

}
