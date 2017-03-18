import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball  extends Actor
{
    private int incx;
    private int incy;
    private int puntos1;
    private int puntos2;
    
    public Ball()
    {
        int aleatorio = (int)Greenfoot.getRandomNumber(2);
        if(aleatorio == 0)
        {
            aleatorio = -1;
        }
        incx = aleatorio * 1;
        incy = aleatorio * 1;
        puntos1 = 0;
        puntos2 = 0;
    }
   
    @Override
    public void act() 
    {
        int posx = this.getX();
        int posy = this.getY();
        
        int nuevox = posx + incx;
        int nuevoy = posy + incy;
        
        World mundo = this.getWorld();
        
        mundo.showText("Jugador 1: " + puntos1 + " puntos", 150, 50);
        mundo.showText("Jugador 2: " + puntos2 + " puntos", 150, 450);
        
        if(nuevox > mundo.getWidth()) 
        {
            incx = -incx;
        }
        if (nuevox < 0) {                     
            incx = -incx;
        } 
        if (this.isTouching(Paddle.class))
        {          
             incy = -incy;
        }
        
        this.setLocation(nuevox, nuevoy);
        
        if (nuevoy >= mundo.getHeight()) 
        {    
            this.setLocation(350, 250);
            puntos1 += 1;
            mundo.showText("Jugador 1: " + puntos1 + " puntos", 150, 50);
        }
        
        if (nuevoy == 0) 
        {                    
           this.setLocation(350, 250);
           puntos2 += 1;
           mundo.showText("Jugador 2: " + puntos2 + " puntos", 150, 450);
        }
        
        if (puntos1 >= 5)
        {
            mundo.removeObject(this);
            mundo.showText("JUEGO TERMINADO", 350, 200);
            mundo.showText("Ganador: Jugador 1", 350, 220);
        }
        if (puntos2 >= 5)
        {
            mundo.removeObject(this);
            mundo.showText("JUEGO TERMINADO", 350, 200);
            mundo.showText("Ganador: Jugador 2", 350, 220);
        }
    }
    }    
