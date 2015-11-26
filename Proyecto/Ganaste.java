import greenfoot.*;

/**
 * Este método crea un Objeto que tiene un mensaje ganaste.
 * 
 * @author (Karen Castollo Rodriguez) 
 * @version (2015.11.27)
 */
public class Ganaste extends Actor
{
    private GreenfootImage mensaje;
    /**
     * Crea un objeto con la imagen ganaste.
     */
    public Ganaste() 
    {
        // Add your action code here.
          mensaje=new GreenfootImage("win.png");
          setImage(mensaje);
    }      
}
