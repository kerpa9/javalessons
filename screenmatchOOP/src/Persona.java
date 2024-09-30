public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public String nombreCompleto() {
        return apellido + ", " + nombre;
    }

    public String saludar(String saludado) {
        if (edad > 40)
            return " Buen día querido " + saludado;
        return " Hola " + saludado;

    }

    // Edad por get
    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

