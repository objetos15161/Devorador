import greenfoot.*;

/**
 * Clase Casa que se llama en el tercer nivel.
 * 
 * @author (Karen Castillo Rodriguez) 
 * @version (2015.11.26)
 */
public class Casa extends Actor
{
      private GreenfootImage hause;
    /**
     * Es el contructor de tipo Casa, se crea una Variable y se le asigna la imagen.
     */
   public Casa() 
    {
        // Add your action code here.
          hause=new GreenfootImage("casa.png");
          setImage(hause);
    }    
}
