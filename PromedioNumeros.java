import java.util.Scanner;

public class PromedioNumeros {

    public static void main(String[] args) {

        // Crear objeto Scanner para recibir datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Variables
        int n;
        double numero;
        double suma = 0;
        double promedio;

        // Título del programa
        System.out.println("======================================");
        System.out.println("       CALCULADORA DE PROMEDIO");
        System.out.println("======================================");

        // Solicitar cantidad de números
        System.out.print("¿Cuántos números desea ingresar?: ");
        n = entrada.nextInt();

        // Validar que n sea mayor que cero
        while (n <= 0) {
            System.out.println("Error: debe ingresar una cantidad mayor que 0.");
            System.out.print("Ingrese nuevamente la cantidad: ");
            n = entrada.nextInt();
        }

        // Ciclo para ingresar los números
        for (int i = 1; i <= n; i++) {

            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextDouble();

            // Acumular los números
            suma = suma + numero;
        }

        // Calcular el promedio
        promedio = suma / n;

        // Mostrar resultados
        System.out.println();
        System.out.println("======================================");
        System.out.println("              RESULTADO");
        System.out.println("======================================");
        System.out.println("Cantidad de números: " + n);
        System.out.println("Suma total: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("======================================");

        // Cerrar Scanner
        entrada.close();
    }
}