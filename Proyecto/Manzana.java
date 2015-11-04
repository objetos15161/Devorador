import greenfoot.*;

/**
 * Write a description of class Manzana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manzana extends Comida
{
    /**
     * Act - do whatever the Manzana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  //this.setRotation(90);
        //move(5);
       mueveManzana();
        checaManzana();
    }
    public void checaManzana()
    { //  x getWidth();
     //  y getHeight();
        World world;
        world = getWorld();
        int y = getY();
        int alto = world.getHeight();
       if(y == alto-30)
           world.removeObject(this);
    }
    public void mueveManzana()
    {   int y = getY();
 
         for(int i=5;i<y;i++)
        {
          if(y==i)
          this.setLocation(getX()+i,getY());  
           this.setRotation(0);
        }
        this.setRotation(90);
}
}