import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lost extends World
{
    static GreenfootSound lost = new GreenfootSound("temp.mp3");
    public GifImage bg =  new  GifImage("LOSSheart.gif");
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
        setBackground(bg.getCurrentImage());
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
        retry retry = new retry();
        addObject(retry,339,628);
    }
}
