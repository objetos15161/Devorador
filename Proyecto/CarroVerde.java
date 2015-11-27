import greenfoot.*;

/**
 * Vehiculo que aparecera en el ultimo nivel y dejara un rastro de bombas 
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano ) 
 * @version (2015.11.27)
 */
public class CarroVerde extends Vehiculo
{
    /**
     * Hace las validaciones necesarias para agregar bombas al paso del carro
     */

    public void act() 
    {
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
