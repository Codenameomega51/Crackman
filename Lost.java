import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lost extends World
{
    GreenfootSound lost = new GreenfootSound("fail.mp3");
    int timer = 0;
    /**
     * Constructor for objects of class Lost.
     */
    public Lost()
    {
        super(900, 800, 1);
    }

    public void act() {
        if (timer == 0){
            lost.play();
            timer++;
        }
    }
}
