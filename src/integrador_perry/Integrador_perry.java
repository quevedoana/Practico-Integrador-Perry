/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador_perry;

import clases.*;
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

        //atributos orniverde
        double aux1;//longitud de la cola
        double aux2;//velocidad

        //atributos blue
        double aux3;//propulsion
        double aux4;//longitud de la cola
        double aux5;//velocidad

        //atributos blui
        double aux6;//propulsion
        double aux7;//longitud de la cola
        double aux8;//velocidad

        //bucles para instanciar a orniverde
        System.out.println("creando a Esteban");

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
        OrniVerde esteban = new OrniVerde(aux1, aux2);

        //bucles para crear a blue
        System.out.println("creando a blue");

        do {
            System.out.println("Ingrese la propulsion(entre 5 y 10)");
            aux3 = sc.nextDouble();
            if (aux3 < 5 || aux3 > 10) {
                System.out.println("La propulsion no puede ser menor a 5 ni mayor a 10");
            }
        } while (aux3 < 5 || aux3 > 10);
        do {
            System.out.println("Ingrese la longitud de la cola");
            aux4 = sc.nextDouble();
            if (aux4 <= 0) {
                System.out.println("La longitud no puede ser negativa");
            }
        } while (aux4 <= 0);
        do {

            System.out.println("Ingrese la velocidad(entre 0 y 8)");
            aux5 = sc.nextDouble();
            if (aux2 < 0 || aux2 > 8) {
                System.out.println("La velocidad no puede ser negativa ni superior a 8");
            }

        } while (aux5 < 0 || aux5 > 8);
        OrniAzul blue = new OrniAzul(aux3, aux4, aux5);

        //bucles para crear a blui
        System.out.println("creando a blui");

        do {
            System.out.println("Ingrese la propulsion(entre 5 y 10)");
            aux6 = sc.nextDouble();
            if (aux6 < 5 || aux6 > 10) {
                System.out.println("La propulsion no puede ser menor a 5 ni mayor a 10");
            }
        } while (aux6 < 5 || aux6 > 10);
        do {
            System.out.println("Ingrese la longitud de la cola");
            aux7 = sc.nextDouble();
            if (aux7 <= 0) {
                System.out.println("La longitud no puede ser negativa");
            }
        } while (aux7 <= 0);
        do {

            System.out.println("Ingrese la velocidad(entre 0 y 8)");
            aux8 = sc.nextDouble();
            if (aux8 < 0 || aux8 > 8) {
                System.out.println("La velocidad no puede ser negativa ni superior a 8");
            }
        } while (aux8 < 0 || aux8 > 8);
        OrniAzul blui = new OrniAzul(aux6, aux7, aux8);

        //ejecutando habilidades
        
        //orniverde
        System.out.println("esteban muestra sus habilidades para nadar y tocar instrumentos");
        esteban.nadar();
        esteban.tocarGuitarra();
        esteban.tocarOrgano();
        esteban.tocarGuitorgan();
        
        //blue
        System.out.println("blue muestra sus habilidades para tocar la guitarra y nadar con propulsion ");
        blue.tocarGuitarra();
        blue.nadar();

        //blui
        System.out.println("blui muestra sus habilidades para tocar la guitarra y nadar con propulsion ");
        blui.tocarGuitarra();
        blui.nadar();

        //Arreglo de ornitorrincos
        try {
            Castor[] hermanosOrni = new Castor[3];
            hermanosOrni[0] = esteban;
            hermanosOrni[1] = blue;
            hermanosOrni[2] = blui;
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("indice de arreglo no valido");
        } catch (Exception e) {
            System.out.println("error de " + e.getMessage());
        } finally {
            System.out.println("los ornitohermanos estan juntos al fin…");
        }
    }

}
