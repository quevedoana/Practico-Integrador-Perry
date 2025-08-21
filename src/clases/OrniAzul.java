
package clases;

/**
 *
 * @author esteb
 */
public class OrniAzul extends Castor{
    private double propulsion;

    public OrniAzul(double propulsion, double cola, double velocidad) {
        super(cola, velocidad);
        this.propulsion = propulsion;
    }

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }
    @Override
    public void nadar(){
        double aux= velocidad + propulsion;
        System.out.println("Esta nadando a una velocidad de "+aux+ " km/h");
        
    }
    
}
