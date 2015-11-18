import greenfoot.*;

/**
 * Write a description of class Hamburgesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hamburguesa extends Obstaculo
{
    /**
     * Act - do whatever the Hamburgesa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mueveHam();
        checaHambur();
    }    
    
    public void checaHambur()
    { 
        World world;
        world = getWorld();
        int y = getY();
        int alto = world.getHeight();
       if(y == alto-30)
           world.removeObject(this);
    }
    
    public void mueveHam()
    {
        if(getY()>20 && getY()<100 )
            {
              this.setLocation(getX(), getY()+5);
            }
            if(getY()==100)
            {
             this.setLocation(getX()+100, getY());
            }
             
             if(getY()>=100 && getY()<200 )
            {
              this.setLocation(getX(), getY()+5);
            }
            
             if(getY()==200)
            {
             this.setLocation(getX()-100, getY());
            }
            
             if(getY()>=200 && getY()<300 )
            {
              this.setLocation(getX(), getY()+5);
            }
            
             if(getY()==300)
            {
             this.setLocation(getX()+100, getY());
            }
            
             if(getY()>=300 && getY()<400 )
            {
              this.setLocation(getX(), getY()+5);
            }
            if(getY()==400)
            {
             this.setLocation(getX()-100, getY());
            }
            
            if(getY()>=400 && getY()<480 )
            {
              this.setLocation(getX(), getY()+5);
            }
        
        
    }
    
}
