public class VariablesPrimitivas {
    public static void main(String[] args) {
        // Las variables son espacios en memoria los cuales contienen valor definidos o
        // variables
        // Se pueden definir asignar dato
        // Definir o asignar solo el tipo de dato
        // Las variables primitivas almacenan valores básicos

        // Tipo de dato caracter ''
        char letra = 'a';

        String frase = "Lorem ipsum dolor";

        // Tipo de datos enteros:
        // byte(-128, 128)
        // short(-32768, 32767)
        // int
        // long

        int numero = 4;

        double numeroFlo = 5.29656;

        // Tipo de dato booleano
        boolean v = true;
        boolean f = false;

        // Metodos string
        // length: cuenta la longitud total de una cade de texto tomando el espacio como
        // un caracter
        String texto = "Lorem ipsum dolo si amet";

        int longitud = texto.length();

        // System.out.println(longitud);

        // charAt: Recibe un parametro de tipo numero el cual indica la posición del
        // caracter que se desea imprimir
        char caracter = texto.charAt(3);
        // System.out.println(caracter);

        // substring: metodo el cúal recibe dos parametros, los cuales indican el inicio
        // y el fin desde donde se cortara una cadena
        String subString = texto.substring(5, 11);
        // System.out.println(subString);

        //Metodos para dejar todo en mayusculas o minusculas
        String minuscula=texto.toLowerCase();
        String mayuscula=texto.toUpperCase();
        // System.out.println(mayuscula);

        //Metodo para indicar el punto de inicio de una cadena de caracteres definida
        int indice=texto.indexOf("ipsum");
        // System.out.println(indice);

        //Remplaza una cadena por otra
        String remplazado= texto.replace("ipsum", "dolor");
        // System.out.println(remplazado);
        
        //Valida si contiene dentro de una cadena
        boolean contiene=texto.contains("humble");
        // System.out.println(contiene);

        String sinEspacios=texto.trim();
        System.out.println(sinEspacios);

    }

}
