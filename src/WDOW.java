import java.util.Scanner;

public class WDOW {
    public static void main(String[] args) {
        // Crear un programa que lea N cantidad de numeros enteros 
        // y nos muestre el numero mayor y el numero menor.
        Scanner scan = new Scanner(System.in);
        int numero, mayor = 0, menor = 1000, limite;

        System.out.print("Ingrese la cantidad de numeros a evaluar: ");
        limite = scan.nextInt();

        System.out.println("Ingrese " + limite + " numeros: ");

        for (int i = 0; i < limite; i++) {
            numero = scan.nextInt();

            if(numero > mayor) {
                mayor = numero;
            } 
            if (numero < menor) {
                menor = numero;
            }
        }   

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        scan.close();
    }
}
