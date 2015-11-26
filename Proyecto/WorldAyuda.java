import greenfoot.*;

/**
 * Esta clase WorldAyuda muestra la ayuda necesaria para el Jugador.
 * 
 * @author (Karen Castillo Rodriguez) 
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
        super(850, 600, 1); 
        atras=new AtrasBoton();
        addObject(atras,750,530);
       // clic=new GreenfootSound("select.wav");
    }
    
    /**
     * Verifica si se hizo clic sobre la flecha para regresar al menú principal
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
