import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lost extends World
{
    static GreenfootSound lost = new GreenfootSound("temp.mp3");
    
    int timer = 0;
    /**
     * Constructor for objects of class Lost.
     */
    public Lost()
    {
        super(900, 800, 1);
        prepare();
    }

    public void act() {
        Level.lives = 3;
       
        if (timer == 0){
            lost.play();
            timer++;
        }
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        World_RetryButton retry = new World_RetryButton();
        addObject(retry,getWidth()/2,628);
        LOSS_bg lOSS_bg = new LOSS_bg();
        addObject(lOSS_bg,463,496);
    }
}
