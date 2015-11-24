import greenfoot.*;

/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculo extends Obstaculo
{
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
