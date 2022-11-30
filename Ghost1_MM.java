import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ghost1_MM extends Actor
{

    /**
     * Act - do whatever the Ghost1_MM wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseMoved(getWorld())) {
            setImage("CrackedGhost1_SCALED.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("Ghost1.gif");
        }
    }
}
