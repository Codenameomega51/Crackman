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
        if (eatPowerup()) {
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
        setLocation(x, y);

        if (isTouching(Wall_Right.class)) {
            setLocation(getX() - 2, getY() - 2);
            direction = 0;
        }
        if (isTouching(Wall_Up.class)) {
            setLocation(getX() - 2, getY() + 2);
            direction = 0;
        }
        if (isTouching(Wall_Down.class)) {
            setLocation(getX() + 2, getY() - 2);
            direction = 0;
        }
        if (isTouching(Wall_Left.class)) {
            setLocation(getX() + 2, getY() + 2);
            direction = 0;
        }
        wall();
    }

    public void wall(){
        Actor wall_V;
        Actor wall_H;
        wall_V = getOneIntersectingObject(Wall.class);
        wall_H = getOneIntersectingObject(WallHorizontal.class);
        if (wall_V != null) {
            if (direction == 3) {
                setLocation(getX() + 2, getY());
                direction = 0;
            }
            else if (direction == 2) {
                setLocation(getX(), getY() + 2);
                direction = 0;
            } else if ( direction == 1) {
                setLocation(getX() - 2, getY() );
                direction = 0;
            }
            else {
                setLocation(getX() - 2, getY() - 2);
                direction = 0;
            }
        }
        if (wall_H != null) {
            if (direction == 1) {
                setLocation(getX() - 2, getY());
                direction = 0;
            }
            else if (direction == 2) {
                setLocation(getX(), getY() + 2);
                direction = 0;
            }
            else if (direction == 3) {
                setLocation(getX() + 2, getY());
                direction = 0;
            }
            else {
                setLocation(getX(), getY() - 2);
                direction = 0;
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
        wall();
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
}
