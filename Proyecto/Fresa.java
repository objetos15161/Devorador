import greenfoot.*;

/**
 * Esta clase es la que da mas puntos al Devorador y aparece y desaparece de la pantalla
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class Fresa extends Puntos
{   

    /**
     * Manda llamar los metodos para hacer los movimientos de la fresa
     */
    public void act() 
    {
        aparece();
        chechaLimites();
    }   

    /**
     * En este metodo se hace el movimientos aleatorio de la fresa sobre las coordenadas x,y
     */

    public void aparece()
    {
        World w;
        w= getWorld();
        int x= w.getWidth();
        int y= w.getHeight();

        if ( Greenfoot.getRandomNumber(1000) < 10 ){
            setLocation(Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y-100));
        } 
    }

    /**
     * Este metodo checa las coordenadas x,y de la fresa para poder eliminarla al llegar a los bordes
     */
    public void chechaLimites()
    {  World world = getWorld();
        int x = getX();
        int y = getY();
        int ancho = world.getWidth();
        int alto = world.getHeight();
        if((y>alto-500) && (y<alto-450)){
            this.setLocation(Greenfoot.getRandomNumber(ancho), Greenfoot.getRandomNumber(alto-100));
        }
    }

    
}
