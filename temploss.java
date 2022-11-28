import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class temploss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class temploss extends World
{
    static GreenfootSound temp = new GreenfootSound("fail.mp3");
    int timer = 0;
    /**
     * Constructor for objects of class temploss.
     * 
     */
    public temploss()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 800, 1);
        Level.level.stop();
        prepare();
    }

    public void act(){
        if (timer == 0) {
            temp.play();
            timer++;
        }

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        retry retry = new retry();
        addObject(retry,315,648);
    }
}
