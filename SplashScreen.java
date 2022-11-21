// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;
import lang.stride.*;

/**
 * 
 */
public class SplashScreen extends World
{

    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super(900, 800, 1);
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        if (exit()) {
            Greenfoot.setWorld( new MainMenu());
        }
    }

    /**
     * 
     */
    public boolean exit()
    {
        boolean skip = false;
        if (Greenfoot.isKeyDown("space")) {
            skip = true;
        }
        return skip;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LOGO_Group lOGO_Group =  new LOGO_Group();
        addObject(lOGO_Group, 300, 400);
        LOGOSchool lOGOSchool =  new LOGOSchool();
        addObject(lOGOSchool, getWidth() / 2, 750);
        LOGO_GroupNames lOGO_GroupNames =  new LOGO_GroupNames();
        addObject(lOGO_GroupNames, 560, 405);
        LOGO_CourseName lOGO_CourseName =  new LOGO_CourseName();
        addObject(lOGO_CourseName, 450, 218);
    }
}
