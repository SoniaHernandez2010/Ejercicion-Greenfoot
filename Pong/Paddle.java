import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle  extends Actor
{
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Si presiona la flecha derecha
        if (Greenfoot.isKeyDown("right") && this.getY() == 30) {
            this.setLocation(this.getX() + 10, this.getY());
        }
        
        if (Greenfoot.isKeyDown("left") && this.getY() == 30) {
            this.setLocation(this.getX() - 10, this.getY());
        }
        
        // Si presiona la flecha derecha
        if (Greenfoot.isKeyDown("s") && this.getY() == 470) {
            this.setLocation(this.getX() + 10, this.getY());
        }
        
        if (Greenfoot.isKeyDown("a") && this.getY() == 470) {
            this.setLocation(this.getX() - 10, this.getY());
        }
    }    
}
