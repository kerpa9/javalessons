public class App {
    public static void main(String[] args) throws Exception {
      Persona persona=new Persona("Juan", "Jose", 60);

      persona.setNombre("Jorge");
      persona.setApellido("Motors");

      System.out.println(persona.nombreCompleto() + " tiene " + persona.getEdad() + " años " + persona.saludar(persona.nombreCompleto()));
    }
}
