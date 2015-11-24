import greenfoot.*;

/**
 * Write a description of class Nena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nena extends Puntos
{
    /**
     * Act - do whatever the Nena wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

   
    public void act() 
    {
     // checalimite();
      //move(3);
    }
    
    public void checalimite()
    {
         World world;
        world = getWorld();
        int x = getX();
        //int worldWidth = world.getWidth();
       
       if(x>=690)
       {
           world.removeObject(this);
       }
       
    }
}    
    

