// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Logo extends Actor
{
    private int fadeIn = 0;
    private int fadeOut = 255;
    private int timer = 0;
    private int timer2 = 0;
    private int timerWait = 0;

    /**
     * Act - do whatever the Logo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setter();
    }

    /**
     * 
     */
    public void setter()
    {
        timerWait = timerWait + 1;
        timer = timer + 2;
        if (timer <= 244) {
            getImage().setTransparency(timer);
        }
        if (timer > 244 && timerWait > 244) {
            timer2 = timer2 + 2;
            getImage().setTransparency(244 - timer2);
        }
        if (timer2 == 244) {
            Greenfoot.setWorld( new SplashScreen2());
        }
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld( new MainMenu());
        }
    }

    /**
     * 
     */
    public void fade()
    {
    }
}
