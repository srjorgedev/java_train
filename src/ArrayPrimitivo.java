public class ArrayPrimitivo {
    public static void main(String[] args) {

        // Arrays -> Almacena una colección de elementos del mismo tipo
        int[] numerosEnteros = { 1, 2, 3, 4, 5 }; // Un array de números enteros
        int[] numerosEnteros2 = new int[5]; // Un array de números enteros vacío con tamaño 5

        // Los array incian en 0, por lo que va de 0 a el numero especificado - 1

        // Asignar valores al array
        numerosEnteros2[0] = 10; // Asignar el valor 10 al primer elemento
        numerosEnteros2[1] = 20; // Asignar el valor 20 al segundo elemento

        numerosEnteros2[3] = 40; // Asignar el valor 40 al cuarto elemento
        numerosEnteros2[4] = 50; // Asignar el valor 50 al quinto elemento

        // Este tipo de array tiene un tamaño fijo, que se define al momento de su
        // creación.
        // No se puede cambiar el tamaño de un array una vez creado.

        // Imprimir los valores del array
        System.out.println("Array de numeros enteros:");
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println("Elemento " + i + ": " + numerosEnteros[i]);
        }
        System.out.println("\nArray de numeros enteros 2:");
        for (int i = 0; i < numerosEnteros2.length; i++) {
            System.out.println("Elemento " + i + ": " + numerosEnteros2[i]);
        }
    }
}
