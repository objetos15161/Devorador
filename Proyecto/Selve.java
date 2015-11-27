import greenfoot.*;

/**
 * Este metodo agrega una imagen al mundo
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class Selve extends Actor
{   
    private GreenfootImage selve;
    /**
     * Constructor que solo agrega una imagen 
     */
    public Selve() 
    {
        selve=new GreenfootImage("stta.png");
        setImage(selve);
    }    
}
