// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SplashScreen extends World
{
    private int timer;

    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super(900, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Logo logo =  new  Logo();
        addObject(logo, getWidth() / 2, getHeight() / 2);
    }
}
