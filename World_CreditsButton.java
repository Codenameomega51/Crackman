import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World_CreditsButton extends Actor
{

    /**
     * 
     */
    public World_CreditsButton()
    {
    }

    /**
     * Act - do whatever the World_TutorialButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("CreditButton.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("CreditsButton2.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            MainMenu.start.stop();
            World infoWorld =  new  Info();
            Greenfoot.setWorld(infoWorld);
        }
    }
}
