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
   
   private Reloj reloj;
   private Devorador jack;
   private GreenfootSound musica;


    /**
     * EL constructor de la clase WorldJack. Se crea el escenario el orden de las clases, el tamaño del entorno,
     * por los pixeles.
     * 
     */
    public WorldJack()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1); 
         
        musica=new GreenfootSound("Two.mp3");
        setPaintOrder(Devorador.class,Fresa.class,Manzana.class,Platano.class,Pizza.class,Hamburguesa.class);
        preparaMundo();
        
        //sonido=new GreenfootSound(".mp3");


    }


    /**
     * Esta creando siempre la fruta en diferentes lugares.
     */
    public void act()
    {   musica.playLoop();
       switch (jack.getNivel())
       {
           case 1:
                 primerNivel();
                 break;
           case 2:
                 segundoNivel();
                 break;    
        }
    }

    /**
     * Este método coloca aleatoriamente en  lugares del mundo los
     * objetos Platano,Manzana,Pizza y Hamburguesa.
     */
    public void primerNivel(){

        if ( Greenfoot.getRandomNumber(1000) < 30 ){ 
            creaPlatano();
        }
        if ( Greenfoot.getRandomNumber(1000) < 20 )
        { 
            creaManzana();
        }

        if ( Greenfoot.getRandomNumber(1000) < 5)
        { 
            creaPizza();
        }
        
        if ( Greenfoot.getRandomNumber(1000) < 4)
        { 
            creaHamburguesa();
        }
    }
    
    public void segundoNivel()
    {
         //Carro c= new Carro();
         //Autobus a= new Autobus();
         Bache b=new Bache();
         Bache b1=new Bache();
         Nena n1 = new Nena();
         setBackground("fondo1.png");
         setPaintOrder(Autobus.class,Carro.class,Devorador.class);  
         removeObjects(getObjects(Fresa.class));
         removeObjects(getObjects(Manzana.class));
         removeObjects(getObjects(Platano.class));
         removeObjects(getObjects(Pizza.class));
         removeObjects(getObjects(Hamburguesa.class));
         removeObjects(getObjects(Selve.class));
          addObject(b,300,300);
          addObject(b1,700,400);
          addObject(n1,400,400);

        if(Greenfoot.getRandomNumber(1000) < 8 )
        { 
            creaCarro();
        }
        
        if(Greenfoot.getRandomNumber(1000) < 5 )
        { 
            creaAutobus();
        }
         
    }
        
    /**
     *  El método prepara coloca los objetos fijos como son los estantes de fruta y la posicion inicial de el Devorador.
    También se crean aleatoriamente la clase Fresa, fija la posicion de objeto Reloj y Exit.  
    Los agrega al WorldJack.
     */
    public void preparaMundo()
    {  
        int x= getWidth();
        int y= getHeight();
        jack = new Devorador(0,3,1);
        reloj=new Reloj();
       // Exit e = new Exit(); 
        Selve selve = new Selve();
        Selve selve1 = new Selve();
        Selve selve2 = new Selve();
        Selve selve3 = new Selve();
        Selve selve4 = new Selve();
        Selve selve5 = new Selve();
        Fresa str= new Fresa();
        Fresa  str1= new Fresa();
        Fresa str2= new Fresa();
        

        addObject(reloj,getWidth()-30,20);
        addObject(jack,(getWidth()/2),getHeight()-250);
        addObject(selve,750,480);
        addObject(selve1,650,480);
        addObject(selve2,550,480);
        addObject(selve3,60,480);
        addObject(selve4,160,480);
        addObject(selve5,260,480);
      //  addObject(e,getWidth()-780,250);

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
     * Crea el Objeto Hamburguesa aleatoriamente sobre x.
     */
    private void creaHamburguesa()
    {
        Hamburguesa h= new Hamburguesa();
        int x = Greenfoot.getRandomNumber(getWidth());//x va a tomar diferentes posiciones
        int y = Greenfoot.getRandomNumber(getHeight());//y va a tomar diferentes posiciones
        addObject(h,x,50);
    }
    
    private void creaCarro()
    {
        Carro c= new Carro();
        int x = Greenfoot.getRandomNumber(getWidth());//x va a tomar diferentes posiciones
        int y = Greenfoot.getRandomNumber(getHeight());//y va a tomar diferentes posiciones
        addObject(c,790,300);
    }
    
    private void creaAutobus()
    {
        Autobus a= new Autobus();
        int x = Greenfoot.getRandomNumber(getWidth());//x va a tomar diferentes posiciones
        int y = Greenfoot.getRandomNumber(getHeight());//y va a tomar diferentes posiciones
        addObject(a,790,450);
    }
    /**
     * Método que detiene la música cuando se termina el juego
     */
    public void detenerMusica()
    {
       musica.stop();
       
    }
    /**
     * Método que es llamado por el sistema de Greenfoot cuando se ha iniciado la simulación, y
     * empieza iniciando el sonido del juego
     */
    public void started()
    {
        super.started();
        musica.play();
        
    }
    
    /**
     * Método que es llamado por el sistema de Greenfoot cuando se pone en pausa el proyecto, cuando sucede esto 
     * tambien se pause la canción
     */
    public void stopped()
    {
        super.stopped();
        musica.pause();
        
    }
    
}
    
  