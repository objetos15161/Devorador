import greenfoot.*;

/**
 * Write a description of class CarroVerde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarroVerde extends Vehiculo
{
    /**
     * Act - do whatever the CarroVerde wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        // Add your action code here.
        
        move(-5);
        if(getX()==600){
              Bomba b =new Bomba();
               Bomba b6 =new Bomba();
              getWorld().addObject(b,630,230);
              getWorld().addObject(b6,630,400);
            }
       if(getX()==400){
              Bomba b2 =new Bomba();
               Bomba b5 =new Bomba();
              getWorld().addObject(b2,430,230);
              getWorld().addObject(b5,430,400);
            }
            if(getX()==100){
              Bomba b2 =new Bomba();
               Bomba b4 =new Bomba();
              getWorld().addObject(b2,130,230);
              getWorld().addObject(b4,130,400);
            }
            super.removeVehiculo();
    }    
}
