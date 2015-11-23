import greenfoot.*;

/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntos extends Actor
{
    /**
     * Act - do whatever the Manzana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public void checaLimite()
    { //  x getWidth();
     //  y getHeight();
        World world;
        world = getWorld();
        int y = getY();
        int alto = world.getHeight();
       if(y == alto-30)
           world.removeObject(this);
    }
}
