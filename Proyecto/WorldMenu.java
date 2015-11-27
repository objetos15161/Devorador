import greenfoot.*;

/**
 * Esta clase WorldMenu contiene el menu principal del Juego se validan las diferentes opciones que contiene
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class WorldMenu extends World
{

    private JugarBoton jugar;
    private RecordsBoton records;
    private CreditosBoton creditos;
    private AyudaBoton ayuda;

    /**
     * Constructor for objects of class WorldMenu. 
     * Crea el mundo y los botones del menú.
     */
    public WorldMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1);

        jugar=new JugarBoton();
        ayuda=new AyudaBoton();
        records=new RecordsBoton();
        creditos=new CreditosBoton();

        
        addObject(jugar,getWidth()/4+15,getHeight()/2-80);
        addObject(records,getWidth()/4+15,getHeight()-150);
        addObject(ayuda,getWidth()/4+15,getHeight()/2+10);
        addObject(creditos,getWidth()/4+15,getHeight()-70);
    }

    /**
     * Invoca a los métodos del WorldMenu.
     * validar el botón que se de click y pueda acceder al mundo correspondiente.
     */
    public void act(){
        verifica();
    }

    /**
     * El método verifica checa los botones del menú , y según sea el botón presionado hace 
     * la acción indicada
     */
    public void verifica()
    {

        if(Greenfoot.getMouseInfo()!=null){ 
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == jugar){
                Greenfoot.playSound("kk.wav");
                Greenfoot.delay(40);
                Greenfoot.setWorld(new WorldJack());
            }

            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == ayuda){
                Greenfoot.playSound("kk.wav");
                Greenfoot.delay(40);
                Greenfoot.setWorld(new WorldAyuda());
            }

            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == records){
                Greenfoot.playSound("kk.wav");
                Greenfoot.delay(40);
                Greenfoot.setWorld(new WorldRecords());
            }
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == creditos){
                Greenfoot.playSound("kk.wav");
                Greenfoot.delay(40);
                Greenfoot.setWorld(new WorldCreditos());
            }
        }
    }
}
