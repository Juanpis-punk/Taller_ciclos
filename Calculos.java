import java.util.Scanner;


class Calculos{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int calculo;

        

        do { 

        System.out.println("===CENTRO DE CÁLCULOS===");
        System.out.println("Escoge el cálculo que quieras hacer:");
        System.out.println("1. Calcular n-esimo número de la secuencia de Fibonacci");
        System.out.println("2. Calcular n-esimo número primo y sumarlo a un número dado");
        System.out.println("3. Calcular raíces de una ecuación cuadrática");
        System.out.println("4. Promedio entre n números");
        System.out.println("5. Salir");
        System.out.print("Tu elección: ");
        calculo = sc.nextInt();
        System.out.println("============================================");

        switch(calculo){

            case 1: 
                System.out.println("*Ejecutando n-simo número de la secuencia de Fibonacci*");
                System.out.print("Ingresa la posición de la secuencia de Fibonacci que quieres ver (Sea el primer 0 en la posición 1): ");
                int posicion = sc.nextInt();
                int a = 0;
                int b = 1;

                for (int i = 1; i < posicion; i++){
                    int sum = a+b;
                    a = b;
                    b = sum;
                }
                System.out.println("El número en la posición " + posicion + " de la secuencia de Fibonacci es: " + a);
                System.out.println("============================================================");
                break;
            case 2: 
                System.out.println("*Ejecutando cálculo del n-simo número primo*");

                int i, u, p, x;
                float n;
                boolean Primo;
                

                System.out.print("Ingresa un número cualquiera: ");
                n = sc.nextFloat();

                do { 
                    System.out.print("Ingresa la posición del número primo que quieres sumarle: ");
                    
                    p = sc.nextInt();
                    if(p <=0){
                    System.out.println("No valen números negativos ni el cero, intentalo de nuevo \n ============================================================ \n ============================================================");
                    }
                } 
                while (p <= 0);
                
                ////////////////////////////
                x = 1;
                u = 0;
                
                while(x<=p){
                Primo = true;
                for (i = 2; i < u; i++){
                    if (u%i == 0){
                    Primo = false;
                    }
                }

                if (u == 0 || u == 1){
                Primo = false;
                }
            

                if (Primo == true){
                x++;
                }
                u++;
                }
                System.out.println("=============================================");
                System.out.println("El número primo en la posición número "+ p +" es: " + (u-1) + "\nPor tanto la suma a realizar es: " + n + " + " + (u-1) + "\n = " + (n+u-1));
                System.out.println("============================================================");
                break;
                
            case 3:
                System.out.println("*Ejecutando calculadora de raíces en fórmula cuadrática*");
                //Código
                break;

            case 4: 
                System.out.println("Ejecutando promedio entre n números");
                int y;
                double numero;
                double suma = 0;
                double promedio;

                
                System.out.println("======================================");
                System.out.println("       CALCULADORA DE PROMEDIOS :3");
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
            
        
                break;
                
            case 5: 
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción no válida");



        }

        
            
        }while (calculo != 5);
        
}
}
       
            


        

























































        /* 
        System.out.print("Ingresa la cantidad de dígitos de la secuancia de Fibanacci que quieres ver: ");
        int digitos = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i <= digitos; i++){
            System.out.print(a);
            System.out.print(", ");
            int sum = a+b;
            a = b;
            b = sum;
        }
            */
        
        
    
