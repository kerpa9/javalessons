public class App {
    public static void main(String[] args) throws Exception {

        Motos motos = new Motos("Ducati", "Streetfigther", 300);
        Italiana italiana = new Italiana("MV Augusta", "Brutale", 320);
        Japonesa japonesa = new Japonesa("Kawasaki", "Zx10-RR", 350);

        System.out.println("La moto de marca " + motos.marca + " Aspera");
        System.out.println(motos.cilindros());
        System.out.println("La moto italiana " + italiana.marca + " Aspera");
        System.out.println(italiana.cilindros());
        System.out.println("La moto japonesa " + japonesa.marca + " Aspera");
        System.out.println(japonesa.cilindros());

        System.out.println("Cantidad de motos y opciones: " + Motos.getNumeroMotos());
    }
}
