import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LOSS_bg extends Actor
{
  public GifImage bg =  new  GifImage("LOSSheart.gif");
    /**
     * Act - do whatever the LOSS_bg wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      
        setImage(bg.getCurrentImage());
    }
}
