import greenfoot.*;

/**
 * Crea el boton de Jugar en el menu principal 
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class JugarBoton extends Actor
{     
    private GreenfootImage botonJugar;
    /**
     * Constructor del boton Jugar donde solo se agregan las imagenes 
     */
    public JugarBoton()
    {
        botonJugar=new GreenfootImage("JUGAR.jpg");
        setImage(botonJugar);
    }
}
