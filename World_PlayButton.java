import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World_PlayButton extends Actor
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
            setImage("newPlay.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            MainMenu.start.stop();
            World levelWorld =  new  Level();
            Greenfoot.setWorld(levelWorld);
        }
    }
}
