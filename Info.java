import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Info extends World
{

    /**
     * Constructor for objects of class Tutorial.
     */
    public Info()
    {
        super(900, 800, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LogoInfo logo = new LogoInfo();
        addObject(logo,450,600);
        LOGO_GroupInfo lOGO_Group = new LOGO_GroupInfo();
        addObject(lOGO_Group,450,256);

        World_GameOverMMButton world_GameOverMMButton = new World_GameOverMMButton();
        addObject(world_GameOverMMButton,117,45);
       
    }
}
