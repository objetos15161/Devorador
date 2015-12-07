import greenfoot.*;

/**
 * Crea el objeto autobus que aparece en el 2o nivel
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano ) 
 * @version (2015.11.27)
 */
public class Autobus extends Vehiculo
{
    /**
     * Indica el movimiento hacia la izquierda del vehiculo 
     */
    public void act() 
    {
        super.removeVehiculo();
        move(-8);
    }    
}
