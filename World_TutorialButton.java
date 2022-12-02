import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World_TutorialButton extends Actor
{

    /**
     * 
     */
    public World_TutorialButton()
    {
    }

    /**
     * Act - do whatever the World_TutorialButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("TutorialButton.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("newTutorial.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            World tutWorld =  new  TutorialLevel();
            Greenfoot.setWorld(tutWorld);
        }
    }
}
