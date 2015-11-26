import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.UserInfo; 

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records  
{
    // instance variables - replace the example below with your own
    private UserInfo jugador;

    /**
     * Constructor for objects of class Records
     */
    public Records()
    {
         if ((UserInfo.isStorageAvailable()) && (UserInfo.getMyInfo() != null)) {
          this.jugador = UserInfo.getMyInfo();
        }
    }

   public void guardaRecords(int puntos)
    {
         if((UserInfo.isStorageAvailable()) && (this.jugador != null) && ((puntos > this.jugador.getScore())) || (this.jugador.getInt(0))==0){ 
            this.jugador.setScore(puntos);
            this.jugador.setInt(0,1); 
            this.jugador.store();
        }
        
        if((UserInfo.isStorageAvailable()) && (this.jugador != null) && (puntos > this.jugador.getScore())){
            this.jugador.setScore(puntos);
            this.jugador.setInt(0,1); 
            this.jugador.store();
        }
    }
    
}
