import greenfoot.*;

/**
 * Write a description of class Autobus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Autobus extends Vehiculo
{
    /**
     * Act - do whatever the Autobus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeScreen();
        move(-5);
    }   
    
    public void removeScreen()
    {
        World world;
        world = getWorld();
        int x = getX();
        //int worldWidth = world.getWidth();
       
       if(x<=0)
       {
           world.removeObject(this);
       }
    }
}
