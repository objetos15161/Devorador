import greenfoot.*;

/**
 *El objeto de esta clase suma 10 puntos al Devorador
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class Platano extends Puntos
{   

    /**
     * Hace el moviento de 3 pixeles cada vez que se me mueve 
     */
    public void act() 
    {
        this.setRotation(-90);
        move(3);
        checaPlatano();

    }  

    /**
     * Checa los limites de la pantalla para desaparecer el objeto al llegar a los limites
     */
    public void checaPlatano()
    { 
        World world;
        world = getWorld();
        int y = getY();
        int alto = world.getHeight();
        if((y>alto-500) && (y<alto-400)){
            world.removeObject(this);

        }
    }

}
