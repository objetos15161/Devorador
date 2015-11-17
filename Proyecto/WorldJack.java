import greenfoot.*;

/**
 * La clase WorldJack va a contener el escenario del juego y se checaran el cambio de niveles.
 * Se crearan los objetos o clases y su movimientos.
 * Inclute metódos de validaion de algunos objetos o clases.
 * 
 * @author (Castillo Rodriguez Karen) 
 * @author ( Beatriz )
 * @version (2015.11.26)
 */
public class WorldJack extends World
{

   private Reloj reloj;
   private Devorador jack;
   private SimpleTimer tiempo;

    /**
     * EL constructor de la clase WorldJack. Se crea el escenario el orden de las clases, el tamaño del entorno,
     * por los pixeles.
     * 
     */
    public WorldJack()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1); 
        setPaintOrder(Devorador.class,Fresa.class,Manzana.class,Platano.class,Pizza.class);
        prepara();
    }
    /**
     * Esta creando siempre la fruta en diferentes lugares.
    */
    public void act()
    {
        creaFruta();
        
    }
    /**
     * Este método coloca aleatoriamente en  lugares del mundo los
     * objetos Platano,Manzana,Pizza y Hamburguesa.
    */
    public void creaFruta(){
        
        if ( Greenfoot.getRandomNumber(1000) < 30 ){ 
             creaPlatano();
          
            }
        if ( Greenfoot.getRandomNumber(1000) < 20)
            { 
            creaManzana();
          
        }
        
        if ( Greenfoot.getRandomNumber(1000) < 30)
            { 
            creaPizza();
          }
             }
    /**
     *  El método prepara coloca los objetos fijos como son los estantes de fruta y la poscicion inicial de el Devorador.
        También se crean aleatoriamente la clase Fresa, fija la poscicion de objeto Reloj y Exit.  
        Los agrega al WorldJack.
     */
    public void prepara()
    {  
        int x= getWidth();
        int y= getHeight();
        Devorador jack = new Devorador(0,100);
        Exit e = new Exit(); 
        Selve selve = new Selve();
        Selve selve1 = new Selve();
        Selve selve2 = new Selve();
        Selve selve3 = new Selve();
        Selve selve4 = new Selve();
        Selve selve5 = new Selve();
        Fresa str= new Fresa();
        Fresa  str1= new Fresa();
        Fresa str2= new Fresa();
        reloj=new Reloj();
        
        
        addObject(reloj,getWidth()-50,30);
        addObject(jack,(getWidth()/2),getHeight()-250);
        addObject(selve,750,480);
        addObject(selve1,650,480);
        addObject(selve2,550,480);
        addObject(selve3,60,480);
        addObject(selve4,160,480);
        addObject(selve5,260,480);
        addObject(e,getWidth()-780,250);
        
        addObject(str, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
        addObject(str1, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
        addObject(str2, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
    }
    /**
     * Crea el Objeto Platano aleatoriamente sobre el ancho del mundo x=0, y a una altura de  y=460.
     */
    private void creaPlatano()
    {
       Platano p= new Platano();
       int y = getHeight();
       int x = Greenfoot.getRandomNumber(getWidth());//y va a tomar diferentes posiciones
       addObject(p,x,y-40);
    }
    /** 
     * Crea el Objeto Manzana aleatoriamente  sobre en x=0 y y=50 en el WorldJack
     */
     private void creaManzana()
    {
      Manzana m= new Manzana();
       int x = Greenfoot.getRandomNumber(getWidth());//y va a tomar diferentes posiciones
       addObject(m,x,50);
    }
    /**
     * Crea el Objeto Pizza aleatoriamente sobre y.
     */
    private void creaPizza()
    {
       Pizza p= new Pizza();
        int y = Greenfoot.getRandomNumber(getHeight());//y va a tomar diferentes posiciones
        addObject(p,50, y);
         
    }
   
}
