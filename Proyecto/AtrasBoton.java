import greenfoot.*;

/**
 * Write a description of class AtrasBoton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AtrasBoton extends Actor
{
    private GreenfootImage atras;
    //private GreenfootSound clic;
    public AtrasBoton()
    {
        atras=new GreenfootImage("RE.png");
        setImage(atras);
       // clic=new GreenfootSound("select.wav");
    }
    
    public void act()
    {
        
            if(Greenfoot.getMouseInfo()!=null){
           
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==this){
               //((BurglarWorld)(getWorld())).detenerMusica();
              // clic.play();
                Greenfoot.setWorld(new WorldMenu());
            }
            
          }   
    }   
}
