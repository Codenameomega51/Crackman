// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     */
    public MainMenu()
    {
        super(900, 800, 1);
        prepare();
        act();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LOGO_GameName lOGO_GameName =  new  LOGO_GameName();
        addObject(lOGO_GameName, 458, 183);
        World_CrackMan world_CrackMan =  new  World_CrackMan();
        addObject(world_CrackMan, 41, 290);
        World_PlayButton world_PlayButton =  new  World_PlayButton();
        addObject(world_PlayButton, 450, 415);
        world_CrackMan.setLocation(183, 118);
        World_TutorialButton world_TutorialButton =  new  World_TutorialButton();
        addObject(world_TutorialButton, 435, 516);
    }

    /**
     * 
     */
    public void act()
    {
    }
}
