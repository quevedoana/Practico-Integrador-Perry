/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador_perry;

import clases.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author AnaQuevedo
 */
public class Integrador_perry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creando las instancias 
        Scanner sc = new Scanner(System.in);
        ArrayList<OrniAzul> nadadores = new ArrayList();

        int i;
        double aux1;
        double aux2;
        double aux3;

        //bucles para instanciar a orniverde
        System.out.println("Creando a Orniverde");

        do {
            System.out.println("Ingrese la longitud de la cola");
            aux1 = sc.nextDouble();
            if (aux1 <= 0) {
                System.out.println("La longitud no puede ser negativa");

            }
        } while (aux1 <= 0);
        do {
            System.out.println("Ingrese la velocidad(entre 0 y 8)");
            aux2 = sc.nextDouble();
            if (aux2 < 0 || aux2 > 8) {
                System.out.println("La velocidad no puede ser negativa ni superior a 8");
            }
        } while (aux2 < 0 || aux2 > 8);
        OrniVerde Cande = new OrniVerde(aux1, aux2);

        //bucles para crear a blue
        System.out.println("Creando a blue");

        do {
            System.out.println("Ingrese la propulsion(entre 5 y 10)");
            aux1 = sc.nextDouble();
            if (aux1 < 5 || aux1 > 10) {
                System.out.println("La propulsion no puede ser menor a 5 ni mayor a 10");
            }
        } while (aux1 < 5 || aux1 > 10);
        do {
            System.out.println("Ingrese la longitud de la cola");
            aux2 = sc.nextDouble();
            if (aux2 <= 0) {
                System.out.println("La longitud no puede ser negativa");
            }
        } while (aux2 <= 0);
        do {

            System.out.println("Ingrese la velocidad(entre 0 y 8)");
            aux3 = sc.nextDouble();
            if (aux3 < 0 || aux3 > 8) {
                System.out.println("La velocidad no puede ser negativa ni superior a 8");
            }
        } while (aux3 < 0 || aux3 > 8);
        OrniAzul blue = new OrniAzul(aux1, aux2, aux3);

        //bucles para crear a blui
        System.out.println("Creando a blui");

        do {
            System.out.println("Ingrese la propulsion(entre 5 y 10)");
            aux1 = sc.nextDouble();
            if (aux1 < 5 || aux1 > 10) {
                System.out.println("La propulsion no puede ser menor a 5 ni mayor a 10");
            }
        } while (aux1 < 5 || aux1 > 10);
        do {
            System.out.println("Ingrese la longitud de la cola");
            aux2 = sc.nextDouble();
            if (aux2 <= 0) {
                System.out.println("La longitud no puede ser negativa");
            }
        } while (aux2 <= 0);
        do {

            System.out.println("Ingrese la velocidad(entre 0 y 8)");
            aux3 = sc.nextDouble();
            if (aux3 < 0 || aux3 > 8) {
                System.out.println("La velocidad no puede ser negativa ni superior a 8");
            }
        } while (aux3 < 0 || aux3 > 8);
        OrniAzul blui = new OrniAzul(aux1, aux2, aux3);

        //Arreglo de ornitorrincos
        Castor[] arregloOrnis = new Castor[3];
        try {           
            arregloOrnis[0] = Cande;
            arregloOrnis[1] = blue;
            arregloOrnis[2] = blui;
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Indice de arreglo no valido");
        } catch (Exception e) {
            System.out.println("Error de " + e.getMessage());
        } finally {
            System.out.println("Los ornitohermanos estan juntos al fin");
        }

        for (i = 0; i < arregloOrnis.length; i++) {
            if(arregloOrnis[i] instanceof OrniAzul){
                OrniAzul aux = (OrniAzul)arregloOrnis[i];
                nadadores.add(aux);   
                System.out.println(aux);
            }          
        }    
        
        nadadores.sort(OrniAzul.ordenarPropu);
        
        Iterator<OrniAzul> ite = nadadores.iterator(); 
        while(ite.hasNext()){
            System.out.println(nadadores);
            break;
        }
    }
}
