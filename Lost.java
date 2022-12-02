import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lost extends World
{
    static GreenfootSound lost = new GreenfootSound("temp.mp3");
    static GreenfootSound start;

    int timer = 0;
    /**
     * Constructor for objects of class Lost.
     */
    public Lost()
    {
        super(900, 800, 1);
        prepare();

    }

    public void act() {
        Level.lives = 3;
        if (timer == 0){
            lost.play();
            timer++;
        }

       

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        World_GameOverMMButton retry = new World_GameOverMMButton();
        addObject(retry,620,620);

        Loss loss = new Loss();
        addObject(loss,480,315);
        Ghost1_MM ghost1_MM = new Ghost1_MM();
        addObject(ghost1_MM,321,134);

        Ghost2_MM ghost2_MM = new Ghost2_MM();
        addObject(ghost2_MM,205,509);

        Ghost3_MM ghost3_MM = new Ghost3_MM();
        addObject(ghost3_MM,615,503);

        Ghost4_MM ghost4_MM = new Ghost4_MM();
        addObject(ghost4_MM,294,510);

        Ghost5_MM ghost5_MM = new Ghost5_MM();
        addObject(ghost5_MM,693,500);

        Loss_PlayAgain loss_PlayAgain = new Loss_PlayAgain();
        addObject(loss_PlayAgain,460,495);
        World_GameOverPlayButton world_PlayButton = new World_GameOverPlayButton();
        addObject(world_PlayButton,330,620);

    }
}
