import greenfoot.*;

/**
 * Write a description of class WorldMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldMenu extends World
{
    
    private JugarBoton jugar;
   
    /**
     * Constructor for objects of class WorldMenu.
     * 
     */
    public WorldMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,600, 1);
        jugar=new JugarBoton();
        addObject(jugar,getWidth()/4+15,getHeight()/2-120);
    }
    /**
     * Invoca a los métodos del BurglarMenu
     */
    public void act()
    {
        
        verifica();
    }
     public void verifica()
    {
        
        if(Greenfoot.getMouseInfo()!=null){ 
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == jugar){
               // clic.jugar();
             
             //  setImage("jugar2.png");
             // Greenfoot.delay(40);
                //Greenfoot.delay(10);
                Greenfoot.setWorld(new WorldJack());
            }
    }
    

}
}
