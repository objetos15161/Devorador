import greenfoot.*;

/**
 * Crea un Objeto Perdiste.
 * 
 * @author (Karen Catillo Rodriguez) 
 * @version (2015.11.26)
 */
public class Perdiste extends Actor
{   
    private GreenfootImage mensaje;
    /**
     * El constructor de Perdiste crea un objeto con la imagen.
     */
    public Perdiste() 
    {
        // Add your action code here.
          mensaje=new GreenfootImage("gameover2.png");
          setImage(mensaje);
    }    
}
