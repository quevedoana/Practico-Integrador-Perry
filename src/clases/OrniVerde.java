
package clases;

import java.util.Scanner;


public class OrniVerde extends Castor implements MamaPata{

    @Override
    public void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do-Re-Mi");
         System.out.println("Presiona Enter para continuar...");
        sc.nextLine(); // Este método espera la entrada del usuario
        System.out.println("Fa-Sol-La-Si");
    }
    public void tocarGuitorgan(){
        tocarOrgano();
        System.out.println("cuac cuaac…!");
    }
    
}
