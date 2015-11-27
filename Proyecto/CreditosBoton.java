import greenfoot.*;

/**
 * Esta clase crea el Boton que te llevara a los creditos en la pantalla principal 
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano )
 * @version (2015.11.27)
 */
public class CreditosBoton extends Actor
{
    private GreenfootImage botonC;

    /**
     * Constructor que agrega la imagen al boton 
     */
    public CreditosBoton()
    {
        botonC=new GreenfootImage("CREDITOS.jpg");
        setImage(botonC);
    }  
}
