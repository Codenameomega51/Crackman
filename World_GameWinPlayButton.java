// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World_GameWinPlayButton extends Actor
{
 static GreenfootSound start;
    /**
     * Act - do whatever the World_GameWinPlayButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()

    {

        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("PlayButton.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("newPlay.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            Lost.lost.stop();
            Level.score = 0;
            Level.speed = Level.speed + 1;
            World levelWorld =  new Level();
            Greenfoot.setWorld(levelWorld);
        }
    }
}
