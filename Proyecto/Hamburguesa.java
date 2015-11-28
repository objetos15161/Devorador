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
        if(y == alto-50)
            world.removeObject(this);
    }

    /**
     *Este metodo hace el movimiento en zig-zag 
     */
    public void mueveHam()
    {
         if(getY()>20 && getY()<50 )
        {
            this.setLocation(getX(), getY()+1);
        }
        if(getY()==50)
        {
            this.setLocation(getX()+50, getY());
        }

        if(getY()>=50 && getY()<100 )
        {
            this.setLocation(getX(), getY()+1);
        }

        if(getY()==100)
        {
            this.setLocation(getX()-50, getY());
        }

        if(getY()>=100 && getY()<150 )
        {
            this.setLocation(getX(), getY()+1);
        }

        if(getY()==150)
        {
            this.setLocation(getX()+50, getY());
        }

        if(getY()>=150 && getY()<200 )
        {
            this.setLocation(getX(), getY()+1);
        }
        if(getY()==200)
        {
            this.setLocation(getX()-50, getY());
        }

        if(getY()>=200&& getY()<250 )
        {
            this.setLocation(getX(), getY()+1);
        }
        if(getY()==250)
        {
            this.setLocation(getX()+50, getY());
        }
        
         if(getY()>=250&& getY()<300 )
        {
            this.setLocation(getX(), getY()+1);
        }
        if(getY()==300)
        {
            this.setLocation(getX()-50, getY());
        }
        
         if(getY()>=300&& getY()<350 )
        {
            this.setLocation(getX(), getY()+1);
        }
        if(getY()==350)
        {
            this.setLocation(getX()+50, getY());
        }
        
         if(getY()>=350&& getY()<400 )
        {
            this.setLocation(getX(), getY()+1);
        }
        if(getY()==400)
        {
            this.setLocation(getX()-50, getY());
        }
        
         if(getY()>=400&& getY()<450 )
        {
            this.setLocation(getX(), getY()+1);
        }
        if(getY()==450)
        {
            this.setLocation(getX()+50, getY());
        }
    }
}
