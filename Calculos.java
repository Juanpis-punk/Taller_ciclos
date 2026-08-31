import java.util.Scanner;


class Calculos{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int calculo;

        

        do { 

        System.out.println("===CENTRO DE CÁLCULOS===");
        System.out.println("Escoge el cálculo que quieras hacer:");
        System.out.println("1. Nose");
        System.out.println("2. Calcular n-esimo número primo");
        System.out.println("3. Calcular raíces de una ecuación cuadrática");
        System.out.println("4. Promedio entre n números");
        System.out.println("5. Salir");
        calculo = sc.nextInt();

        switch(calculo){

            case 1: 
                System.out.println("*Ejecutando Nose*");
                //Código de fibanacci
                break;
            case 2: 
                System.out.println("*Ejecutando cálculo del n-simo número primo*");
                break;
            case 3:
                System.out.println("*Ejecutando calculadora de raíces en fórmula cuadrática*");
                //Código
                break;

            case 4: 
                System.out.println("Ejecutando promedio entre n números");
                //código
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
        sc.close();
        }
            */
        
        
    
