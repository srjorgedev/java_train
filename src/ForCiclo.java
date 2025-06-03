public class ForCiclo {
    public static void main(String[] args) {
        // El bucle FOR es una estructura de control que permite ejecutar un bloque de
        // código un número específico de veces, iterando sobre un rango de valores.
        // Es muy útil cuando se conoce de antemano cuántas veces se debe
        // ejecutar el bucle.

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // También podemos utilizar el bucle FOR para iterar sobre arreglos o colecciones.
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + frutas[i]);
        }

        // El bucle FOR también puede ser utilizado con una variable de tipo char para
        // iterar sobre caracteres en un rango específico.
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letra: " + c);
        }

        // Además, podemos utilizar el bucle FOR para iterar sobre una secuencia de
        // números con un paso específico, utilizando una variable de incremento.
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Número con paso de 2: " + i);
        }

        // Tambien existen variantes del bucle FOR, como el bucle FOR-EACH,
        // que se utiliza para iterar sobre elementos de una colección o arreglo sin
        // necesidad de utilizar un índice explícito.
        for (String fruta : frutas) {
            System.out.println("Fruta en FOR-EACH: " + fruta);
        }
    }
}
