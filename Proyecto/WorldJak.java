import greenfoot.*;

/**
 * Write a description of class WorldJak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldJak extends World
{

    /**
     * Constructor for objects of class WorldJak.
     * 
     */
    public WorldJak()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1); 
        prepara();
    }
    public void act()
    {
         if ( Greenfoot.getRandomNumber(1000) < 10 )
            { 
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
        
    
        Devorador jack = new Devorador(); 
        Exit e = new Exit(); 
        Selve selve = new Selve();
        Selve selve1 = new Selve();
        Selve selve2 = new Selve();
        Selve selve3 = new Selve();
        Fresa str= new Fresa();
        Fresa  str1= new Fresa();
        
        

        addObject(jack,(getWidth()/2),getHeight()-250);
     
        addObject(selve,750,20);
        addObject(selve1,650,20);
        addObject(selve2,550,20);
        addObject(selve3,60,20);
        addObject(e,getWidth()/2,25);
       
       addObject(str, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
       addObject(str1, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));

    }
    
    private void creaPlatano()
    {
       Platano p= new Platano();
     //  x getWidth();
     //  y getHeight();
       
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
   /*  private void creaFresa()
    {
      Fresa f= new Fresa();
      
      int x= getWidth();
      int y= getHeight();
   
      addObject(f, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
    }*/
    
}
