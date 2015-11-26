import greenfoot.*;

/**
 * Write a description of class Jack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Devorador extends Actor
{ 
    /**Variable que permitirá avanzar al personaje, contiene los pasos que dara el Devorador*/
    private int avanza;
    /**Contiene la direccion que lleva el Devorador*/
    private int direccion;
    /**Constante que representa la dirección hacia la derecha */
    private static final int DERECHA=5;
    /**Constante que representa la dirección hacia la izquierda */
    private static final int IZQUIERDA=-5;
    /**Constante que representa la dirección hacia arriba */
    private static final int ARRIBA=-5;
    /**Constante que representa la dirección hacia abajo */
    private static final int ABAJO=5;
    /**variable booleana que con un true indica que el personaje esta parado, con un false indica que el personaje esta en movimiento*/
    private boolean paradoB;
    /**Variables para crear las imagenes del Devorador cuando camina*/
    private GreenfootImage paradoI;
    private GreenfootImage der1;
    private GreenfootImage der2;
    private GreenfootImage izq1;
    private GreenfootImage izq2;
    private GreenfootImage abajo1;
    private GreenfootImage abajo2;
    private GreenfootImage abajo3;
    private GreenfootImage arri1;
    private GreenfootImage arri2;

    /**Variable para acumular los puntos que lleva el jugador*/
    private Counter puntos;
    /**Variable que contiene las vidas que tiene el jugador*/
    private Counter vidas;
    /**contiene el nivel en el que se encuentra el jugador*/
    private Counter nivel;
    
    private Records records;

    
    private int flag=0;
    
    /**
     * Act - do whatever the Jack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Devorador(int numPuntos,int numVidas,int numNivel)
    {     
        puntos= new Counter("Puntos: ");
        puntos.setValue(numPuntos);//set cambiar el valor del letrero

        vidas  = new Counter("Vidas: ");
        vidas.setValue(numVidas);

        nivel  = new Counter("Nivel: ");
        nivel.setValue(numNivel);       //set cambiar el valor del letrero

        paradoI=new GreenfootImage("parado.png"); 
        der1=new GreenfootImage("der1.png"); 
        der2=new GreenfootImage("der2.png"); 
        izq1=new GreenfootImage("izq1.png"); 
        izq2=new GreenfootImage("izq2.png"); 
        abajo1=new GreenfootImage("abajo1.png"); 
        abajo2=new GreenfootImage("abajo2.png"); 
        abajo3=new GreenfootImage("abajo3.png"); 
        arri1=new GreenfootImage("arri1.png"); 
        arri2=new GreenfootImage("arri2.png"); 
        setImage(paradoI);
        paradoB=true;
        avanza=0;
        direccion=IZQUIERDA; 
        
         records=new Records();
    }

    /**
     * Este metodo agrega los contadores de nivel, puntos y vidas al mundo cuando se
     * crea el Jugador de nombre Devorador
     */

    protected void addedToWorld(World mundo)//Jack
    {
        mundo.addObject(puntos,55,20);
        mundo.addObject(vidas,290,20);
        mundo.addObject(nivel,490,20);
    }

    public void act() 
    { 
        move();
        caminar();
        validaFruta();
        validaComidaCha();
        validaObstaculos();
        checaVidas();
        validaciones();
        aumentaNivel();
        
    }    

    public void move()
    {
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left")){
            paradoB=false;
            if(Greenfoot.isKeyDown("up")) {
                this.direccion=ARRIBA;
                setLocation(getX(),getY()+ARRIBA);
            }

            if(Greenfoot.isKeyDown("down")){
                this.direccion=ABAJO;
                setLocation(getX(),getY()+ABAJO);
            }

            if(Greenfoot.isKeyDown("right")){
                this.direccion=DERECHA;
                setLocation(getX()+DERECHA,getY());
            }

            if(Greenfoot.isKeyDown("left")){
                this.direccion=IZQUIERDA;
                setLocation(getX()+IZQUIERDA,getY());
            }
        }
        else{
            paradoB=true;
        }
    }

    /**
     * Éste método verifica si el ladron esta parado o caminando con la variable booleana parado. Se verifica su
     * dirección y movimiento y se cambia por la imagen que le corresponda para cuando se presione
     * una tecla se vea que el personaje camina
     */       
    public void avanzaJack()
    {
        if(paradoB==true)
        {
            if(this.direccion==IZQUIERDA){
                paradoI=izq1;
            }
            else{
                paradoI=der1;
            }

            if(this.direccion==ARRIBA){
                paradoI=arri1;}
            else{
                if(this.direccion==ABAJO)
                    paradoI=abajo1;}

        }     
        if(paradoB==false){
            switch(avanza){ 
                case 0: if(this.direccion==IZQUIERDA)
                    paradoI=izq2;

                else{if(this.direccion==DERECHA)
                        paradoI=der2;
                }

                break;  

                case 1: if(this.direccion==IZQUIERDA)

                    paradoI=izq1;

                else{
                    if(this.direccion==DERECHA)
                        paradoI=der1;
                }

                break;
                case 2: if(this.direccion==IZQUIERDA)
                    paradoI=izq2;
                else{if(this.direccion==DERECHA)
                        paradoI=der2;
                }         
                break;
            }
        }
        setImage(paradoI);
    }

    public void caminar()
    {
        avanza++;
        if(avanza>=3){
            avanza=0;
        }
        avanzaJack(); 
    }
     /**
     * Este método contiene las validaciones necesarias para que el Jugador no pase el limite 
     * y que no pase las clases Counter y Selve
     */
    public void validaciones()
    {  
        GreenfootImage miImagen=super.getImage();
        if(this.isTouching(Counter.class) || this.isTouching(Selve.class)){
           
        if(Greenfoot.isKeyDown("up")){ 
          setLocation(getX(),getY()+ABAJO);
        }
          
        if(Greenfoot.isKeyDown("down")){
         setLocation(getX(),getY()+ARRIBA);
        }
         
        if(Greenfoot.isKeyDown("right")){
          setLocation(getX()+IZQUIERDA,getY());
        }
          
        if(Greenfoot.isKeyDown("left")){
          setLocation(getX()+DERECHA,getY());
        }
        }
        if(getY()+miImagen.getHeight()/2>=getWorld().getHeight()){
              this.setLocation(getX(),getY()+ARRIBA);
            }

              
    }

     /**
     * Éste método verifica si el Devorador esta "devorando" frutas, asi mismo agrega sonidos y suma puntos
     */   
    public void validaFruta()
    { 

        if(this.isTouching(Platano.class)){
         
            removeTouching(Platano.class);
            Greenfoot.playSound("c.wav");
            puntos.setValue(puntos.getValue()+10);
        }
        if(this.isTouching(Fresa.class)){
           
            removeTouching(Fresa.class);
            Greenfoot.playSound("c.wav");
           // puntos.setValue(puntos.getValue()+400);
           puntos.setValue(puntos.getValue()+50);
        }
        if(this.isTouching(Manzana.class) ){
           
            removeTouching(Manzana.class);
            Greenfoot.playSound("c.wav");
            puntos.setValue(puntos.getValue()+20);
        }  
       /* if(this.isTouching(FresaBebe.class) ){
           
            removeTouching(FresaBebe.class);
            Greenfoot.playSound("c.wav");
            puntos.setValue(puntos.getValue()+50);
        }*/  
       
    }
    
    /**
     * Éste método verifica si el Devorador esta "devorando" comida chatarra, asi mismo agrega sonidos y resta puntos o vidas segun sea el caso 
     */  
    public void validaComidaCha()
    {
        if(this.isTouching(Pizza.class)){
            World world;
            world=getWorld();
            removeTouching(Pizza.class);
            Greenfoot.playSound("come.wav");
            
            puntos.setValue(puntos.getValue()-5);
            
            this.setLocation(world.getWidth()/2,world.getHeight()-50);
            setImage("salto.png");
            
            Greenfoot.delay(20);
        }  
        
        if(this.isTouching(Hamburguesa.class)){
            World world;
            world=getWorld();
            removeTouching(Hamburguesa.class);
            Greenfoot.playSound("come.wav");
            
            vidas.setValue(vidas.getValue()-1);
            
            this.setLocation(world.getWidth()/2,world.getHeight()-30);
            setImage("muerto1.png");
            
            Greenfoot.delay(20);
        }  
    }
    
    public void validaObstaculos()
    {
        if(this.isTouching(Carro.class) ){
            World world;
            world=getWorld();
            removeTouching(Carro.class);
            Greenfoot.playSound("bocina.wav");
            vidas.setValue(vidas.getValue()-1);
  
            setImage("muerto.png");
            
            Greenfoot.delay(20);
             this.setLocation(600,140);
        } 
        
        if(this.isTouching(CarroVerde.class) ){
            World world;
            world=getWorld();
            removeTouching(CarroVerde.class);
            Greenfoot.playSound("bocina.wav");
            vidas.setValue(vidas.getValue()-1);
  
            setImage("muerto.png");
            
            Greenfoot.delay(20);
             this.setLocation(30,470);
        } 
        
        if(this.isTouching(CarroAzul.class) ){
            World world;
            world=getWorld();
            removeTouching(CarroAzul.class);
            Greenfoot.playSound("bocina.wav");
            vidas.setValue(vidas.getValue()-1);
  
            setImage("muerto.png");
            
            Greenfoot.delay(20);
             this.setLocation(30,470);
        } 
        
       if(this.isTouching(Autobus.class)){
            World world;
            world=getWorld();
            removeTouching(Autobus.class);
            
            
            vidas.setValue(0);
            // vidas.setValue(vidas.getValue()-1);
            
            setImage("muerto.png");
            Greenfoot.playSound("bocina.wav");
            Greenfoot.delay(20);
        }
        if(this.isTouching(Bomba.class)){
            World world = getWorld();
            removeTouching(Bomba.class);
            vidas.setValue(vidas.getValue()-1);
            
            setImage("expo.png");
            Greenfoot.playSound("sony.wav");
            Greenfoot.delay(30);
        }
        if(this.isTouching(Bache.class)){
            puntos.setValue(puntos.getValue()-1);
            setImage("arri2.png");
        }

    }
    
    public void checaVidas()
    {
        if( vidas.getValue()==0 || puntos.getValue()==0)
        {
          World world;
          world = getWorld();
        
          world.addObject(new Perdiste(),400,240);
          Greenfoot.delay(40);
          aumentaRecords();
        }    
    }
   
        public void aumentaNivel()
    {
        if(flag==0&&(puntos.getValue())>=400){  
            flag=1;
            nivel.setValue(nivel.getValue()+1);
            this.setLocation(750,120);
        }
        
        if(this.isTouching(Nena.class)){  
            nivel.setValue(nivel.getValue()+1);
            this.setLocation(30,470);  
        }
        if(this.isTouching(Casa.class)){
             World world = getWorld();
             this.setLocation(400,400);
           nivel.setValue(nivel.getValue()+1);
           world.addObject(new Ganaste(),400,240);
          Greenfoot.playSound("sony.wav");
          Greenfoot.delay(50);
          aumentaRecords();
          
        }
    }
    
    public void aumentaRecords()
    {
         records.guardaRecords(puntos.getValue());
         Greenfoot.delay(30);
         Greenfoot.setWorld(new WorldMenu());
    }
    public int getNivel()
    {
        return nivel.getValue();
    }
    public int getVidas()
    {
        return vidas.getValue();
    }
       
    public int getPuntos()
    {
        return puntos.getValue();
    }
   

    
     
}


