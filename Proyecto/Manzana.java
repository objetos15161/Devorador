import greenfoot.*;

/**
 * Write a description of class Manzana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manzana extends Puntos
{   
 
    /**
     * Act - do whatever the Manzana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
       this.setRotation(90);
       mueveManzana();
       
       super.checaLimite();
      
    }

    public void mueveManzana()
    {   
        
            if(getY()>20 && getY()<100 )
            {
              this.setLocation(getX(), getY()+2);
            }
            if(getY()==100)
            {
             this.setLocation(getX()+50, getY());
            }
             
             if(getY()>=100 && getY()<200 )
            {
              this.setLocation(getX(), getY()+2);
            }
            
             if(getY()==200)
            {
             this.setLocation(getX()+50, getY());
            }
            
             if(getY()>=200 && getY()<300 )
            {
              this.setLocation(getX(), getY()+2);
            }
            
             if(getY()==300)
            {
             this.setLocation(getX()+50, getY());
            }
            
             if(getY()>=300 && getY()<400 )
            {
              this.setLocation(getX(), getY()+2);
            }
            if(getY()==400)
            {
             this.setLocation(getX()+50, getY());
            }
            
            if(getY()>=400 && getY()<480 )
            {
              this.setLocation(getX(), getY()+2);
            }
        }
  
}

