import greenfoot.*;

/**
 * Esta clase WorldAyuda muestra la ayuda necesaria para el Jugador.
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class WorldAyuda extends World
{
    private AtrasBoton atras;
    // private GreenfootSound clic;
    /**
     * Constructor de la clase WorldAyuda
     * 
     */
    public WorldAyuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        atras=new AtrasBoton();
        addObject(atras,750,450);
        // clic=new GreenfootSound("select.wav");
    }

    /**
     * Este metodo verifica si se hizo click sobre la flecha para regresar al menú principal
     */
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null){ 

            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==atras){
                // clic.play();
                Greenfoot.setWorld(new WorldMenu());
            }

        }   
    }
}
