import greenfoot.*;
/**
 * El AtrasBoton permite regresar al menú del Juego.
 * @author (Karen Castillo Rodriguez) 
 * @author (beatriz Adriana Segura Luevano) 
 * @version (2015.11.27)
 */
public class AtrasBoton extends Actor
{
    private GreenfootImage atras;
    /**
     * Constructor de la clase AtrasBoton se  signa la imagen a la variable tipo GreenfootImage antes definida.
     */
    public AtrasBoton(){
        atras=new GreenfootImage("RE.png");
        setImage(atras);
    }
    /**
    * Este método checa donde esta el apuntador y su esra en este objeto y se da un click entonces se crea un WorldMenu y se accede a este.
     */
    public void act(){
        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==this){
                Greenfoot.setWorld(new WorldMenu());
            }
        }   
    }   
}
