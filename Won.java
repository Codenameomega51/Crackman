import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Won extends World
{
    int hscore = Level.highScoreCount;
    int highscore;
    GreenfootSound win = new GreenfootSound("celebration.mp3");
    /**
     * Constructor for objects of class GameEnded.
     */
    public Won()
    {
        super(900, 800, 1);
        prepare();
        Level.level.stop();

    }

    public void act(){
        scoreCount(hscore);
        win.play();
    }

    public void scoreCount(int hscore)
    {

        if (highscore == 12900) {
            highscore = hscore + highscore;
            showText("" + highscore , 500, 340);

        } else
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

        World_GameWinPlayButton world_GameOverPlayButton = new World_GameWinPlayButton();
        addObject(world_GameOverPlayButton,300,557);

        Loss_PlayAgain loss_PlayAgain = new Loss_PlayAgain();
        addObject(loss_PlayAgain,450,471);

    }
}
