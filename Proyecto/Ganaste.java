import greenfoot.*;

/**
 * Write a description of class Ganaste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganaste extends Actor
{
    private GreenfootImage mensaje;
    /**
     * Act - do whatever the Ganaste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ganaste() 
    {
        // Add your action code here.
          mensaje=new GreenfootImage("win.png");
          setImage(mensaje);
    }      
}
