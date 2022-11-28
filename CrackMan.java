import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CrackMan extends Actor
{
    private GreenfootImage image = getImage();
    private int direction;
    private boolean power = false;
    private int speed = 2;
    private int timer;
    private int spedUp = speed + 2;
    private int score = 0;
    public GifImage Crackman =  new  GifImage("CrackmanClosed.gif");
    public GifImage CrackmanLeft =  new  GifImage("CrackmanClosedLeft.gif");
    public GifImage Cracked = new GifImage("crackedGif.gif");
    public GifImage CrackedUp = new GifImage("crackedGifUp.gif");
    /**
     * 
     */
    public CrackMan()
    {
        direction = 0;
    }

    /**
     * Act - do whatever the CrackMan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. MyWorld thisGame
     */
    public void act()
    {
        if (!(defeat())){
            moving();
        }
        eatTacos();
        if (eatPowerup() == true) {
            poweredUp();
        }
        levelc();
    }

    /**
     * 
     */
    public void moving()
    {
        int x = getX();
        int y = getY();
        if (Greenfoot.isKeyDown("d")) {
            direction = 1;
        }
        if (Greenfoot.isKeyDown("w")) {
            direction = 2;
        }
        if (Greenfoot.isKeyDown("a")) {
            direction = 3;
        }
        if (Greenfoot.isKeyDown("s")) {
            direction = 4;
        }
        if (direction == 1) {
            x = x + 2;
            setImage(Crackman.getCurrentImage());
            setRotation(0);
        }
        if (direction == 2) {
            y = y - 2;
            setImage(Crackman.getCurrentImage());
            setRotation(270);
        }
        if (direction == 3) {
            x = x - 2;
            setImage(CrackmanLeft.getCurrentImage());
            setRotation(180);
        }
        if (direction == 4) {
            y = y + 2;
            setImage(Crackman.getCurrentImage());
            setRotation(90);
        }
        if(getWall () == false){
            move(3);
        } else {
            int rand = Greenfoot.getRandomNumber(4);
            move(-3);
            if (rand == 0){
                turn(90);
            }
            else if (rand == 1){
                turn(-90);
            }
            else {
                turn(180);
            }
        }
    }

  

    /**
     * 
     */
    public void eatTacos()
    {
        Actor taco = getOneIntersectingObject(Tacos.class);
        if (taco != null) {
            getWorld().removeObject(taco);
            Level.score = Level.score + 100;
        }
    }

    /**
     * 
     */
    public boolean eatPowerup()
    {
        Actor line = getOneIntersectingObject(Powerup.class);
        if (line != null) {
            getWorld().removeObject(line);
            timer = 300;
            power = true;
        }
        return power;
    }

    /**
     * 
     */
    public void poweredUp()
    {
        if (power) {
            timer = timer - 1;
            if (timer >= 1) {
                move(spedUp);
                if (direction == 3){
                    setImage(CrackedUp.getCurrentImage());
                } else {
                    setImage(Cracked.getCurrentImage());
                }
            }
        }
        else {
            move(speed);
        }
        if(getWall () == false){
            move(speed);
        } else {
            int rand = Greenfoot.getRandomNumber(4);
            move(-3);
            if (rand == 0){
                turn(90);
            }
            else if (rand == 1){
                turn(-90);
            }
            else {
                turn(180);
            }
        }
    }

    /**
     * 
     */
    public boolean defeat()
    {
        boolean ate = false;
        Actor ghost1 = getOneIntersectingObject(Ghost1.class);
        Actor ghost2 = getOneIntersectingObject(Ghost2.class);
        Actor ghost3 = getOneIntersectingObject(Ghost3.class);
        Actor ghost4 = getOneIntersectingObject(Ghost4.class);
        Actor ghost5 = getOneIntersectingObject(Ghost5.class);
        if (ghost1 != null || ghost2 != null || ghost3 != null || ghost4 != null 
        || ghost5 != null) {
            //Saving score problem (possibly fixable by retry button upon loss)
            //infinite loss porblem
            ate = true;
            Level.lives = Level.lives - 1;
            if (Level.lives == 0) {
                World lost = new Lost();
                Greenfoot.setWorld(lost);
            }
        }
        return ate;
    }

    public void levelc(){
        if (getWorld().getObjects(Tacos.class).size() == 0) {
            World comp = new level_Complete();
            Greenfoot.setWorld(comp);
        }
    }
  private boolean getWall(){
        int distance = 50/2;
        int xOffset = (int) Math.ceil(distance * Math.cos(Math.toRadians(getRotation())));
        int yOffset = (int) Math.ceil(distance * Math.sin(Math.toRadians(getRotation())));
        Actor wall = getOneObjectAtOffset(xOffset, yOffset, Wall2.class );
        Actor wallV2 = getOneObjectAtOffset(xOffset, yOffset, Wall.class );
        Actor wallH = getOneObjectAtOffset(xOffset, yOffset, WallHorizontal.class );
        Actor wallH2 = getOneObjectAtOffset(xOffset, yOffset, WallHorizontal2.class );
        Actor wallD = getOneObjectAtOffset(xOffset, yOffset, Wall_Down.class );
        Actor wallL = getOneObjectAtOffset(xOffset, yOffset, Wall_Left.class );
        Actor wallR = getOneObjectAtOffset(xOffset, yOffset, Wall_Right.class );
        Actor wallU = getOneObjectAtOffset(xOffset, yOffset, Wall_Up.class );
        return (wall!=null) || (wallV2!=null) ||(wallH!=null) || (wallH2!=null) || (wallD!=null) || (wallR!=null) || (wallL!=null) || (wallU!=null); 
    }
}

