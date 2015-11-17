import greenfoot.*;

/**
 * Write a description of class Manzana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manzana extends Comida
{   
    int valorManzana;
    /**
     * Act - do whatever the Manzana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
       this.setRotation(90);
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
    {   
        
            if(getY()>20 && getY()<100 )
            {
              this.setLocation(getX(), getY()+5);
            }
            if(getY()==100)
            {
             this.setLocation(getX()+50, getY());
            }
             
             if(getY()>=100 && getY()<200 )
            {
              this.setLocation(getX(), getY()+5);
            }
            
             if(getY()==200)
            {
             this.setLocation(getX()+50, getY());
            }
            
             if(getY()>=200 && getY()<300 )
            {
              this.setLocation(getX(), getY()+5);
            }
            
             if(getY()==300)
            {
             this.setLocation(getX()+50, getY());
            }
            
             if(getY()>=300 && getY()<400 )
            {
              this.setLocation(getX(), getY()+5);
            }
            if(getY()==400)
            {
             this.setLocation(getX()+50, getY());
            }
            
            if(getY()>=400 && getY()<480 )
            {
              this.setLocation(getX(), getY()+5);
            }
        }
    /**
     * Este metodo va acumulando los puntos que lleva el ladron segun sea el valor de la Fresa
     * 
     */
     public void acumulaPuntos() 
    {
         //int puntos=((WorldJack)(getWorld())).getDevorador().getPuntos();
         //puntos=puntos+this.valorManzana;
         //super.acumulaPuntos(puntos);
    }   
}

