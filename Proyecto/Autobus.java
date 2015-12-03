import greenfoot.*;

/**
 * Write a description of class Autobus here.
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano ) 
 * @version (2015.11.27)
 */
public class Autobus extends Vehiculo
{
    /**
     * Indica el movimiento hacia la izquierda del vehiculo y hereda el método de removeVehiculo.
     */
    public void act() 
    {
        super.removeVehiculo();
        move(-8);
    }    
}
