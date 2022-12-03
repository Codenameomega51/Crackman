import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class temploss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class temploss extends World
{
    static GreenfootSound temp = new GreenfootSound("fail.mp3");
    int timer = 0;
    int lives = Level.lives;
    /**
     * Constructor for objects of class temploss.
     * 
     */
    public temploss()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 800, 1);
        Level.level.stop();
        prepare();

    }

    public void act(){
        if (timer == 0) {
            temp.play();
            timer++;
        }
        livesCount(lives);
      

    }
    
    public void livesCount(int live)
    {
        showText("" + live, 500, 513);
    }
    
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        World_RetryButton retry = new World_RetryButton();
        addObject(retry,620/2,690);

        Crackman_Dead crackman_Dead = new Crackman_Dead();
        addObject(crackman_Dead,315,543);

        Loss_LoseLife loss_LoseLife = new Loss_LoseLife();
        addObject(loss_LoseLife,430,320);

        World_GameOverMMButton world_MMButton = new World_GameOverMMButton();
        addObject(world_MMButton,633,690);


    }
}
