import greenfoot.*;

/**
 * Clase Casa que se llama en el tercer nivel.
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.26)
 */
public class Casa extends Actor
{
    private GreenfootImage house;
    /**
     * Es el contructor de tipo Casa, se crea una Variable y se le asigna la imagen.
     */
    public Casa() 
    {
        house=new GreenfootImage("casa.png");
        setImage(house);
    }    
}
