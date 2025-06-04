public class Funciones {
    public static void main(String[] args) {
        imprimirMensaje("HOLA MUNDO");
        
        int resultado = sumar(5, 10);
        System.out.println("La suma es: " + resultado);
    }

    // Las funciones son bloques de código que realizan una tarea específica.
    // Se pueden definir funciones para realizar cálculos, procesar datos, etc.
    // Definición de una función simple
    // Las funciones pueden recibir parámetros y devolver valores.

    // Ejemplo de una funcion que suma dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // En este ejemplo, la función 'sumar' toma dos enteros como parámetros y devuelve su suma.
    
    // Al definir una funcion, se especifica el tipo de dato que devuelve (en este caso, 'int').
    // También se pueden definir funciones que no devuelven ningún valor, en cuyo caso se usa 'void'.

    // De igual manera, se pueden definir funciones que toman múltiples parámetros o ninguno.
    // Tambien debemos especificar el tipo de dato de cada parámetro.

    // Esta funcion imprime un mensaje en la consola
    // No devuelve ningún valor, por lo que se usa 'void'.
    public static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
