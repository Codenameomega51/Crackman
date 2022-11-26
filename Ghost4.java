import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ghost4 extends Ghosts
{
  public GifImage Ghost1 =  new  GifImage("Ghost4Gif.gif");
    /**
     * Act - do whatever the Ghost4 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (!(win())){
            mouvement();
        }
        wallCollide();
        setImage(Ghost1.getCurrentImage());
    }

    public void mouvement()
    { int rand = Greenfoot.getRandomNumber(360);
        move(3);
        if (rand == 90){
        turn(90);
        }
        if (rand == 180){
        turn(180);
        }
        if (rand == 270){
        turn(270);
        }
        if (rand == 359){
        turn(360);
        }
        

    }
     public void wallCollide()
    {
        int x = getX();
        int y = getY();
        if (isTouching(Wall_Right.class)) {
            setLocation(getX() - 10, getY() - 10);
            turn(90);
        }
        if (isTouching(Wall_Up.class)) {
            setLocation(getX() + 3, getY() + 3);
        }
        if (isTouching(Wall_Down.class)) {
            setLocation(getX() - 3, getY() - 3);
        }
        if (isTouching(Wall_Left.class)) {
            setLocation(getX() + 10, getY() + 10);
            turn(90);
        }
        if (isTouching(Wall.class)) {
            setLocation(getX() - 2, getY() );
        }
        
    }
     public boolean win(){
        boolean win = false;
        Actor cracked = getOneIntersectingObject(CrackMan.class);
        if (cracked != null){
            win = true;
        }
        return win;
    }
}
