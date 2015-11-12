import greenfoot.*;

/**
 * Write a description of class Jack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Devorador extends Actor
{ /**Variable que permitirá avanzar al personaje, contiene los pasos que dara el ladron*/
    private int avanza;
    /**Contiene la direccion que lleva el ladron*/
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

    private Counter puntos;
    private Counter vidas;


//    private Counter counter;

    

    /**
     * Act - do whatever the Jack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

public Devorador(int numPuntos, int numVidas)
{     puntos= new Counter("Puntos: ");
      puntos.setValue(numPuntos);
      
     vidas  = new Counter("Vidas: ");
     vidas.setValue(numVidas);//set cambiar el valor del letrero

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
    

    
}

//se agrega las vidas al mundo cuando se crea la rana
     protected void addedToWorld(World mundo)
    {//cuando estasen otro ojeto para hacer referencia al  mundo
      World world;
      world = getWorld();//Regreso al mundo que este actor vive.
      int ancho = world.getWidth();//toma el tamaño
      
      mundo.addObject(puntos,(ancho/15),30);
      mundo.addObject(vidas,(ancho/2),30);
    }
    public void act() 
    { 
       move();
       validaP();
       caminar();
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
     public void validaP()
     { 
        World world = getWorld();//Regresa el mundo que este actor vive.
       if(this.isTouching(Platano.class)) {
           removeTouching(Platano.class);
           Greenfoot.playSound("c.wav");
           puntos.setValue(puntos.getValue()+1);
        }
       if(this.isTouching(Fresa.class)){
           removeTouching(Fresa.class);
           Greenfoot.playSound("c.wav");
           puntos.setValue(puntos.getValue()+10);
        }
        if(this.isTouching(Manzana.class)){
            removeTouching(Manzana.class);
             Greenfoot.playSound("c.wav");
              puntos.setValue(puntos.getValue()+20);
        }  
        if(this.isTouching(Pizza.class)){
            
             Greenfoot.playSound("come.wav");
           vidas.setValue(vidas.getValue()-10);
           this.setLocation(world.getWidth()/2,world.getHeight()-30);
           setImage("muerto1.png");
           Greenfoot.delay(40);
        }  
       
    }
}

