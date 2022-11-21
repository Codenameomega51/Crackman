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
            setImage("Crackman_Right.png");
            setRotation(0);
        }
        if (direction == 2) {
            y = y - 2;
            setImage("Crackman_Right.png");
            setRotation(270);
        }
        if (direction == 3) {
            x = x - 2;
            setImage("Crackman.png");
            setRotation(180);
        }
        if (direction == 4) {
            y = y + 2;
            setImage("Crackman_Right.png");
            setRotation(90);
        }
        setLocation(x, y);
        /* Need to fix the sliding bug  and the teleportation for the maze wall*/
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
            }
        }
        else {
            move(speed);
        }
    }
}
