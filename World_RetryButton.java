import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World_RetryButton extends Actor
{
    /**
     * Act - do whatever the retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("RetryButton.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("RetryButton2.png");
        }
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new Level());
        }
    }
}
