import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Won extends World
{

    /**
     * Constructor for objects of class GameEnded.
     */
    public Won()
    {
        super(900, 800, 1);
        prepare();
    }

    public void act(){
        Level.speed += 1;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Win_YouWin win_YouWin = new Win_YouWin();
        addObject(win_YouWin,445,277);
    }
}
