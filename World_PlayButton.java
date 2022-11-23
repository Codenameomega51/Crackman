// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World_PlayButton extends Actor
{

    /**
     * 
     */
    public World_PlayButton()
    {
        getImage().scale(250, 180);
    }

    /**
     * Act - do whatever the World_PlayButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this)) {
            Greenfoot.setWorld( new Level());
        }
    }
}
