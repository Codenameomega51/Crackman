// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ghost2 extends Ghosts
{

    /**
     * Act - do whatever the Ghost2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mouvement();
    }

    /**
     * 
     */
    public void mouvement()
    {
        move(3);
        if (isTouching(Wall_Right.class)) {
            setLocation(getX() - 2, getY() - 2);
        }
    }
}
