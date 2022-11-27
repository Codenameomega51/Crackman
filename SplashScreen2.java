import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SplashScreen2 extends World
{
    static GreenfootSound sound2 = new GreenfootSound ("splash2.mp3");
    /**
     * Constructor for objects of class SplashScreen2.
     */
    public SplashScreen2()
    {
        super(900, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LOGO_Group lOGO_Group =  new  LOGO_Group();
        lOGO_Group.getImage().setTransparency(0);
        addObject(lOGO_Group, getWidth() / 2, getHeight() / 2);
        SplashScreen.sound.stop();
    }

    public void act(){
        sound2.play();
    }
}
