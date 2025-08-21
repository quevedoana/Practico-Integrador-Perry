
package clases;

import java.util.Scanner;


public class OrniVerde extends Castor implements MamaPata{

    @Override
    public void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do-Re-Mi");
        System.out.println("Presione una tecla para continuar");
        sc.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }
    public void tocarGuitorgan(){
        tocarGuitarra();
        tocarOrgano();
        System.out.println("cuac cuaac…!");
    }
    
}
