/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author AnaQuevedo
 */
public class Castor {
    protected double cola;
    protected double velocidad;

    public Castor(double cola, double velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }

    public Castor() {
    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void tocarGuitarra(){
        int cont =0;
        while(cont<3){
            int cuerda =(int)(Math.random()*6)+1;
            System.out.println("toca cuerda "+cuerda);
            cont++;
        }
        
    }
}
