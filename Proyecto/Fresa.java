import greenfoot.*;

/**
 * Write a description of class Fresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fresa extends Comida
{   
    private int valorFresa;
    /**
     * Act - do whatever the Fresa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fresa()
    {
      valorFresa=20;
     
    }
    public void act() 
    {
        
         aparece();
         chechaLimites();
  
        
    }   
    
    public void aparece()
    {
       World w;
        w= getWorld();
        int x= w.getWidth();
        int y= w.getHeight();
     
        if ( Greenfoot.getRandomNumber(1000) < 10 ){
            setLocation(Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y-100));
        } 
    }
    
    public void chechaLimites()
    {  World world = getWorld();
        int x = getX();
        int y = getY();
        int ancho = world.getWidth();
         int alto = world.getHeight();
        if((y>alto-500) && (y<alto-450)){
         this.setLocation(Greenfoot.getRandomNumber(ancho), Greenfoot.getRandomNumber(alto-100));
        }
    }
    
     /**
     * Este metodo va acumulando los puntos que lleva el ladron segun sea el valor de la Fresa
     * 
     */
     public void acumulaPuntos() 
    {
         //int puntos=((WorldJack)(getWorld())).getDevorador().getPuntos();
         //puntos=puntos+this.valorFresa;
       //  super.acumulaPuntos(puntos);
    }   
    
}
