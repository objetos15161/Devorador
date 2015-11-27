import greenfoot.*;

/**
 * El AyudaBoton permite ir A WorldAyuda.
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class AyudaBoton extends Actor
{
    private GreenfootImage botonAyuda;
    /**
     * Constructor para agregar la imagen del boton Ayuda 
     */
    public AyudaBoton()
    {
        botonAyuda=new GreenfootImage("ayudabot.jpg");
        setImage(botonAyuda);
    }  
}
