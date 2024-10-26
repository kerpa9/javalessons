import java.util.ArrayList;
import java.util.List;

public class Relacion {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro();
        carro.setIdc(1);
        carro.setMarca("La Ferrari");
        carro.setModelo("nuevo");

        List<Propietario> listProps = new ArrayList<Propietario>();

        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(10);
        prop1.setNombre("Kevin");
        prop1.setApellido("Reyes");

        prop2.setId(10);
        prop2.setNombre("Steven");
        prop2.setApellido("Parra");

        listProps.add(prop1);
        listProps.add(prop2);

        carro.setPropietario(listProps);

        System.out.println("---------------------CARRO------------------");

        System.out.println("El auto" + carro.getModelo());

    }
}
