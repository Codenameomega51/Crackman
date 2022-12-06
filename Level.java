import lang.stride.*;
import java.util.*;
import greenfoot.*;
/**
 * 
 */
public class Level extends World
{
    public static int score = 0;
    public static int lives = 3;
    public static int highScore;
    public static int highScoreCount;
    public static GreenfootSound level = new GreenfootSound("level.mp3");
    public static int speed = 3;

    /**
     * Constructor for objects of class MainMenu.
     */
    public Level()
    {
        super(900, 800, 1);
        temploss.temp.stop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Wall_Up wall_Up =  new  Wall_Up();
        addObject(wall_Up, 78, 20);
        Wall_Up wall_Up2 =  new  Wall_Up();
        addObject(wall_Up2, 236, 20);
        Wall_Up wall_Up3 =  new  Wall_Up();
        addObject(wall_Up3, 394, 20);
        Wall_Up wall_Up4 =  new  Wall_Up();
        addObject(wall_Up4, 552, 20);
        Wall_Up wall_Up5 =  new  Wall_Up();
        addObject(wall_Up5, 710, 20);
        Wall_Up wall_Up6 =  new  Wall_Up();
        addObject(wall_Up6, 868, 20);
        Wall_Right wall_Right =  new  Wall_Right();
        addObject(wall_Right, 877, 113);
        Wall_Right wall_Right2 =  new  Wall_Right();
        addObject(wall_Right2, 877, 270);
        Wall_Right wall_Right3 =  new  Wall_Right();
        addObject(wall_Right3, 877, 427);
        Wall_Right wall_Right4 =  new  Wall_Right();
        addObject(wall_Right4, 877, 585);
        Wall_Right wall_Right5 =  new  Wall_Right();
        addObject(wall_Right5, 877, 740);
        Wall_Left wall_Left =  new  Wall_Left();
        addObject(wall_Left, 21, 113);
        Wall_Left wall_Left2 =  new  Wall_Left();
        addObject(wall_Left2, 21, 268);
        Wall_Left wall_Left3 =  new  Wall_Left();
        addObject(wall_Left3, 21, 426);
        Wall_Left wall_Left4 =  new  Wall_Left();
        addObject(wall_Left4, 21, 584);
        Wall_Left wall_Left5 =  new  Wall_Left();
        addObject(wall_Left5, 21, 720);

        Wall_Down wall_Down =  new  Wall_Down();
        addObject(wall_Down, 116, 777);
        Wall_Down wall_Down2 =  new  Wall_Down();
        addObject(wall_Down2, 272, 777);
        Wall_Down wall_Down3 =  new  Wall_Down();
        addObject(wall_Down3, 429, 777);
        Wall_Down wall_Down4 =  new  Wall_Down();
        addObject(wall_Down4, 588, 777);
        Wall_Down wall_Down5 =  new  Wall_Down();
        addObject(wall_Down5, 736, 777);
        Wall_Down wall_Down6 =  new  Wall_Down();
        addObject(wall_Down6, 782, 777);
        Lives lives5 =  new  Lives();
        addObject(lives5, 67, 778);
        Wall_Down wall_Down7 =  new  Wall_Down();
        addObject(wall_Down7, 646, 124);

        Wall_Right wall_Right6 =  new  Wall_Right();
        addObject(wall_Right6, 589, 182);
        wall_Right6.setLocation(608, 217);
        Wall_Down wall_Down8 =  new  Wall_Down();
        addObject(wall_Down8, 488, 242);

        Wall_Up wall_Up7 =  new  Wall_Up();
        addObject(wall_Up7, 488, 120);
        wall_Down8.setLocation(491, 377);
        wall_Up7.setLocation(465, 127);
        wall_Up7.setLocation(488, 115);
        Wall_Down wall_Down9 =  new  Wall_Down();
        addObject(wall_Down9, 488, 115);
        Wall_Up wall_Up8 =  new  Wall_Up();
        addObject(wall_Up8, 646, 121);
        wall_Down7.setLocation(616, 137);

        Wall_Down wall_Down10 =  new  Wall_Down();
        addObject(wall_Down10, 507, 221);
        Wall_Right wall_Right7 =  new  Wall_Right();
        addObject(wall_Right7, 450, 279);
        wall_Up7.setLocation(380, 184);
        removeObject(wall_Down9);
        removeObject(wall_Up7);
        wall_Down7.setLocation(599, 395);
        removeObject(wall_Up8);
        removeObject(wall_Down7);
        wall_Right6.setLocation(604, 167);
        removeObject(wall_Right6);
        wall_Down10.setLocation(500, 222);
        removeObject(wall_Down10);
        removeObject(wall_Right7);
        removeObject(wall_Down8);

        //maze
        WallHorizontal2 wallHorizontal2 = new WallHorizontal2();
        addObject(wallHorizontal2,786,116);
        CrackMan crackMan = new CrackMan();
        addObject(crackMan,588,669);

        Tacos tacos = new Tacos();
        addObject(tacos,814,728);
        Wall2 wall2 = new Wall2();
        addObject(wall2,634,175);
        WallHorizontal2 wallHorizontal22 = new WallHorizontal2();
        addObject(wallHorizontal22,574,116);
        WallHorizontal2 wallHorizontal23 = new WallHorizontal2();
        addObject(wallHorizontal23,484,116);
        WallHorizontal2 wallHorizontal24 = new WallHorizontal2();
        addObject(wallHorizontal24,787,206);
        Wall2 wall22 = new Wall2();
        addObject(wall22,788,350);

        Wall wall = new Wall();
        addObject(wall,702,448);
        Wall2 wall23 = new Wall2();
        addObject(wall23,787,560);
        WallHorizontal2 wallHorizontal25 = new WallHorizontal2();
        addObject(wallHorizontal25,720,671);
        Wall2 wall24 = new Wall2();
        addObject(wall24,787,612);
        Wall2 wall25 = new Wall2();
        addObject(wall25,492,685);

        Ghost1 ghost1 = new Ghost1();
        addObject(ghost1,586,158);
        Ghost2 ghost2 = new Ghost2();
        addObject(ghost2,547,197);
        Ghost3 ghost3 = new Ghost3();
        addObject(ghost3,520,155);
        Ghost5 ghost5 = new Ghost5();
        addObject(ghost5,480,197);
        Ghost4 ghost4 = new Ghost4();
        addObject(ghost4,440,157);

        Wall2 wall26 = new Wall2();
        addObject(wall26,406,174);

        WallHorizontal2 wallHorizontal26 = new WallHorizontal2();
        addObject(wallHorizontal26,481,233);
        WallHorizontal2 wallHorizontal27 = new WallHorizontal2();
        addObject(wallHorizontal27,643,319);
        Wall2 wall27 = new Wall2();
        addObject(wall27,483,392);
        WallHorizontal2 wallHorizontal28 = new WallHorizontal2();
        addObject(wallHorizontal28,643,407);
        WallHorizontal2 wallHorizontal29 = new WallHorizontal2();
        addObject(wallHorizontal29,432,530);

        Wall2 wall28 = new Wall2();
        addObject(wall28,394,470);
        WallHorizontal2 wallHorizontal210 = new WallHorizontal2();
        addObject(wallHorizontal210,330,318);

        Wall2 wall29 = new Wall2();
        addObject(wall29,588,555);
        WallHorizontal2 wallHorizontal211 = new WallHorizontal2();
        addObject(wallHorizontal211,464,686);
        Wall2 wall210 = new Wall2();
        addObject(wall210,310,685);
        Wall2 wall211 = new Wall2();
        addObject(wall211,304,109);

        Wall2 wall212 = new Wall2();
        addObject(wall212,201,178);
        WallHorizontal2 wallHorizontal212 = new WallHorizontal2();
        addObject(wallHorizontal212,142,119);

        WallHorizontal2 wallHorizontal213 = new WallHorizontal2();
        addObject(wallHorizontal213,112,119);
        Wall2 wall213 = new Wall2();
        addObject(wall213,113,277);
        WallHorizontal2 wallHorizontal214 = new WallHorizontal2();
        addObject(wallHorizontal214,112,416);
        Wall2 wall214 = new Wall2();
        addObject(wall214,208,415);
        WallHorizontal2 wallHorizontal215 = new WallHorizontal2();
        addObject(wallHorizontal215,147,416);
        wallHorizontal210.setLocation(312,310);
        wallHorizontal210.setLocation(276,315);
        removeObject(wallHorizontal210);
        Wall2 wall215 = new Wall2();
        addObject(wall215,301,330);
        WallHorizontal2 wallHorizontal216 = new WallHorizontal2();
        addObject(wallHorizontal216,208,504);

        Wall2 wall216 = new Wall2();
        addObject(wall216,208,445);

        WallHorizontal2 wallHorizontal217 = new WallHorizontal2();
        addObject(wallHorizontal217,112,595);

        Wall2 wall217 = new Wall2();
        addObject(wall217,394,505);
        WallHorizontal2 wallHorizontal218 = new WallHorizontal2();
        addObject(wallHorizontal218,170,680);

        WallHorizontal2 wallHorizontal219 = new WallHorizontal2();
        addObject(wallHorizontal219,140,595);

        Powerup powerup = new Powerup();
        addObject(powerup,454,723);
        Powerup powerup2 = new Powerup();
        addObject(powerup2,824,248);
        Powerup powerup3 = new Powerup();
        addObject(powerup3,650,361);
        Powerup powerup4 = new Powerup();
        addObject(powerup4,155,165);
    }

    /**
     * 
     */
    public void act()
    {
        scoreCount(score);
        highScoreCount(score);
        livesCount(lives);
        level.playLoop();
        ghostSpeed();

    }

    /**
     * 
     */
    public void scoreCount(int score)
    {
        showText("Score: " + score, 85, 17);
        if (highScore < score){
            highScore = score;
        } else
            highScoreCount = highScore;

    }

    public void highScoreCount(int hscore) {
        showText("High Score: " + highScoreCount, 700, 17);

    }

    /**
     * 
     */
    public void livesCount(int lives)
    {
        showText("" + lives, 95, 778);
    }

    public void ghostSpeed(){
        if (speed > 3) {
            showText("The ghosts have gained speed", 450, 780);
        }

    }}

