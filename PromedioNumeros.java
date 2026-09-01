import java.util.Scanner;

public class PromedioNumeros {

    public static void main(String[] args) {

        // Crear objeto Scanner para recibir datos del usuario
        Scanner sc = new Scanner(System.in);

        
        int y;
        double numero;
        double suma = 0;
        double promedio;

        
        System.out.println("======================================");
        System.out.println("       CALCULADORA DE PROMEDIO :3");
        System.out.println("======================================");

        
        System.out.print("¿Cuántos números desea ingresar?: ");
        y = sc.nextInt();

       
        while (y <= 0) {
            System.out.println("Ingresa una cantidad mayor que 0.");
            System.out.print("Ingresa la cantidad nuevamente nuevamente: ");
            y = sc.nextInt();
        }

       
        for (int k = 1; k <= y; k++) {

            System.out.print("Ingresa el número " + k + ": ");
            numero = sc.nextDouble();
            suma = suma + numero;
        }

        
        promedio = suma / y;

        
        System.out.println();
        System.out.println("======================================");
        System.out.println("              RESULTADO");
        System.out.println("======================================");
        System.out.println("Cantidad de números: " + y);
        System.out.println("Suma total: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("======================================");

    
    }
}