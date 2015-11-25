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
   private SimpleTimer cuenta,cuenta2;


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
        
        


    }


    /**
     * Esta creando siempre la fruta en diferentes lugares.
     */
    public void act()
    {   
        musica.playLoop();
        
       switch (jack.getNivel())
       {
           case 1:
                 primerNivel();
                 break;
           case 2:
                 
                 segundoNivel();
                 if(cuenta.millisElapsed()>=5000){
                      cuenta.mark();
                      creaAutobus();
                      
                      }
                 if(cuenta2.millisElapsed()>=4000){
                      cuenta2.mark();
                      creaCarro();
                      
                 }
               
                 break; 
           case 3:
                 tercerNivel();
                 if(cuenta.millisElapsed()>=5000){
                      cuenta.mark();
                      creaCarroVerde();
                      
                      }
                 if(cuenta2.millisElapsed()>=8000){
                      cuenta2.mark();
                      creaCarroAzul();
                       removeObjects(getObjects(Bomba.class));
                      
                 }
                 break;

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
        jack = new Devorador(1,5,1);
        reloj=new Reloj();
        
        cuenta=new SimpleTimer();
        cuenta2=new SimpleTimer();
      
        
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
        addObject(jack,(getWidth()/2),getHeight()-50);
        addObject(selve,750,480);
        addObject(selve1,650,480);
        addObject(selve2,550,480);
        addObject(selve3,60,480);
        addObject(selve4,160,480);
        addObject(selve5,260,480);
      

        addObject(str, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
        addObject(str1, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
        addObject(str2, Greenfoot.getRandomNumber(x), Greenfoot.getRandomNumber(y));
    }
    /**
     * Este método coloca aleatoriamente en  lugares del mundo los
     * objetos Platano,Manzana,Pizza y Hamburguesa.
     */
    public void primerNivel(){

        if ( Greenfoot.getRandomNumber(1000) < 30 ){ 
            creaPlatano();
        }
        if ( Greenfoot.getRandomNumber(1000) < 10 )
        { 
            creaManzana();
        }

        if ( Greenfoot.getRandomNumber(1000) < 10)
        { 
            creaPizza();
        }
        
        if ( Greenfoot.getRandomNumber(1000) < 5)
        { 
            creaHamburguesa();
        }
    }
    
    public void segundoNivel()
    {
         
        
         Bache b=new Bache();
         Bache b1=new Bache();
         Bache b2=new Bache();
         Bache b3=new Bache();
         Bache b4=new Bache();
       
         
         Nena n = new Nena();
        
         setBackground("fondo1.jpg");
         setPaintOrder(Autobus.class,Carro.class,Devorador.class);  
         removeObjects(getObjects(Fresa.class));
         removeObjects(getObjects(Manzana.class));
         removeObjects(getObjects(Platano.class));
         removeObjects(getObjects(Pizza.class));
         removeObjects(getObjects(Hamburguesa.class));
         removeObjects(getObjects(Selve.class));
          
         addObject(b,400,300);
         addObject(b1,700,400);
         addObject(b2,600,200);
         addObject(b3,150,200);
         addObject(b4,80,370);

       
    
          addObject(n,100,450);
    }
        
     public void tercerNivel()
    {
       
         setBackground("fondo2.jpg");
         setPaintOrder(CarroVerde.class,CarroAzul.class,Bomba.class);  
         removeObjects(getObjects(Carro.class));
         removeObjects(getObjects(Autobus.class));
         removeObjects(getObjects(Nena.class));
         removeObjects(getObjects(Bache.class));
         Casa c=new Casa();
         addObject(c,385,60);
     
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
        Carro c2= new Carro();
       
        addObject(c,790,210);
        addObject(c2,790,390);
    }
    
    private void creaAutobus()
    {
        Autobus a= new Autobus();
        int x = Greenfoot.getRandomNumber(getWidth());//x va a tomar diferentes posiciones
        int y = Greenfoot.getRandomNumber(getHeight());//y va a tomar diferentes posiciones
        addObject(a,790,300);
    }
    
     private void creaNena()
    {
        Nena n= new Nena();
        //int x = Greenfoot.getRandomNumber(getWidth());//x va a tomar diferentes posiciones
        //int y = Greenfoot.getRandomNumber(getHeight());//y va a tomar diferentes posiciones
        addObject(n,50,450);
    }
    
      private void creaCarroAzul()
    {
        CarroAzul azul= new CarroAzul();
       
        addObject(azul,790,300);
    }
    
      private void creaCarroVerde()
    {
        CarroVerde verde= new CarroVerde();
        CarroVerde verde1= new CarroVerde();
       
        addObject(verde,790,200);
        addObject(verde1,790,360);
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
    
  