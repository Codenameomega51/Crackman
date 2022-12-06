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
    public static boolean power = false;
    private int speed = 3;
    private int timer;
    private int spedUp = speed + 2;
    private int score = 0;
    private int powerup = 3;
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

        if (Greenfoot.isKeyDown("d")) {

            direction = 1;
            move(speed);
            checkWall();
        }
        if (Greenfoot.isKeyDown("w")) {
            direction = 2;
            move(speed);
            checkWall();
        }
        if (Greenfoot.isKeyDown("a")) {
            direction = 3;
            move(speed);
            checkWall();
        }
        if (Greenfoot.isKeyDown("s")) {
            direction = 4;
            move(speed);
            checkWall();
        } 
        direction();
    }

    public void direction() {
        int x = getX();
        int y = getY();
        if (direction == 1) {
        //right
           // x = x + 2;
            setImage(Crackman.getCurrentImage());
            setRotation(0);
        }
        if (direction == 2) {
            //up
           // y = y - 2;
            setImage(Crackman.getCurrentImage());
            setRotation(270);
        }
        if (direction == 3) {
            //left
           // x = x - 2;
            setImage(CrackmanLeft.getCurrentImage());
            setRotation(180);
        }
        if (direction == 4) {
            //down
           // y = y + 2;
            setImage(Crackman.getCurrentImage());
            setRotation(90);
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
            Greenfoot.playSound("eat.mp3");
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
            Greenfoot.playSound("power.mp3");
            timer = 300;
            powerup = powerup - 1;
            power = true;

        }
        return power;
    }

    /**
     * 
     */
    public void poweredUp()
    {
        if (power == true) {

            timer = timer - 1;
            setImage(CrackedUp.getCurrentImage()); 
          
            
           
            if (timer >= 1) {
                speed = spedUp;
                checkWall();
                 if( direction != 3){
                setImage(Cracked.getCurrentImage());
                defeat();
                checkWall();
            }
                
                } else if (timer == 0) {
                power = false;
                speed = 3;
            }
        }
        else {
            direction();
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
            if (eatPowerup() == false){
                ate = true;
                Level.lives = Level.lives - 1;
                World temp = new temploss();
                Greenfoot.setWorld(temp);
                if (Level.lives == 0) {
                    World lost = new Lost();
                    Greenfoot.setWorld(lost);
                }
            } else {
                Level.score = Level.score + 500;
            }
        }
        return ate;
    }

    public void levelc(){
        if (getWorld().getObjects(Tacos.class).size() == 0 && 
        getWorld().getObjects(Powerup.class).size() == 0) {
            World comp = new Won();
            Greenfoot.setWorld(comp);
        }
    }

    // private boolean getWall(){
        // int distance = 50/2;
        // int xOffset = (int) Math.ceil(distance * Math.cos(Math.toRadians(getRotation())));
        // int yOffset = (int) Math.ceil(distance * Math.sin(Math.toRadians(getRotation())));
        // Actor wall = getOneObjectAtOffset(xOffset, yOffset, Wall2.class );
        // Actor wallV2 = getOneObjectAtOffset(xOffset, yOffset, Wall.class );
        // Actor wallH = getOneObjectAtOffset(xOffset, yOffset, WallHorizontal.class );
        // Actor wallH2 = getOneObjectAtOffset(xOffset, yOffset, WallHorizontal2.class );
        // Actor wallD = getOneObjectAtOffset(xOffset, yOffset, Wall_Down.class );
        // Actor wallL = getOneObjectAtOffset(xOffset, yOffset, Wall_Left.class );
        // Actor wallR = getOneObjectAtOffset(xOffset, yOffset, Wall_Right.class );
        // Actor wallU = getOneObjectAtOffset(xOffset, yOffset, Wall_Up.class );
        // return wall!=null || wallV2!=null ||wallH!=null || wallH2!=null || wallD!=null || wallR!=null || wallL!=null || wallU!=null; 
    // }

    public void checkWall(){
        Actor wall = getOneIntersectingObject(Wall.class);
        Actor wall2 = getOneIntersectingObject(Wall2.class);
        Actor wallH = getOneIntersectingObject(WallHorizontal.class);
        Actor wallH2 = getOneIntersectingObject(WallHorizontal2.class);
        Actor wallD = getOneIntersectingObject(Wall_Down.class);
        Actor wallL = getOneIntersectingObject(Wall_Left.class);
        Actor wallR = getOneIntersectingObject(Wall_Right.class);
        Actor wallU = getOneIntersectingObject(Wall_Up.class);
        if((wall != null) || (wall2 != null) || (wallH != null) ||  (wallH2 != null)
        || (wallD != null) || (wallU != null) || (wallL != null) ||(wallR != null)){
            move(-speed);
        }
        
        // if(wall2 != null){
            // move(-3);
        // }
        // if(wallH != null){
            // move(-3);
        // }
        // if(wallH2 != null){
            // move(-3);
        // }
        // if(wallD != null){
            // move(-3);
        // }
        // if(wallU != null){
            // move(-3);
        // }
        // if(wallL != null){
            // move(-3);
        // }
        // if(wallR != null){
            // move(-3);
        // }
    }

}
