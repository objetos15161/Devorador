import greenfoot.*; 

/**
 * La clase Pizza aparece en el primer nive moviendose de izquierda a derecha en movimiento constante.
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano )
 * @version (2015.11.27)
 */
public class Pizza extends Obstaculo
{
    /**
     *Manda llamar a el método checaPizza
     */
    public void act() 
    {
        move(1);
        checaPizza();
    }    

    /**
     * El método checaPizza verifica si el objeto esta en el limite y lo elimina.
     */
    public void checaPizza()
    {
        World world = getWorld();
        int x = getX();
        int y = getY();
        int ancho = world.getWidth();
        int alto = world.getHeight();
        if(x>=ancho-20 )
        {
            world.removeObject(this);
        }
        if(y>alto-100){
            world.removeObject(this);
        }
        /** margen*/
        if((y>alto-500) && (y<alto-450)){
            world.removeObject(this);
        }
    }
}
