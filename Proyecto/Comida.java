import greenfoot.*;

/**
 * Write a description of class Comida here.
 * 
 * @author (Karen Castillo Rodríguez)
 * @author (Segura Luevano Beatriz Adriana)
 * @version (2015.11.27)*/
public class Comida extends Actor
{
    /**
     * Este metodo checa los limites de la pantalla para asi remover los objetos al llegar a los extremos
     */

    public void checaLimite()
    { 
        World world;
        world = getWorld();
        int y = getY();
        int alto = world.getHeight();
        if(y == alto-30)
            world.removeObject(this);
    }
}
