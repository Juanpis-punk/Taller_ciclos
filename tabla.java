import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int Numero = 0;
            boolean NumeroValido = false;
            /*:v */
        
            while (!NumeroValido) {
                try {
                    System.out.print("Ingrese el numero para mostrar su tabla de multiplicar (0 para salir): ");
                    Numero = sc.nextInt();
                    NumeroValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada invalida, debe ingresar un numero entero.\n");
                    sc.nextLine(); 
                }
            }  

            if (Numero == 0) {
                System.out.println("hasta luego");
                break;
            }

            System.out.println("\nTabla de multiplicar del " + Numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(Numero + " x " + i + " = " + (Numero * i));
            }
            System.out.println(); 
        }

        sc.close();
    }
}