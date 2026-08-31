import java.util.Scanner;
import java.util.InputMismatchException;

public class tabla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int numero = 0;
            boolean numeroValido = false;

            // Pedir el numero al usuario, validando que sea un entero
            while (!numeroValido) {
                try {
                    System.out.print("Ingrese el numero para mostrar su tabla de multiplicar (0 para salir): ");
                    numero = sc.nextInt();
                    numeroValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada invalida, debe ingresar un numero entero.\n");
                    sc.nextLine(); // limpiar el buffer despues del error
                }
            }

            // Condicion de salida del ciclo infinito
            if (numero == 0) {
                System.out.println("Hablamos luego.");
                break;
            }

            System.out.println("\nTabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println(); // linea en blanco antes de volver a preguntar
        }

        sc.close();
    }
}