import greenfoot.*;

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Obstaculo
{
      private GreenfootImage bom;
    /**
     * Act - do whatever the Ganaste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bomba() 
    {
        // Add your action code here.
          bom=new GreenfootImage("bombo.png");
          setImage(bom);
    }      
}
