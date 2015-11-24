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
    private RecordsBoton records;
    private CreditosBoton creditos;
    private AyudaBoton ayuda;

    
    /**
     * Constructor for objects of class WorldMenu.
     * 
     */
    public WorldMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,600, 1);
        
        jugar=new JugarBoton();
        ayuda=new AyudaBoton();
        records=new RecordsBoton();
        creditos=new CreditosBoton();
        
      
        
        addObject(jugar,getWidth()/4+15,getHeight()/2-120);
        addObject(records,getWidth()/4+15,getHeight()-185);
        addObject(ayuda,getWidth()/4+15,getHeight()/2-10);
        addObject(creditos,getWidth()/4+15,getHeight()-70);
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
               Greenfoot.playSound("clickkk.wav");
               Greenfoot.delay(40);
                Greenfoot.setWorld(new WorldJack());
            }
             
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == ayuda){
               Greenfoot.playSound("clickkk.wav");
               Greenfoot.delay(40);
                Greenfoot.setWorld(new WorldAyuda());
            }
    }
    

}
}
