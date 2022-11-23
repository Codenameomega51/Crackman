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

        GreenfootImage newPlay;
        if(Greenfoot.mouseMoved(this)){
            newPlay= new GreenfootImage("newPlay.png");
            setImage(newPlay);
            newPlay.scale(300,200);

        }if (Greenfoot.mouseClicked(this)){World levelWorld = new Level();
            Greenfoot.setWorld(levelWorld);

        }
    }}
