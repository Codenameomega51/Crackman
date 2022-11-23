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
    private int timer = 10000;

    /**
     * Act - do whatever the Logo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fade();
    }

    /**
     * 
     */
    public void fade()
    {
        while (timer >= 1) {
            timer = timer - 1;
            if (timer == 0) {
                while (fadeIn < 254) {
                    getImage().setTransparency(fadeIn);
                    fadeIn = fadeIn + 2;
                }
            }
        }
        while (timer <= 999) {
            timer = timer + 1;
        }
        if (timer == 1000) {
            while (fadeOut > 1) {
                while (timer >= 900) {
                    timer = timer - 1;
                }
                getImage().setTransparency(fadeOut);
                fadeOut = fadeOut - 2;
                if (fadeOut == 1) {
                    Greenfoot.setWorld( new  SplashScreen2());
                }
            }
        }
    }
}
