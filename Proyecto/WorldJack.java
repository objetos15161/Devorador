import greenfoot.*;

/**
 * La clase WorldJack va a contener el escenario del juego y se checaran el cambio de niveles.
 * Se crearan los objetos o clases y su movimientos.
 * Inclute metódos de validaion de algunos objetos o clases.
 * 
 * @author (Castillo Rodriguez Karen) 
 * @author (Beatriz Segura Luevano)
 * @version (2015.11.26)
 */
public class WorldJack extends World
{
    private Fresa f;
    private Manzana m;
    private Platano p;
    private Reloj reloj;
    private Devorador jack;
    private Hamburguesa h;
    // private SimpleTimer tiempo;
    private Counter vidas, puntos;
    //private GreenfootSound sonido;

    /**
     * EL constructor de la clase WorldJack. Se crea el escenario el orden de las clases, el tamaño del entorno,
     * por los pixeles.
     * 
     */
    public WorldJack()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1); 
        setPaintOrder(Devorador.class,Fresa.class,Manzana.class,Platano.class,Pizza.class,Hamburguesa.class);
        prepara();
        //vidas=new Counter("Vidas: ");
        //vidas.setValue(5);
        //addObject(vidas,250,30);
        //puntos=new Counter("Puntos: ");
        //puntos.setValue(0);
        //addObject(puntos,30,30);
        //sonido=new GreenfootSound(".mp3");

        prepare();
        
       /** if((Devorador)nivel.getValue()==2)
        {
            removeObjects(getObjects(Fresa.class));
            removeObjects(getObjects(Manzana.class));
            removeObjects(getObjects(Platano.class));
            removeObjects(getObjects(Pizza.class));
            removeObjects(getObjects(Hamburguesa.class));
            setBackground("nivel2.jpg");
            
        }*/
      

    }


    /**
     * Esta creando siempre la fruta en diferentes lugares.
     */
    public void act()
    {
        creaComida();
    }

    /**
     * Este método coloca aleatoriamente en  lugares del mundo los
     * objetos Platano,Manzana,Pizza y Hamburguesa.
     */
    public void creaComida(){

        if ( Greenfoot.getRandomNumber(1000) < 30 ){ 
            creaPlatano();

        }
        if ( Greenfoot.getRandomNumber(1000) < 3 )
        { 
            creaManzana();

        }

        if ( Greenfoot.getRandomNumber(1000) < 30)
        { 
            creaPizza();
        }
        
        if ( Greenfoot.getRandomNumber(1000) < 5)
        { 
            creaHamburguesa();
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
        Devorador jack = new Devorador();
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

    /**
     * Regresa al objeto de la clase Devorador para poder acceder a sus métodos
     * @return Devorador   (un objeto de la clase Devorador)
     */
    public Devorador getDevorador()
    {
        return jack;
    }

    public Fresa getFresa()
    {
        return f;
    }

    public Manzana getManzana()
    {
        return m;
    }

    public Platano getPlatano()
    {
        return p;
    }
    
    private void creaHamburguesa()
    {
        Hamburguesa h= new Hamburguesa();
        int x = Greenfoot.getRandomNumber(getWidth());//x va a tomar diferentes posiciones
        int y = Greenfoot.getRandomNumber(getHeight());//y va a tomar diferentes posiciones
        addObject(h,x,50);

    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
}
