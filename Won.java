import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Won extends World
{
    int hscore = Level.highScoreCount;
    /**
     * Constructor for objects of class GameEnded.
     */
    public Won()
    {
        super(900, 800, 1);
        prepare();

      

    }
    
   
    
    

    public void act(){
            scoreCount(hscore);
    }
     public void scoreCount(int hscore)
    {
        showText("" + hscore , 500, 340);
    }
/**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Win_YouWin win_YouWin = new Win_YouWin();
        addObject(win_YouWin,445,277);

        World_GameOverMMButton world_GameOverMMButton = new World_GameOverMMButton();
        addObject(world_GameOverMMButton,623,557);
        World_GameOverPlayButton world_GameOverPlayButton = new World_GameOverPlayButton();
        addObject(world_GameOverPlayButton,315,557);

        Loss_PlayAgain loss_PlayAgain = new Loss_PlayAgain();
        addObject(loss_PlayAgain,457,471);

    }
}
