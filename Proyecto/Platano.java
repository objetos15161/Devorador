import greenfoot.*;

/**
 * Write a description of class Plantano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platano extends Comida
{   
    int valorPlatano;
    /**
     * Act - do whatever the Plantano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.setRotation(-90);
         move(5);
         checaPlatano();
   
    }  
    public void checaPlatano()
    { //  x getWidth();
     //  y getHeight();
        World world;
        world = getWorld();
        int y = getY();
        int alto = world.getHeight();
    if((y>alto-500) && (y<alto-400)){
         world.removeObject(this);
       
    }
   }
    /**
     * Este metodo va acumulando los puntos que lleva el ladron segun sea el valor de la Fresa
     * 
     */
     public void acumulaPuntos() 
    {
        // int puntos=((WorldJack)(getWorld())).getDevorador().getPuntos();
         //puntos=puntos+this.valorPlatano;
         //super.acumulaPuntos(puntos);
    }  
}
