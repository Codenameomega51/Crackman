import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World_GameOverMMButton extends Actor
{
    /**
     * Act - do whatever the retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("MainButton.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("Main2Button.png");
        }
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("space")) {
           Lost.lost.stop();
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
