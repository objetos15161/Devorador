import greenfoot.*;

/**
 * De esta clase se crean los vehiculos a usar en el juego 
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano ) 
 * @version (2015.11.27)
 */
public class Vehiculo extends Obstaculo
{
    public void removeVehiculo()
    {
        World world;
        world = getWorld();
        int x = getX();

        if(x<=0)
        {
            world.removeObject(this);
        }
    }   

}
