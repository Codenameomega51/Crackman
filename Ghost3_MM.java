import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ghost3_MM extends Actor
{

    /**
     * Act - do whatever the Ghost3_MM wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
          if (Greenfoot.mouseMoved(getWorld())){
            setImage("CrackedGhost3_SCALED.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("Ghost3Gif.gif");
        }
    }
}
