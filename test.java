// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class test extends Actor
{

    /**
     * Act - do whatever the World_PlayButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("PlayButton.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("PlayNew.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            World levelWorld =  new  Level();
            Greenfoot.setWorld(levelWorld);
        }
    }
}
