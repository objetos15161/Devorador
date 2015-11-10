import greenfoot.*;

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Obstaculo
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
       checaPizza();
    }    
     public void checaPizza()
    {
        World world;
        world = getWorld();
        int x = getX();
        int worldWidth = world.getWidth();
       if(x>=worldWidth-20)
       {
           world.removeObject(this);
       }
}
}
