import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mayor = 0, menor = 100000, actual, opt; 

        while(true) {
            System.out.print("Numero: ");
            actual = scan.nextInt();

            System.out.println("\n¿Agregar otro numero?\n1.Si\n2.No");
            opt = scan.nextInt();

            if(actual > mayor) mayor = actual;
            if(actual < menor) menor = actual;
            if(opt == 2) break;
        }

        System.out.println("\nNumero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        scan.close();
    }   
}