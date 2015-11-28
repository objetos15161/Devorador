import greenfoot.*;

/**
 * El objeto de esta clase da 20 puntos al Devorador y en esta misma se hacen las validaciones correspondientes
 * 
 * @author (Karen Castillo Rodriguez) 
 * @author (Beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class Manzana extends Puntos
{   
    
    /**
     * Se manda llamar al metodo que hace los movimientos de la manzana
     */
    public void act() 
    { 
        this.setRotation(90);
        mueveManzana();

        super.checaLimite();

    }

    /**
     * Este metodo hace todas las validaciones necesarias para el movimiento de la manzana que es forma de escalera 
     */
    public void mueveManzana()
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
            this.setLocation(getX()+50, getY());
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
            this.setLocation(getX()+50, getY());
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
            this.setLocation(getX()+50, getY());
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
            this.setLocation(getX()+50, getY());
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

