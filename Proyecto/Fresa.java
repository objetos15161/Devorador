import greenfoot.*;

/**
 * Write a description of class Fresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fresa extends Comida
{
    /**
     * Act - do whatever the Fresa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World w;
        w= getWorld();
        int x= w.getWidth();
        int y= w.getHeight();
        
        //Greenfoot.delay(20);
        //Greenfoot.setSpeed(20);
        if ( Greenfoot.getRandomNumber(1000) < 30 )
        {
            setLocation(Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
        }
    }    
}
