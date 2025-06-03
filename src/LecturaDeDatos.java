import java.util.Scanner;

public class LecturaDeDatos {
    public static void main(String[] args) {
        // Crear un objeto de la clase Scanner para leer datos desde la entrada estándar
        Scanner scan = new Scanner(System.in);

        // Solicitar al usuario un NUMERO ENTERO
        // Usamos nextInt() para leer un número entero
        // nextInt() lee el número entero ingresado por el usuario
        System.out.print("Ingrese un numero entero: ");
        int numeroEntero = scan.nextInt();

        // Solicitar al usuario una CADENA DE TEXTO con next()
        // Usamos next() para leer una cadena de texto
        // next() lee la cadena de texto ingresada por el usuario hasta el primer
        // espacio en blanco o salto de línea
        // Por ejemplo, si el usuario ingresa "Hola Mundo", next() solo leerá "Hola"
        System.out.print("Ingrese una cadena de texto (con next(): ");  
        String cadenaTexto1 = scan.next();

        // ¿Qué es el buffer? Un espacio temporal en memoria donde se almacenan datos
        // antes de ser procesados
        // por algun metodo como nextLine() o nextInt().

        // ¿Cómo funciona el Scanner y el Buffer? El buffer almacena los datos
        // ingresados por el usuario, incluido el ENTER,
        // el cual se almacena como un salto de línea -> "\n". Cuando se usa next(),
        // este método lee hasta el primer espacio en blanco
        // Metodos como next() y nextInt() no consumen el enter, por lo que al usuarlos,
        // toman lo que necesitan y dejan el salto de línea en el buffer.

        // nextLine() lee todo hasta el final de la línea, incluyendo el salto de línea.
        // Y a veces, si no se limpia el buffer, toma el salto de
        // línea pendiente como una entrada vacía.

        // Solicitar al usuario una CADENA DE TEXTO con nextLine()
        // Si no limpiamos el buffer, nextLine() puede saltarse esta entrada
        scan.nextLine(); // Limpiar el buffer para evitar problemas con nextLine()
        System.out.print("Ingrese una cadena de texto (con nextLine()): ");
        String cadenaTexto2 = scan.nextLine();

        // Solicitar al usuario un NUMERO DECIMAL con nextDouble()
        // Usamos nextDouble() para leer un número decimal
        System.out.print("Ingrese un numero decimal (double): ");
        double numeroDouble = scan.nextDouble();

        // Solicitar al usuario un NUMERO DECIMAL con nextFloat()
        // Usamos nextFloat() para leer un número decimal
        System.out.print("Ingrese un numero decimal (float): ");
        float numeroFloat = scan.nextFloat();

        // La diferencia entre nextDouble() y nextFloat() es la precisión:
        // nextDouble() es más preciso y puede manejar números más grandes que nextFloat().
        // Aproximadamente, nextDouble() puede manejar números hasta 15-17 dígitos,
        // mientras que nextFloat() puede manejar números hasta 6-7 dígitos.

        System.out.println("\n");

        // Imprimir datos ingresados
        System.out.println("Numero entero ingresado: " + numeroEntero);
        System.out.println("Cadena de texto ingresada (con next()): " + cadenaTexto1);
        System.out.println("Cadena de texto ingresada (con nextLine()): " + cadenaTexto2);
        System.out.println("Numero decimal con double ingresado: " + numeroDouble);
        System.out.println("Numero decimal con float ingresado: " + numeroFloat);

        // Cerrar el scanner
        scan.close();
    }
}