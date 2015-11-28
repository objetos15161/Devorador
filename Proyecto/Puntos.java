import greenfoot.*;

/**
 * De esta clase se crean los diferentes tipos de comida
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class Puntos extends Actor
{
    /**
     * Checa cuando la comida llega a los bordes y la elimina
     */

    public void checaLimite()
    {
        World world;
        world = getWorld();
        int y = getY();
        int alto = world.getHeight();
        if(y == alto-50)
            world.removeObject(this);
    }
}
