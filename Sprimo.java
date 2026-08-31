import java.util.Scanner;
public class Sprimo {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
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
            //System.out.println(u);
            x++;
            }
            u++;
            }

            System.out.print("El número primo en la posición número "+ p +" es: " + (u-1) + "\nPor tanto la suma a realizar es: " + n + " + " + (u-1) + "\n = " + (n+u-1));
        


    
    
    

    


            
        



            
















            
        }
}
