public class InterfacesApp {
    public static void main(String[] args) {

            Subaru subaru=new Subaru("Subaru");
            SVJ svj=new SVJ("Lamborguini", 12);

            subaru.detalles();
            subaru.motor();
            
            svj.detalles();
            svj.motor();
    }
    
}
