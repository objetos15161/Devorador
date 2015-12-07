import greenfoot.*;

/**
 * Crea el carro que aparece en el 2o nivel
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
