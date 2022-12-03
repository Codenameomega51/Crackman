// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World_GameOverPlayButton extends Actor
{
 static GreenfootSound start;
    /**
     * Act - do whatever the World_GameOverPlayButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            Level.speed = 3;
            World levelWorld =  new Level();
            Greenfoot.setWorld(levelWorld);
        }
    }
}
