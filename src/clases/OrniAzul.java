package clases;

import java.util.Comparator;

/**
 *
 * @author esteb
 */
public class OrniAzul extends Castor {

    private Double propulsion;

    public OrniAzul(Double propulsion, double cola, double velocidad) {
        super(cola, velocidad);
        this.propulsion = propulsion;
    }

    public Double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(Double propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public void nadar() {
        double aux = velocidad + propulsion;
        System.out.println("Esta nadando a una velocidad de " + aux + " km/h");

    }

    @Override
    public String toString() {
        
        return "Ornitorrinco Azul{" + " Propulsion: " + propulsion + " Cola: " + super.cola +" Velocidad: "+ super.velocidad +'}';
    }
    
    public static Comparator<OrniAzul> ordenarPropu = new Comparator<OrniAzul>() {
        @Override
        public int compare(OrniAzul o1, OrniAzul o2) {
            return o1.getPropulsion().compareTo(o2.getPropulsion());
        }
    };
}