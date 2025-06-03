public class TiposDeDatos {
    public static void main(String[] args) {
        // BYTE -> Almacena números enteros pequeños, de -128 a 127
        // Aproximadamente 2^8 números
        // Tamaño: 8 bits
        byte numeroByte = 10; // Un número entero pequeño
        byte numeroByte2 = 127; // Un numero entero pequeño no valido

        // SHORT -> Almacena números enteros medianos, de -32,768 a 32,767
        // Aproximadamente 2^16 números
        // Tamaño: 16 bits
        short numeroShort = 1000; // Un número entero mediano
        short numeroShort2 = 32767; // Un número entero mediano no valido

        // INT -> Almacena números enteros grandes, de -2,147,483,648 a 2,147,483,647
        // Aproximadamente 2^32 números
        // Tamaño: 32 bits
        int numeroEntero = 42; // Un número entero
        int numeroEntero2 = 2147483647; // Un número entero grande no valido

        // LONG -> Almacena números enteros muy grandes, de -9,223,372,036,854,775,808 a
        // 9,223,372,036,854,775,807
        // Aproximadamente 2^64 numeros
        // Tamaño: 64 bits
        long numeroLong = 1234567890123L; // Un número entero muy grande
        long numeroLong2 = 9223372036854775807L; // Un número entero muy grande no valido

        // FLOAT -> Almacena números decimales de precisión simple
        // Aproximadamente 2^32 números
        // Tamaño: 32 bits
        float numeroFloat = 3.14f; // Un número decimal
        float numeroFloat2 = 3.4028235E38f; // Un número decimal grande no valido

        // DOUBLE -> Almacena números decimales de precisión doble
        // Aproximadamente 2^64 números
        // Tamaño: 64 bits
        double numeroDouble = 3.141592653589793; // Un número decimal de precisión doble
        double numeroDouble2 = 1.7976931348623157E308; // Un número decimal grande no valido

        // CHAR -> Almacena un solo carácter
        // Tamaño: 16 bits (Unicode)
        char caracter = 'A'; // Un carácter
        char caracter2 = '\u0065'; // Un carácter usando Unicode

        // BOOLEAN -> Almacena un valor verdadero o falso
        boolean verdadero = true; // Un valor booleano verdadero
        boolean falso = false; // Un valor booleano falso

        // STRING -> Almacena una secuencia de caracteres (cadena de texto)
        // No es un tipo de dato primitivo, pero es ampliamente utilizado
        // Tamaño: variable (depende de la longitud de la cadena)
        String cadenaTexto = "Hola, mundo"; // Una cadena de texto
    }
}
