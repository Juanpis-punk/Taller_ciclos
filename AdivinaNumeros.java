import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = 0;
        int m = 0;
        boolean rangoValido = false;

        while (!rangoValido) {
            try {
                System.out.print("Ingrese el limite inferior (n): ");
                n = sc.nextInt();
                System.out.print("Ingrese el limite superior (m): ");
                m = sc.nextInt();

                if (n < m) {
                    rangoValido = true;
                } else {
                    System.out.println("El limite inferior debe ser menor que el superior. Intente de nuevo.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Numero invalido, debe ingresar numeros enteros.\n");
                sc.nextLine();
            }
        }

        int numeroSecreto = n + random.nextInt(m - n + 1);

        int intentos = 0;
        boolean adivino = false;

        System.out.println("\nTengo el numero  " + n + " y " + m + ". Adivinalo si puedes");

        while (!adivino) {
            try {
                System.out.print("Ingresa tu numero pensado: ");
                int intento = sc.nextInt();
                intentos++;

                if (intento < n || intento > m) {
                    System.out.println("Ese numero esta fuera del rango [" + n + ", " + m + "].");
                } else if (intento < numeroSecreto) {
                    System.out.println("Muy bajo.");
                } else if (intento > numeroSecreto) {
                    System.out.println("Muy alto.");
                } else {
                    adivino = true;
                    System.out.println("\n¡bien hecho, era  " + numeroSecreto
                            + " y te tomo " + intentos + " intento(s).");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida, debe ingresar un numero entero.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}