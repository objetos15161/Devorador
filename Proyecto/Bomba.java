import greenfoot.*;

/**
 * Esta clase carga la imagen de la Bomba 
 * 
 * @author (Karen Castillo Rodríguez) 
 * @author (Beatriz Adriana Segura Luevano ) 
 * @version (2015.11.27)
 */
public class Bomba extends Obstaculo
{
      private GreenfootImage bom;
    /**
     * Constructor que abre y carga la imagen de la bomba 
     */
    public Bomba() 
    {
          bom=new GreenfootImage("bombo.png");
          setImage(bom);
    }      
}
