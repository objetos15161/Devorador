import greenfoot.*;

/**
 * Write a description of class carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Vehiculo
{
    /**
     * Act - do whatever the carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.removeVehiculo();
        move(-6);
    } 
}
