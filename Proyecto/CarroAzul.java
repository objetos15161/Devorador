import greenfoot.*;

/**
 * De esta clase se creera uno de los vehiculos para el 3er nivel 
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano ) 
 * @version (2015.11.27)
 */
public class CarroAzul extends Vehiculo
{
    /**
     *Indica el movimiento hacia la derecha del vehiculo
     */
    public void act() 
    {
        removeVehiculo();
        move(3);
    }    

    /**
     *Valida cuando el vehiculo llega al borde y lo remueve 
     */
    public void removeVehiculo()
    {
        World world;
        world = getWorld();
        int x = getX();

        if(x>=780)
        {
            world.removeObject(this);

        }
    }   
}
