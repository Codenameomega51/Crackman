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
    //public GreenfootSound level = new GreenfootSound("level.ogg");
    // level.ogg not supported
    /**
     * Constructor for objects of class MainMenu.
     */
    public Level()
    {
        super(900, 800, 1);
        //MainMenu.main.stop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        lives = 3;
        Ghost1 ghost1 =  new  Ghost1();
        addObject(ghost1, 503, 558);
        CrackMan crackMan =  new  CrackMan();
        addObject(crackMan, 190, 351);
        Tacos tacos =  new  Tacos();
        addObject(tacos, 660, 172);
        Tacos tacos2 =  new  Tacos();
        addObject(tacos2, 708, 244);
        Tacos tacos3 =  new  Tacos();
        addObject(tacos3, 592, 286);
        Tacos tacos4 =  new  Tacos();
        addObject(tacos4, 662, 392);
        Tacos tacos5 =  new  Tacos();
        addObject(tacos5, 770, 355);
        Tacos tacos6 =  new  Tacos();
        addObject(tacos6, 769, 491);
        Tacos tacos7 =  new  Tacos();
        addObject(tacos7, 562, 554);
        Tacos tacos8 =  new  Tacos();
        addObject(tacos8, 748, 618);
        Tacos tacos9 =  new  Tacos();
        addObject(tacos9, 733, 548);
        Tacos tacos10 =  new  Tacos();
        addObject(tacos10, 660, 489);
        Tacos tacos11 =  new  Tacos();
        addObject(tacos11, 791, 447);
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
        ghost1.setLocation(503, 152);
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
        tacos3.setLocation(656, 297);
        Wall_Right wall_Right6 =  new  Wall_Right();
        addObject(wall_Right6, 589, 182);
        wall_Right6.setLocation(608, 217);
        Wall_Down wall_Down8 =  new  Wall_Down();
        addObject(wall_Down8, 488, 242);
        ghost1.setLocation(520, 190);
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
        ghost1.setLocation(526, 172);
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
        Wall_Right wall_Right8 =  new  Wall_Right();
        addObject(wall_Right8, 684, 120);
        Wall_Right wall_Right9 =  new  Wall_Right();
        addObject(wall_Right9, 684, 276);
        Wall_Left wall_Left6 =  new  Wall_Left();
        addObject(wall_Left6, 463, 119);
        Wall_Left wall_Left7 =  new  Wall_Left();
        addObject(wall_Left7, 463, 272);
        Wall_Right wall_Right10 =  new  Wall_Right();
        addObject(wall_Right10, 686, 487);
        tacos11.setLocation(777, 432);
        Wall_Down wall_Down11 =  new  Wall_Down();
        addObject(wall_Down11, 777, 432);
        wall_Right10.setLocation(685, 532);
        wall_Right10.setLocation(684, 525);
        wall_Right10.setLocation(711, 477);
        wall_Right10.setLocation(706, 536);
        wall_Right10.setLocation(712, 520);
        Wall wall =  new  Wall();
        addObject(wall, 586, 120);
        Wall wall2 =  new  Wall();
        addObject(wall2, 585, 272);
        removeObject(wall_Left7);
        removeObject(wall_Left6);
        removeObject(wall);
        removeObject(wall2);
        removeObject(wall_Right8);
        removeObject(wall_Right9);
        wall_Down11.setLocation(748, 436);
        wall_Down11.setLocation(721, 427);
        removeObject(wall_Down11);
        removeObject(wall_Right10);
        Wall wall3 =  new  Wall();
        addObject(wall3, 264, 380);
        WallHorizontal wallHorizontal =  new  WallHorizontal();
        addObject(wallHorizontal, 243, 205);
        Ghost2 ghost2 = new Ghost2();
        addObject(ghost2,472,172);
        Ghost3 ghost3 = new Ghost3();
        addObject(ghost3,576,177);
        Ghost4 ghost4 = new Ghost4();
        addObject(ghost4,500,228);
        Ghost5 ghost5 = new Ghost5();
        addObject(ghost5,550,228);
        Wall2 wall22 = new Wall2();
        addObject(wall22,443,391);
        crackMan.setLocation(383,399);
        WallHorizontal2 wallHorizontal2 = new WallHorizontal2();
        addObject(wallHorizontal2,387,329);
        wallHorizontal2.setLocation(415,342);
        removeObject(ghost2);
        removeObject(ghost1);
        removeObject(ghost5);
        wall22.setLocation(446,378);
        wall22.setLocation(595,486);
        wallHorizontal2.setLocation(551,380);
        wallHorizontal2.setLocation(699,336);
        wallHorizontal.setLocation(282,238);
        WallHorizontal wallHorizontal3 = new WallHorizontal();
        addObject(wallHorizontal3,268,584);
        removeObject(ghost4);
        removeObject(ghost3);
        WallHorizontal wallHorizontal4 = new WallHorizontal();
        addObject(wallHorizontal4,492,335);
        Wall wall4 = new Wall();
        addObject(wall4,481,571);
        WallHorizontal wallHorizontal5 = new WallHorizontal();
        addObject(wallHorizontal5,264,657);
        wallHorizontal.setLocation(537,108);
        crackMan.setLocation(446,83);
        wallHorizontal.setLocation(449,103);
        removeObject(wall3);
        removeObject(wallHorizontal5);
        removeObject(wallHorizontal3);
        removeObject(wall4);
        removeObject(wall22);
        removeObject(wallHorizontal4);
        wallHorizontal2.setLocation(675,331);
        removeObject(wallHorizontal2);
        wallHorizontal.setLocation(516,110);
        removeObject(wallHorizontal);

        crackMan.setLocation(447,85);
        crackMan.setLocation(459,71);
        WallHorizontal wallHorizontal6 = new WallHorizontal();
        addObject(wallHorizontal6,450,107);
        Wall2 wall23 = new Wall2();
        addObject(wall23,323,185);
        Wall2 wall24 = new Wall2();
        addObject(wall24,577,180);
        WallHorizontal2 wallHorizontal22 = new WallHorizontal2();
        addObject(wallHorizontal22,400,244);

        Ghost1 ghost12 = new Ghost1();
        addObject(ghost12,445,200);
        Ghost2 ghost22 = new Ghost2();
        addObject(ghost22,371,200);
        Ghost3 ghost32 = new Ghost3();
        addObject(ghost32,409,151);
        Ghost4 ghost42 = new Ghost4();
        addObject(ghost42,532,196);
        Ghost5 ghost52 = new Ghost5();
        addObject(ghost52,483,150);
        WallHorizontal wallHorizontal7 = new WallHorizontal();
        addObject(wallHorizontal7,448,315);
        Wall2 wall25 = new Wall2();
        addObject(wall25,457,393);
    }

    /**
     * 
     */
    public void act()
    {
        scoreCount(score);
        livesCount(lives);
        //level.playLoop();
        
    }

    /**
     * 
     */
    public void scoreCount(int score)
    {
        showText("Score: " + score, 85, 17);
        if (highScore < score){
            highScore = score;
        }
    }

    /**
     * 
     */
    public void livesCount(int lives)
    {
        showText("" + lives, 95, 778);
    }
}
