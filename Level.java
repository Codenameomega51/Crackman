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
        Ghost1 ghost1 =  new  Ghost1();
        addObject(ghost1, 500, 558);
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
        // maze 
        // ghost wall
        WallHorizontal wallHorizontal = new WallHorizontal();
        addObject(wallHorizontal,455,107);
        crackMan.setLocation(353,65);
        Wall2 wall2 = new Wall2();
        addObject(wall2,328,166);
        Wall2 wall22 = new Wall2();
        addObject(wall22,583,166);
        WallHorizontal wallHorizontal2 = new WallHorizontal();
        addObject(wallHorizontal2,364,225);
        tacos.setLocation(656,231);
        WallHorizontal2 wallHorizontal22 = new WallHorizontal2();
        addObject(wallHorizontal22,642,167);
        Wall2 wall23 = new Wall2();
        addObject(wall23,662,108);
        WallHorizontal2 wallHorizontal23 = new WallHorizontal2();
        addObject(wallHorizontal23,720,100);

        Wall2 wall24 = new Wall2();
        addObject(wall24,780,158);
        tacos2.setLocation(722,233);
        WallHorizontal2 wallHorizontal24 = new WallHorizontal2();
        addObject(wallHorizontal24,722,234);
        tacos.setLocation(731,191);
        tacos2.setLocation(740,291);
        tacos2.setLocation(637,362);
        tacos3.setLocation(568,333);
        WallHorizontal wallHorizontal3 = new WallHorizontal();
        addObject(wallHorizontal3,718,304);

        WallHorizontal2 wallHorizontal25 = new WallHorizontal2();
        addObject(wallHorizontal25,735,377);
        crackMan.setLocation(844,371);
        crackMan.setLocation(828,372);

        crackMan.setLocation(838,361);
        WallHorizontal wallHorizontal4 = new WallHorizontal();
        addObject(wallHorizontal4,718,450);
        tacos11.setLocation(793,438);

        Wall2 wall25 = new Wall2();
        addObject(wall25,508,283);
        ghost1.setLocation(543,284);
        ghost1.setLocation(540,264);
        Wall2 wall26 = new Wall2();
        addObject(wall26,508,474);
        Wall2 wall27 = new Wall2();
        addObject(wall27,588,440);

        ghost1.setLocation(380,193);
        Wall2 wall28 = new Wall2();
        addObject(wall28,667,580);
        Wall2 wall29 = new Wall2();
        addObject(wall29,744,527);
        crackMan.setLocation(695,524);

        crackMan.setLocation(685,493);

        WallHorizontal2 wallHorizontal26 = new WallHorizontal2();
        addObject(wallHorizontal26,725,531);
        crackMan.setLocation(701,331);

        crackMan.setLocation(683,479);
        removeObject(wall28);

        crackMan.setLocation(704,500);
        Wall2 wall210 = new Wall2();
        addObject(wall210,658,589);
        WallHorizontal2 wallHorizontal27 = new WallHorizontal2();
        addObject(wallHorizontal27,786,680);
        crackMan.setLocation(759,684);
        tacos8.setLocation(742,624);
        crackMan.setLocation(810,637);

        WallHorizontal2 wallHorizontal28 = new WallHorizontal2();
        addObject(wallHorizontal28,518,691);
        WallHorizontal2 wallHorizontal29 = new WallHorizontal2();
        addObject(wallHorizontal29,518,650);
        wallHorizontal29.setLocation(515,620);
        WallHorizontal2 wallHorizontal210 = new WallHorizontal2();
        addObject(wallHorizontal210,353,420);   
        crackMan.setLocation(451,414);
        Wall2 wall211 = new Wall2();
        addObject(wall211,423,361);
        Wall2 wall212 = new Wall2();
        addObject(wall212,457,685);
        WallHorizontal wallHorizontal5 = new WallHorizontal();
        addObject(wallHorizontal5,181,304);
        Wall2 wall213 = new Wall2();
        addObject(wall213,328,280);

        WallHorizontal2 wallHorizontal211 = new WallHorizontal2();
        addObject(wallHorizontal211,432,492);
        crackMan.setLocation(456,454);
        crackMan.setLocation(456,466);
        crackMan.setLocation(430,452);
        wallHorizontal211.setLocation(444,503);

        crackMan.setLocation(251,588);
        crackMan.setLocation(652,733);
        tacos8.setLocation(805,603);
        Wall2 wall214 = new Wall2();
        addObject(wall214,368,561);

        crackMan.setLocation(660,719);

        crackMan.setLocation(658,724);
        Wall2 wall215 = new Wall2();
        addObject(wall215,658,611);
        wall212.setLocation(455,657);

        wall212.setLocation(452,623);
        crackMan.setLocation(482,566);
        wall212.setLocation(443,631);
        crackMan.setLocation(480,563);
        Wall2 wall216 = new Wall2();
        addObject(wall216,368,631);

        wallHorizontal5.setLocation(179,308);
        removeObject(wallHorizontal5);
        Wall2 wall217 = new Wall2();
        addObject(wall217,282,685);

        WallHorizontal2 wallHorizontal212 = new WallHorizontal2();
        addObject(wallHorizontal212,112,686);

        Wall2 wall218 = new Wall2();
        addObject(wall218,199,556);
        WallHorizontal2 wallHorizontal213 = new WallHorizontal2();
        addObject(wallHorizontal213,140,686);

        WallHorizontal2 wallHorizontal214 = new WallHorizontal2();
        addObject(wallHorizontal214,177,103);

        Wall2 wall219 = new Wall2();
        addObject(wall219,116,109);
        Wall2 wall220 = new Wall2();
        addObject(wall220,237,237);

        Wall2 wall221 = new Wall2();
        addObject(wall221,285,478);

        WallHorizontal2 wallHorizontal215 = new WallHorizontal2();
        addObject(wallHorizontal215,112,615);

        WallHorizontal2 wallHorizontal216 = new WallHorizontal2();
        addObject(wallHorizontal216,139,615);
        Wall2 wall222 = new Wall2();
        addObject(wall222,117,486);

        WallHorizontal2 wallHorizontal217 = new WallHorizontal2();
        addObject(wallHorizontal217,112,349);
        WallHorizontal2 wallHorizontal218 = new WallHorizontal2();
        addObject(wallHorizontal218,273,420);

        WallHorizontal2 wallHorizontal219 = new WallHorizontal2();
        addObject(wallHorizontal219,178,256);

        wallHorizontal22.setLocation(746,168);
        wallHorizontal22.setLocation(727,177);
        wallHorizontal22.setLocation(640,186);
        removeObject(wallHorizontal22);
        tacos4.setLocation(618,421);
        removeObject(tacos3);
        removeObject(tacos7);
        removeObject(tacos10);
        removeObject(tacos4);
        removeObject(tacos2);
        removeObject(tacos9);
        removeObject(tacos8);
        removeObject(tacos6);
        removeObject(tacos11);
        removeObject(tacos5);
        removeObject(tacos);
        crackMan.setLocation(606,651);
        crackMan.setLocation(182,214);
        crackMan.setLocation(154,142);
        Powerup powerup = new Powerup();
        addObject(powerup,720,144);
        Tacos tacos12 = new Tacos();
        addObject(tacos12,717,196);
        Tacos tacos13 = new Tacos();
        addObject(tacos13,624,199);
        tacos12.setLocation(735,195);
        Tacos tacos14 = new Tacos();
        addObject(tacos14,675,197);
        tacos14.setLocation(676,196);
        Ghost5 ghost5 = new Ghost5();
        addObject(ghost5,415,144);
        Ghost4 ghost4 = new Ghost4();
        addObject(ghost4,463,183);
        Ghost3 ghost3 = new Ghost3();
        addObject(ghost3,507,147);
        Ghost2 ghost2 = new Ghost2();
        addObject(ghost2,545,187);
        Tacos tacos15 = new Tacos();
        addObject(tacos15,699,65);
        Tacos tacos16 = new Tacos();
        addObject(tacos16,752,64);
        Tacos tacos17 = new Tacos();
        addObject(tacos17,806,65);
        Tacos tacos18 = new Tacos();
        addObject(tacos18,823,101);
        Tacos tacos19 = new Tacos();
        addObject(tacos19,825,150);
        Tacos tacos20 = new Tacos();
        addObject(tacos20,824,200);
        Tacos tacos21 = new Tacos();
        addObject(tacos21,824,250);
        Tacos tacos22 = new Tacos();
        addObject(tacos22,762,270);
        Tacos tacos23 = new Tacos();
        addObject(tacos23,696,268);
        Tacos tacos24 = new Tacos();
        addObject(tacos24,619,267);
        tacos24.setLocation(640,268);
        Tacos tacos25 = new Tacos();
        addObject(tacos25,623,140);
        Tacos tacos26 = new Tacos();
        addObject(tacos26,622,87);
        Tacos tacos27 = new Tacos();
        addObject(tacos27,560,69);
        tacos13.setLocation(624,200);
        tacos24.setLocation(636,267);
        tacos13.setLocation(618,219);
        tacos13.setLocation(624,211);
        tacos24.setLocation(630,264);
        tacos25.setLocation(618,160);
        tacos26.setLocation(612,103);
        tacos27.setLocation(622,60);
        tacos25.setLocation(628,169);
        tacos26.setLocation(620,110);
        Tacos tacos28 = new Tacos();
        addObject(tacos28,553,66);
        Tacos tacos29 = new Tacos();
        addObject(tacos29,491,65);
        Tacos tacos30 = new Tacos();
        addObject(tacos30,423,64);
        Tacos tacos31 = new Tacos();
        addObject(tacos31,364,63);
        tacos31.setLocation(359,64);
        Tacos tacos32 = new Tacos();
        addObject(tacos32,296,65);
        Tacos tacos33 = new Tacos();
        addObject(tacos33,159,65);
        Tacos tacos34 = new Tacos();
        addObject(tacos34,217,66);
        tacos34.setLocation(219,69);
        Tacos tacos35 = new Tacos();
        addObject(tacos35,280,107);
        Tacos tacos36 = new Tacos();
        addObject(tacos36,283,187);
        tacos35.setLocation(285,124);
        crackMan.setLocation(705,575);
        Tacos tacos37 = new Tacos();
        addObject(tacos37,73,68);
        Tacos tacos38 = new Tacos();
        addObject(tacos38,74,111);
        Tacos tacos39 = new Tacos();
        addObject(tacos39,75,156);
        Tacos tacos40 = new Tacos();
        addObject(tacos40,73,206);
        Tacos tacos41 = new Tacos();
        addObject(tacos41,75,256);
        Tacos tacos42 = new Tacos();
        addObject(tacos42,71,311);
        Tacos tacos43 = new Tacos();
        addObject(tacos43,118,213);
        Tacos tacos44 = new Tacos();
        addObject(tacos44,199,214);
        Tacos tacos45 = new Tacos();
        addObject(tacos45,219,138);
        Tacos tacos46 = new Tacos();
        addObject(tacos46,158,141);
        Tacos tacos47 = new Tacos();
        addObject(tacos47,163,181);
        tacos43.setLocation(125,215);
        tacos47.setLocation(178,176);
        Tacos tacos48 = new Tacos();
        addObject(tacos48,127,304);
        Tacos tacos49 = new Tacos();
        addObject(tacos49,186,299);
        Tacos tacos50 = new Tacos();
        addObject(tacos50,220,336);
        Tacos tacos51 = new Tacos();
        addObject(tacos51,282,260);
        Tacos tacos52 = new Tacos();
        addObject(tacos52,283,306);
        Tacos tacos53 = new Tacos();
        addObject(tacos53,219,383);
        Tacos tacos54 = new Tacos();
        addObject(tacos54,279,377);
        Tacos tacos55 = new Tacos();
        addObject(tacos55,335,380);
        tacos49.setLocation(185,304);
        tacos52.setLocation(284,324);
        tacos51.setLocation(281,276);
        Powerup powerup2 = new Powerup();
        addObject(powerup2,156,563);
        removeObject(tacos46);
        Powerup powerup3 = new Powerup();
        addObject(powerup3,147,142);
        removeObject(tacos47);
        powerup3.setLocation(159,160);
        Tacos tacos56 = new Tacos();
        addObject(tacos56,386,378);
        Tacos tacos57 = new Tacos();
        addObject(tacos57,371,330);
        tacos57.setLocation(371,312);
        Tacos tacos58 = new Tacos();
        addObject(tacos58,375,267);
        Tacos tacos59 = new Tacos();
        addObject(tacos59,425,262);
        Tacos tacos60 = new Tacos();
        addObject(tacos60,469,263);
        tacos58.setLocation(365,257);
        tacos57.setLocation(364,313);
        Tacos tacos61 = new Tacos();
        addObject(tacos61,465,319);
        Tacos tacos62 = new Tacos();
        addObject(tacos62,466,378);
        Tacos tacos63 = new Tacos();
        addObject(tacos63,516,378);
        Tacos tacos64 = new Tacos();
        addObject(tacos64,466,433);
        Tacos tacos65 = new Tacos();
        addObject(tacos65,411,469);
        Tacos tacos66 = new Tacos();
        addObject(tacos66,353,471);
        tacos64.setLocation(467,423);
        Tacos tacos67 = new Tacos();
        addObject(tacos67,460,466);
        tacos62.setLocation(468,367);
        tacos64.setLocation(468,407);
        tacos67.setLocation(470,467);
        tacos61.setLocation(463,306);
        tacos62.setLocation(462,351);
        tacos64.setLocation(472,399);
        tacos66.setLocation(337,465);
        tacos65.setLocation(396,462);
        tacos67.setLocation(454,463);
        Tacos tacos68 = new Tacos();
        addObject(tacos68,325,516);
        Tacos tacos69 = new Tacos();
        addObject(tacos69,328,560);
        tacos68.setLocation(332,514);
        Tacos tacos70 = new Tacos();
        addObject(tacos70,274,585);
        tacos70.setLocation(283,589);
        Tacos tacos71 = new Tacos();
        addObject(tacos71,242,453);
        Tacos tacos72 = new Tacos();
        addObject(tacos72,240,502);
        Tacos tacos73 = new Tacos();
        addObject(tacos73,239,554);
        tacos72.setLocation(240,505);
        Tacos tacos74 = new Tacos();
        addObject(tacos74,546,264);
        tacos74.setLocation(540,239);
        Tacos tacos75 = new Tacos();
        addObject(tacos75,569,267);
        tacos22.setLocation(773,263);
        tacos23.setLocation(713,275);
        tacos24.setLocation(667,272);

        tacos22.setLocation(772,272);
        tacos23.setLocation(718,274);
        removeObject(tacos75);

        Tacos tacos76 = new Tacos();
        addObject(tacos76,548,281);
        tacos74.setLocation(542,237);
        Tacos tacos77 = new Tacos();
        addObject(tacos77,607,263);
        Tacos tacos78 = new Tacos();
        addObject(tacos78,554,333);
        Tacos tacos79 = new Tacos();
        addObject(tacos79,824,720);
        Tacos tacos80 = new Tacos();
        addObject(tacos80,770,720);
        Tacos tacos81 = new Tacos();
        addObject(tacos81,781,492);
        Tacos tacos82 = new Tacos();
        addObject(tacos82,831,491);
        Tacos tacos83 = new Tacos();
        addObject(tacos83,825,533);
        Tacos tacos84 = new Tacos();
        addObject(tacos84,828,582);
        Tacos tacos85 = new Tacos();
        addObject(tacos85,827,643);
        tacos84.setLocation(832,585);
        Tacos tacos86 = new Tacos();
        addObject(tacos86,781,575);
        Tacos tacos87 = new Tacos();
        addObject(tacos87,778,624);
        Tacos tacos88 = new Tacos();
        addObject(tacos88,710,629);
        Tacos tacos89 = new Tacos();
        addObject(tacos89,691,675);
        tacos88.setLocation(704,627);
        tacos89.setLocation(700,675);
        tacos87.setLocation(754,623);
        Tacos tacos90 = new Tacos();
        addObject(tacos90,695,721);
        Tacos tacos91 = new Tacos();
        addObject(tacos91,166,386);
        Tacos tacos92 = new Tacos();
        addObject(tacos92,74,385);
        tacos92.setLocation(72,390);
        tacos91.setLocation(160,385);
        Tacos tacos93 = new Tacos();
        addObject(tacos93,77,439);
        Tacos tacos94 = new Tacos();
        addObject(tacos94,78,488);
        Tacos tacos95 = new Tacos();
        addObject(tacos95,72,539);
        Tacos tacos96 = new Tacos();
        addObject(tacos96,74,581);
        Tacos tacos97 = new Tacos();
        addObject(tacos97,154,500);
        Tacos tacos98 = new Tacos();
        addObject(tacos98,161,447);
        tacos97.setLocation(155,496);
        tacos98.setLocation(152,441);
        Tacos tacos99 = new Tacos();
        addObject(tacos99,75,649);
        Tacos tacos100 = new Tacos();
        addObject(tacos100,132,645);
        Tacos tacos101 = new Tacos();
        addObject(tacos101,188,649);
        tacos100.setLocation(130,652);
        Tacos tacos102 = new Tacos();
        addObject(tacos102,237,626);

        Tacos tacos103 = new Tacos();
        addObject(tacos103,74,723);
        Tacos tacos104 = new Tacos();
        addObject(tacos104,126,722);
        Tacos tacos105 = new Tacos();
        addObject(tacos105,187,723);
        Tacos tacos106 = new Tacos();
        addObject(tacos106,240,723);
        Tacos tacos107 = new Tacos();
        addObject(tacos107,239,675);
        Tacos tacos108 = new Tacos();
        addObject(tacos108,600,345);
        Tacos tacos109 = new Tacos();
        addObject(tacos109,666,341);
        Tacos tacos110 = new Tacos();
        addObject(tacos110,733,339);
        Tacos tacos111 = new Tacos();
        addObject(tacos111,800,337);
        Tacos tacos112 = new Tacos();
        addObject(tacos112,830,367);
        Tacos tacos113 = new Tacos();
        addObject(tacos113,827,410);
        Tacos tacos114 = new Tacos();
        addObject(tacos114,768,408);
        Tacos tacos115 = new Tacos();
        addObject(tacos115,708,409);
        Tacos tacos116 = new Tacos();
        addObject(tacos116,635,412);
        Tacos tacos117 = new Tacos();
        addObject(tacos117,629,372);
        tacos109.setLocation(675,337);
        tacos109.setLocation(676,337);
        tacos117.setLocation(641,370);
        tacos116.setLocation(645,410);

        Tacos tacos118 = new Tacos();
        addObject(tacos118,548,403);
        Tacos tacos119 = new Tacos();
        addObject(tacos119,548,448);
        Tacos tacos120 = new Tacos();
        addObject(tacos120,548,500);
        Tacos tacos121 = new Tacos();
        addObject(tacos121,698,490);
        Tacos tacos122 = new Tacos();
        addObject(tacos122,636,489);
        Tacos tacos123 = new Tacos();
        addObject(tacos123,619,541);
        Tacos tacos124 = new Tacos();
        addObject(tacos124,556,547);
        Tacos tacos125 = new Tacos();
        addObject(tacos125,470,536);
        Tacos tacos126 = new Tacos();
        addObject(tacos126,485,582);
        tacos124.setLocation(545,555);
        Tacos tacos127 = new Tacos();
        addObject(tacos127,576,582);
        Tacos tacos128 = new Tacos();
        addObject(tacos128,616,615);
        Tacos tacos129 = new Tacos();
        addObject(tacos129,323,620);
        Tacos tacos130 = new Tacos();
        addObject(tacos130,326,671);
        Tacos tacos131 = new Tacos();
        addObject(tacos131,325,725);
        Tacos tacos132 = new Tacos();
        addObject(tacos132,408,725);
        Tacos tacos133 = new Tacos();
        addObject(tacos133,406,673);
        Tacos tacos134 = new Tacos();
        addObject(tacos134,401,620);
        Tacos tacos135 = new Tacos();
        addObject(tacos135,401,538);
        Tacos tacos136 = new Tacos();
        addObject(tacos136,399,579);
        tacos133.setLocation(400,670);
        tacos134.setLocation(404,631);
        tacos136.setLocation(401,582);
        tacos132.setLocation(380,728);
        Tacos tacos137 = new Tacos();
        addObject(tacos137,445,724);
        Tacos tacos138 = new Tacos();
        addObject(tacos138,500,726);
        Tacos tacos139 = new Tacos();
        addObject(tacos139,552,727);
        Tacos tacos140 = new Tacos();
        addObject(tacos140,607,724);
        tacos90.setLocation(712,724);
        Tacos tacos141 = new Tacos();
        addObject(tacos141,653,723);
        tacos141.setLocation(659,713);
        tacos141.setLocation(656,720);
        Tacos tacos142 = new Tacos();
        addObject(tacos142,488,656);
        Tacos tacos143 = new Tacos();
        addObject(tacos143,544,652);
        Tacos tacos144 = new Tacos();
        addObject(tacos144,613,667);
        removeObject(ghost1);
        removeObject(ghost5);
        removeObject(ghost3);
        removeObject(ghost4);
        removeObject(ghost2);
        removeObject(crackMan);

        Ghost1 ghost12 = new Ghost1();
        addObject(ghost12,546,185);

        Ghost4 ghost42 = new Ghost4();
        addObject(ghost42,503,147);
        Ghost5 ghost52 = new Ghost5();
        addObject(ghost52,454,184);
        Ghost3 ghost32 = new Ghost3();
        addObject(ghost32,408,147);
        Ghost2 ghost22 = new Ghost2();
        addObject(ghost22,365,186);
        CrackMan crackMan2 = new CrackMan();
        addObject(crackMan2,700,574);
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
}
