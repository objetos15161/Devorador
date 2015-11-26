import greenfoot.*;

/**
 * Write a description of class CarroAzul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroAzul extends Vehiculo
{
    /**
     * Act - do whatever the CarroAzul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.}
        removeVehiculo();
        move(3);
    }    
     public void removeVehiculo()
    {
        World world;
        world = getWorld();
        int x = getX();
        //int worldWidth = world.getWidth();
       
       if(x>=780)
       {
         world.removeObject(this);
         
       }
    }   
}
