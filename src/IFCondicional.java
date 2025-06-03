public class IFCondicional {
    public static void main(String[] args) {
        // El condicional IF es una estructura de control que permite ejecutar un
        // bloque de código si se cumple una condición específica.
        int numero = 10;
        if (numero > 5) {
            System.out.println("El numero es mayor que 5.");
        }

        // No es necesario escribir un bloque ELSE si no se requiere una acción
        // alternativa.
        // Sin embargo, si se desea ejecutar un bloque de código cuando la condición no
        // se cumple,
        // se puede utilizar el bloque ELSE.
        else {
            System.out.println("El numero no es mayor que 5.");
        }

        // Si solo se realiza una acción cuando la condición se cumple, podemos omitir
        // las llaves.
        if (numero < 15) System.out.println("El numero es menor que 15.");

    }
}
