import greenfoot.*;

/**
 * La clase Hamburguesa aparece en menor cantidad en el juego y tiene un movimiento en zig-zag
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano )
 * @version (2015.11.27)
 */
public class Hamburguesa extends Obstaculo
{
    /**
     *Manda llamar a el método checaHambur
     */
    public void act() 
    {
        mueveHam();
        checaHambur();
    }    

    /**
     * El método checaHambur verifica si el objeto esta en el limite y lo elimina.
     */
    public void checaHambur()
    { 
        World world;
        world = getWorld();
        int y = getY();
        int alto = world.getHeight();
        if(y == alto-30)
            world.removeObject(this);
    }

    /**
     *Este metodo hace el movimiento en zig-zag 
     */
    public void mueveHam()
    {
        if(getY()>20 && getY()<100 )
        {
            this.setLocation(getX(), getY()+2);
        }
        if(getY()==100)
        {
            this.setLocation(getX()+100, getY());
        }

        if(getY()>=100 && getY()<200 )
        {
            this.setLocation(getX(), getY()+2);
        }

        if(getY()==200)
        {
            this.setLocation(getX()-100, getY());
        }

        if(getY()>=200 && getY()<300 )
        {
            this.setLocation(getX(), getY()+2);
        }

        if(getY()==300)
        {
            this.setLocation(getX()+100, getY());
        }

        if(getY()>=300 && getY()<400 )
        {
            this.setLocation(getX(), getY()+2);
        }
        if(getY()==400)
        {
            this.setLocation(getX()-100, getY());
        }

        if(getY()>=400 && getY()<480 )
        {
            this.setLocation(getX(), getY()+2);
        }

    }
}
