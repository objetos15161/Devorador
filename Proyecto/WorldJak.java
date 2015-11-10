import greenfoot.*;

/**
 * Write a description of class WorldJak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldJak extends World
{

    private Reloj reloj;
    private Devorador jack;
   private SimpleTimer tiempo;

    /**
     * Constructor for objects of class WorldJak.
     * 
     */
    public WorldJak()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1); 
        setPaintOrder(Devorador.class,Fresa.class,Manzana.class,Platano.class,Pizza.class);
        prepara();
    }
    public void act()
    {
        creaFruta();
    }
    public void creaFruta(){
        if ( Greenfoot.getRandomNumber(1000) < 10 ){ 
             creaPlatano();
          
            }
        if ( Greenfoot.getRandomNumber(1000) < 3 )
            { 
            creaManzana();
          
        }
        if ( Greenfoot.getRandomNumber(1000) < 10)
            { 
            creaPizza();
          
        }
    }
    public void prepara()
    {  
        int x= getWidth();
        int y= getHeight();
        Devorador jack = new Devorador(0,100);
        Exit e = new Exit(); 
        Selve selve = new Selve();
        Selve selve1 = new Selve();
        Selve selve2 = new Selve();
        Selve selve3 = new Selve();
        Selve selve4 = new Selve();
        Selve selve5 = new Selve();
        Fresa str= new Fresa();
        Fresa  str1= new Fresa();
        reloj=new Reloj();
        
        
        addObject(reloj,700,10);
        addObject(jack,(getWidth()/2),getHeight()-250);
        addObject(selve,750,480);
        addObject(selve1,650,480);
        addObject(selve2,550,480);
        addObject(selve3,60,480);
        addObject(selve4,160,480);
        addObject(selve5,260,480);
        addObject(e,getWidth()/2,475);
        
        addObject(str, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
        addObject(str1, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
    }
    
    private void creaPlatano()
    {
       Platano p= new Platano();
       int y = getHeight();
       int x = Greenfoot.getRandomNumber(getWidth());//y va a tomar diferentes posiciones
       addObject(p,x,y);
    }
    
     private void creaManzana()
    {
      Manzana m= new Manzana();
     //  x getWidth();
     //  y getHeight();
       
       //int y = getHeight();
       int x = Greenfoot.getRandomNumber(getWidth());//y va a tomar diferentes posiciones
       addObject(m,x,50);
    }
    
    private void creaPizza()
    {
       Pizza p= new Pizza();
        int y = Greenfoot.getRandomNumber(getHeight()+100);//y va a tomar diferentes posiciones
        addObject(p,50, y-100);
    }
   
    
}
