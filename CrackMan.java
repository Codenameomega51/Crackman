// WARNING: This file is auto-generated and any changes to it will be overwritten
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

    /**
     * 
     */
    public CrackMan()
    {
        direction = 0;
    }

    /**
     * Act - do whatever the CrackMan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * MyWorld thisGame
     */
    public void act()
    {
        canMoveleft();
        moving();
        eatTacos();
        if (eatPowerup()) {
            poweredUp();
        }
    }

    /**
     * 
     */
    public void moving()
    {
        int x = getX();
        int y = getY();
        if (Greenfoot.isKeyDown("d")) {
            direction = 0;
        }
        if (Greenfoot.isKeyDown("w")) {
            direction = 1;
        }
        if (Greenfoot.isKeyDown("a")) {
            direction = 2;
        }
        if (Greenfoot.isKeyDown("s")) {
            direction = 3;
        }
        if (direction == 0) {
            x = x + 2;
            setImage("Crackman_Right.png");
            setRotation(0);
        }
        if (direction == 1) {
            y = y - 2;
            setImage("Crackman_Right.png");
            setRotation(270);
        }
        if (direction == 2 && canMoveleft()) {
            x = x - 2;
            setImage("Crackman.png");
            setRotation(180);
        }
        if (direction == 3) {
            y = y + 2;
            setImage("Crackman_Right.png");
            setRotation(90);
        }
        setLocation(x, y);
        if (isTouching(Wall_Right.class)) {
            setLocation(getX() - 2, getY() - 2);
        }
        if (isTouching(Wall_Up.class)) {
            setLocation(getX() - 2, getY() + 2);
        }
        if (isTouching(Wall_Down.class)) {
            setLocation(getX() + 2, getY() - 2);
        }
        if (isTouching(Wall_Left.class)) {
            setLocation(getX() + 2, getY() + 2);
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
            GameWorld.score = GameWorld.score + 100;
            /* Score transfer is needed here*/
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
            }
        }
        else {
            move(speed);
        }
    }

    /**
     * 
     */
    public boolean canMoveleft()
    {
        boolean moveLeft = true;
        int width = getImage().getWidth();
        int height = getImage().getHeight();
        /* Something wrong with this if statement, possibly the calling of the class??*/
        if (getObjectsAtOffset(width / -2, height / -2, Wall.class) == null) {
            moveLeft = false;
        }
        return moveLeft;
    }
}
