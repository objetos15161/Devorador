import greenfoot.*;

/**
 * Crea un Objeto Perdiste.
 * @author (Karen Castillo Rodriguez) 
 * @author (beatriz Adriana Segura Luevano) 
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
          mensaje=new GreenfootImage("gameover2.png");
          setImage(mensaje);
    }    
}
