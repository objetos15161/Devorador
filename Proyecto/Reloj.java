import greenfoot.*;

/**
 * Este clase nos ayudara a saber el tiempo en el juego
 * 
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class Reloj extends Actor

{
    private SimpleTimer timer;
    private Counter valor;
    /**
     * Constructor del reloj en el cual se agrega un contador
     */

    public Reloj()
    {
        valor = new Counter("Tiempo: ");
        timer = new SimpleTimer();
    }

    protected void addedToWorld(World mundo)
    {
        mundo.addObject(valor,745,20);
    }

    /**
     * Aumenta cada segundo
     */
    public void act() 
    {
        if(timer.millisElapsed()>1000)
        {
            valor.add(1);
            timer.mark();
        }
    }   
}    

