import greenfoot.*;

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Obstaculo
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
       checaPizza();
       //checaMargen();
     //  super.checa();
    }    
     public void checaPizza()
    {
       // World world;
        World world = getWorld();
        int x = getX();
        int y = getY();
        int ancho = world.getWidth();
         int alto = world.getHeight();
       if(x>=ancho-20 )
       {
           world.removeObject(this);
       }
       if(y>alto-100){
         world.removeObject(this);
        }
        /** margen*/
        if((y>alto-500) && (y<alto-450)){
         world.removeObject(this);
        }
     }
}
