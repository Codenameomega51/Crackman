import lang.stride.*;
import java.util.*;
import greenfoot.*;
import greenfoot.GreenfootSound;

/**
 * 
 */
public class MainMenu extends World
{
    //static GreenfootSound main = new GreenfootSound("main.ogg");
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
        world_TutorialButton.setLocation(450, 498);
        Ghost1_MM ghost1_MM =  new  Ghost1_MM();
        addObject(ghost1_MM, 338, 111);
        Ghost2_MM ghost2_MM =  new  Ghost2_MM();
        addObject(ghost2_MM, 424, 267);
        Ghost3_MM ghost3_MM =  new  Ghost3_MM();
        addObject(ghost3_MM, 779, 113);
        Ghost4_MM ghost4_MM =  new  Ghost4_MM();
        addObject(ghost4_MM, 624, 267);
        Ghost5_MM ghost5_MM =  new  Ghost5_MM();
        addObject(ghost5_MM, 148, 276);
    }

    /**
     * 
     */
    public void act()
    {
        //main.playLoop();
       // Greenfoot.playSound("main.ogg");
    }
}
