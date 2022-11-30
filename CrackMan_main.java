import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CrackMan_main extends CrackMan
{
    
 

    /**
     * Act - do whatever the CrackMan_main wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. MyWorld thisGame
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(getWorld())){
            setImage("Crackman_Right.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("crackedGif.gif");
        }
    }

  
}

