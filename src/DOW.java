import java.util.Scanner;

public class DOW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, resultado = 1;

        System.out.println("Ingrese el numero del cual desee obtener el factorial: ");
        numero = scan.nextInt();

        while(numero > 0) {
            resultado = resultado * numero;
            numero--;
        }

        System.out.println("El factorial es: " + resultado);
    }
}
