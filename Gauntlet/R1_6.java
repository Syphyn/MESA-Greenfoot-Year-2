import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R1_6 extends Level1
{
    public R1_6()
    {
        super();
        prepare();
    }

    public void update()
    {
        super.update();
        if (!getObjects(Player.class).isEmpty())
        {
            Player player = getObjects(Player.class).get(0);
            if (player.getX() > Options.WIDTH - 2)
            {
                R1_7 room = new R1_7();
                switchRoom(room, player, 2, player.getY());
            }
        }
    }

    public void prepare()
    {   
        Block block = new Block();
        addObject(block,16,591);
        Block block2 = new Block();
        addObject(block2,20,559);
        Block block3 = new Block();
        addObject(block3,20,525);
        Block block4 = new Block();
        addObject(block4,15,489);
        Block block5 = new Block();
        addObject(block5,14,464);
        Block block6 = new Block();
        addObject(block6,15,434);
        Block block7 = new Block();
        addObject(block7,20,397);
        Block block8 = new Block();
        addObject(block8,20,370);
        Block block9 = new Block();
        addObject(block9,16,346);
        Block block10 = new Block();
        addObject(block10,17,310);
        Block block11 = new Block();
        addObject(block11,17,261);
        Block block12 = new Block();
        addObject(block12,15,245);
        Block block13 = new Block();
        addObject(block13,18,215);
        Block block14 = new Block();
        addObject(block14,22,171);
        Block block15 = new Block();
        addObject(block15,27,15);
        Block block16 = new Block();
        addObject(block16,49,17);
        Block block17 = new Block();
        addObject(block17,82,18);
        Block block18 = new Block();
        addObject(block18,101,16);
        Block block19 = new Block();
        addObject(block19,121,17);
        Block block20 = new Block();
        addObject(block20,162,14);
        Block block21 = new Block();
        addObject(block21,154,16);
        Block block22 = new Block();
        addObject(block22,198,21);
        Block block23 = new Block();
        addObject(block23,240,19);
        Block block24 = new Block();
        addObject(block24,293,15);
        Block block25 = new Block();
        addObject(block25,273,15);
        Block block26 = new Block();
        addObject(block26,337,19);
        Block block27 = new Block();
        addObject(block27,374,23);
        Block block28 = new Block();
        addObject(block28,418,15);
        Block block29 = new Block();
        addObject(block29,445,22);
        Block block30 = new Block();
        addObject(block30,409,16);
        Block block31 = new Block();
        addObject(block31,454,23);
        Block block32 = new Block();
        addObject(block32,503,22);
        Block block33 = new Block();
        addObject(block33,535,21);
        Block block34 = new Block();
        addObject(block34,566,27);
        Block block35 = new Block();
        addObject(block35,598,24);
        Block block36 = new Block();
        addObject(block36,616,24);
        Block block37 = new Block();
        addObject(block37,654,17);
        Block block38 = new Block();
        addObject(block38,679,15);
        Block block39 = new Block();
        addObject(block39,731,15);
        Block block40 = new Block();
        addObject(block40,748,12);
        Block block41 = new Block();
        addObject(block41,786,15);
        Block block42 = new Block();
        addObject(block42,787,53);
        Block block43 = new Block();
        addObject(block43,787,82);
        Block block44 = new Block();
        addObject(block44,786,121);
        Block block45 = new Block();
        addObject(block45,781,155);
        Block block46 = new Block();
        addObject(block46,779,182);
        Block block47 = new Block();
        addObject(block47,150,53);
        Block block48 = new Block();
        addObject(block48,151,86);
        Block block49 = new Block();
        addObject(block49,151,103);
        Block block50 = new Block();
        addObject(block50,148,146);
        Block block51 = new Block();
        addObject(block51,152,172);
        Block block52 = new Block();
        addObject(block52,150,207);
        Block block53 = new Block();
        addObject(block53,154,249);
        Block block54 = new Block();
        addObject(block54,144,270);
        Block block55 = new Block();
        addObject(block55,147,300);
        Block block56 = new Block();
        addObject(block56,156,338);
        Block block57 = new Block();
        addObject(block57,148,373);
        Block block58 = new Block();
        addObject(block58,151,408);
        Block block59 = new Block();
        addObject(block59,144,438);
        Block block60 = new Block();
        addObject(block60,188,434);
        Block block61 = new Block();
        addObject(block61,214,432);
        Block block62 = new Block();
        addObject(block62,246,432);
        Block block63 = new Block();
        addObject(block63,280,434);
        Block block64 = new Block();
        addObject(block64,317,434);
        Block block65 = new Block();
        addObject(block65,352,433);
        Block block66 = new Block();
        addObject(block66,328,437);
        Block block67 = new Block();
        addObject(block67,394,431);
        Block block68 = new Block();
        addObject(block68,449,432);
        Block block69 = new Block();
        addObject(block69,436,434);
        Block block70 = new Block();
        addObject(block70,489,432);
        Block block71 = new Block();
        addObject(block71,535,432);
        Block block72 = new Block();
        addObject(block72,565,432);
        Block block73 = new Block();
        addObject(block73,596,439);
        Block block74 = new Block();
        addObject(block74,687,579);
        Block block75 = new Block();
        addObject(block75,689,552);
        Block block76 = new Block();
        addObject(block76,688,535);
        Block block77 = new Block();
        addObject(block77,696,497);
        Block block78 = new Block();
        addObject(block78,686,459);
        Block block79 = new Block();
        addObject(block79,682,436);
        Block block80 = new Block();
        addObject(block80,689,407);
        Block block81 = new Block();
        addObject(block81,783,207);
        Block block82 = new Block();
        addObject(block82,786,249);
        Block block83 = new Block();
        addObject(block83,785,281);
        Block block84 = new Block();
        addObject(block84,789,315);
        Block block85 = new Block();
        addObject(block85,784,345);
        Block block86 = new Block();
        addObject(block86,789,374);
        Block block87 = new Block();
        addObject(block87,792,397);
        Block block88 = new Block();
        addObject(block88,784,431);
        Block block89 = new Block();
        addObject(block89,679,368);
        Block block90 = new Block();
        addObject(block90,690,332);
        Block block91 = new Block();
        addObject(block91,686,308);
        Block block92 = new Block();
        addObject(block92,689,268);
        Block block93 = new Block();
        addObject(block93,692,238);
        Block block94 = new Block();
        addObject(block94,697,205);
        Block block95 = new Block();
        addObject(block95,687,177);
        Block block96 = new Block();
        addObject(block96,691,148);
        Block block97 = new Block();
        addObject(block97,651,272);
        Block block98 = new Block();
        addObject(block98,635,275);
        Block block99 = new Block();
        addObject(block99,582,268);
        Block block100 = new Block();
        addObject(block100,571,267);
        Block block101 = new Block();
        addObject(block101,530,274);
        Block block102 = new Block();
        addObject(block102,506,271);
        Block block103 = new Block();
        addObject(block103,448,278);
        Block block104 = new Block();
        addObject(block104,412,267);
        Block block105 = new Block();
        addObject(block105,374,268);
        Block block106 = new Block();
        addObject(block106,429,274);
        Block block107 = new Block();
        addObject(block107,327,273);
        Block block108 = new Block();
        addObject(block108,284,277);
        Block block109 = new Block();
        addObject(block109,305,277);
        Block block110 = new Block();
        addObject(block110,58,588);
        Block block111 = new Block();
        addObject(block111,90,583);
        Block block112 = new Block();
        addObject(block112,110,586);
        Block block113 = new Block();
        addObject(block113,141,586);
        Block block114 = new Block();
        addObject(block114,174,593);
        Block block115 = new Block();
        addObject(block115,218,588);
        Block block116 = new Block();
        addObject(block116,245,587);
        Block block117 = new Block();
        addObject(block117,273,583);
        Block block118 = new Block();
        addObject(block118,295,587);
        Block block119 = new Block();
        addObject(block119,335,584);
        Block block120 = new Block();
        addObject(block120,381,589);
        Block block121 = new Block();
        addObject(block121,420,588);
        Block block122 = new Block();
        addObject(block122,402,582);
        Block block123 = new Block();
        addObject(block123,458,592);
        Block block124 = new Block();
        addObject(block124,500,594);
        Block block125 = new Block();
        addObject(block125,536,591);
        Block block126 = new Block();
        addObject(block126,563,585);
        Block block127 = new Block();
        addObject(block127,605,587);
        Block block128 = new Block();
        addObject(block128,639,580);
        Block block129 = new Block();
        addObject(block129,665,585);
        Block block130 = new Block();
        addObject(block130,727,589);
        Block block131 = new Block();
        addObject(block131,746,592);
        Block block132 = new Block();
        addObject(block132,778,584);
        Cardinal cardinal = new Cardinal();
        addObject(cardinal,621,524);
        Cardinal cardinal2 = new Cardinal();
        addObject(cardinal2,204,364);
        Cardinal cardinal3 = new Cardinal();
        addObject(cardinal3,613,203);
    }
}
