public class WhileDoWhile {
    public static void main(String[] args) {
        // El bucle WHILE es una estructura de control que permite ejecutar un bloque de
        // código mientras se cumpla una condición específica.
        int contador = 0;

        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // El bucle DO-WHILE es similar al WHILE, pero garantiza que el bloque de código
        // se ejecute al menos una vez, ya que la condición se evalúa después de la
        // ejecución del bloque.
        int contador2 = 0;

        do {
            System.out.println("Contador en DO-WHILE: " + contador2);
            contador2++;
        } while (contador2 < 5);

        // Asi mismo, podemos romper el bucle utilizando la sentencia BREAK, que
        // finaliza el bucle inmediatamente.
        int contador3 = 0;
        while (contador3 < 10) {
            if (contador3 == 5) {
                System.out.println("Contador alcanzó 5, saliendo del bucle.");
                break; // Sale del bucle cuando contador3 es igual a 5
            }
            System.out.println("Contador en WHILE: " + contador3);
            contador3++;
        }

        // También podemos utilizar la sentencia CONTINUE, que salta a la siguiente
        // iteración del bucle, omitiendo el resto del código en esa iteración.
        int contador4 = 0;
        while (contador4 < 10) {
            contador4++;
            if (contador4 % 2 == 0) {
                continue; // Salta a la siguiente iteración si contador4 es par
            }
            System.out.println("Contador impar: " + contador4);
        }
    }
}
