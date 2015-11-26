import greenfoot.*;

/**
 * Clase WorldCreditos muestra los créditos del Juego.
 * 
 * @author (Karen Castillo Rodríguez) 
 * @version (2015.11.27)
 */
public class WorldCreditos extends World
{
    private AtrasBoton a;
    private GreenfootSound c;
    private ScoreBoard score;
    /**
     * Constructor for objects of class WorldCreditos.
     * 
     */
    public WorldCreditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        a=new AtrasBoton();
        addObject(a,700,400);
    }
      /**
     * Checa si se presiono la flecha de regresar, para mandar al jugador al menú principal
     */
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null){
           
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==a){
             //  clic.play();
                Greenfoot.setWorld(new WorldMenu());
            }
            
        }   

    }
}