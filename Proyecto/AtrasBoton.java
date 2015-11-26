import greenfoot.*;

/**
 * El AtrasBoton permite regresar al menú del Juego.
 * 
 * @author (Karen Castillo Rodriguez) 
 * @version (2015.11.27)
 */
public class AtrasBoton extends Actor
{
    private GreenfootImage atras;
    /**
     * Constructor de la clase AtrasBoton
     */
    public AtrasBoton()
    {
        atras=new GreenfootImage("RE.png");
        setImage(atras);
       // clic=new GreenfootSound("select.wav");
    }
    
    public void act()
    {
        
            if(Greenfoot.getMouseInfo()!=null){
           
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==this){
               //((BurglarWorld)(getWorld())).detenerMusica();
              // clic.play();
                Greenfoot.setWorld(new WorldMenu());
            }
            
          }   
    }   
}
