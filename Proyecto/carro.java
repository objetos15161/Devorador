import greenfoot.*;

/**
 * Write a description of class carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Vehiculo
{
    /**
     * Act - do whatever the carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeScreen();
        move(-3);
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
