import greenfoot.*;

/**
 * Write a description of class carro here.
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano ) 
 * @version (2015.11.27)
 */
public class Carro extends Vehiculo
{
    /**
     * Indica el movimiento hacia la izquierda del vehiculo
     */
    public void act() 
    {
        super.removeVehiculo();
        move(-6);
    } 
}
