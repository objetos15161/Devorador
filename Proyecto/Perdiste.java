import greenfoot.*;

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perdiste extends Actor
{   
    private GreenfootImage mensaje;
    /**
     * Act - do whatever the Letrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Perdiste() 
    {
        // Add your action code here.
          mensaje=new GreenfootImage("gameover2.png");
          setImage(mensaje);
    }    
}
