import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R2_5 extends Level2
{
    public R2_5()
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
            if (player.getY() + 65 < 2)
            {
                R2_6 room = new R2_6();
                switchRoom(room, player, player.getTrueX(), Options.HEIGHT - 2 - 65);
            }
        }
    }

    public void prepare()
    {
        Block block114 = new Block();
        addObject(block114,786,587);
        Block block115 = new Block();
        addObject(block115,583,586);
        Block block116 = new Block();
        addObject(block116,555,586);
        Block block117 = new Block();
        addObject(block117,523,585);
        Block block118 = new Block();
        addObject(block118,476,578);
        Block block119 = new Block();
        addObject(block119,494,583);
        Block block120 = new Block();
        addObject(block120,431,595);
        Block block121 = new Block();
        addObject(block121,408,588);
        Block block122 = new Block();
        addObject(block122,363,587);
        Block block123 = new Block();
        addObject(block123,325,584);
        Block block124 = new Block();
        addObject(block124,293,586);
        Block block125 = new Block();
        addObject(block125,265,585);
        Block block126 = new Block();
        addObject(block126,231,583);
        Block block127 = new Block();
        addObject(block127,190,583);
        Block block128 = new Block();
        addObject(block128,145,581);
        Block block129 = new Block();
        addObject(block129,196,585);
        Block block130 = new Block();
        addObject(block130,121,586);
        Block block131 = new Block();
        addObject(block131,61,594);
        Block block132 = new Block();
        addObject(block132,82,585);
        Block block133 = new Block();
        addObject(block133,27,585);
        Block block134 = new Block();
        addObject(block134,16,16);
        Block block135 = new Block();
        addObject(block135,18,43);
        Block block136 = new Block();
        addObject(block136,19,82);
        Block block137 = new Block();
        addObject(block137,15,122);
        Block block138 = new Block();
        addObject(block138,13,169);
        Block block139 = new Block();
        addObject(block139,13,188);
        Block block140 = new Block();
        addObject(block140,8,147);
        Block block141 = new Block();
        addObject(block141,30,211);
        Block block142 = new Block();
        addObject(block142,21,238);
        Block block143 = new Block();
        addObject(block143,18,277);
        Block block144 = new Block();
        addObject(block144,15,304);
        Block block145 = new Block();
        addObject(block145,9,345);
        Block block146 = new Block();
        addObject(block146,15,377);
        Block block147 = new Block();
        addObject(block147,19,392);
        Block block148 = new Block();
        addObject(block148,19,432);
        Block block149 = new Block();
        addObject(block149,17,461);
        Block block150 = new Block();
        addObject(block150,18,486);
        Block block151 = new Block();
        addObject(block151,14,526);
        Block block152 = new Block();
        addObject(block152,12,544);
        Block block153 = new Block();
        addObject(block153,13,560);
        Block block154 = new Block();
        addObject(block154,788,554);
        Block block155 = new Block();
        addObject(block155,788,522);
        Block block156 = new Block();
        addObject(block156,787,487);
        Block block157 = new Block();
        addObject(block157,787,463);
        Block block158 = new Block();
        addObject(block158,787,444);
        Block block159 = new Block();
        addObject(block159,787,402);
        Block block160 = new Block();
        addObject(block160,781,376);
        Block block161 = new Block();
        addObject(block161,780,336);
        Block block162 = new Block();
        addObject(block162,787,303);
        Block block163 = new Block();
        addObject(block163,789,256);
        Block block164 = new Block();
        addObject(block164,787,231);
        Block block165 = new Block();
        addObject(block165,796,188);
        Block block166 = new Block();
        addObject(block166,799,206);
        Block block167 = new Block();
        addObject(block167,788,152);
        Block block168 = new Block();
        addObject(block168,785,94);
        Block block169 = new Block();
        addObject(block169,789,111);
        Block block170 = new Block();
        addObject(block170,780,55);
        Block block171 = new Block();
        addObject(block171,783,22);
        Block block172 = new Block();
        addObject(block172,753,425);
        Block block173 = new Block();
        addObject(block173,707,434);
        Block block174 = new Block();
        addObject(block174,678,429);
        Block block175 = new Block();
        addObject(block175,648,430);
        Block block176 = new Block();
        addObject(block176,619,430);
        Block block177 = new Block();
        addObject(block177,55,240);
        Block block178 = new Block();
        addObject(block178,78,241);
        Block block179 = new Block();
        addObject(block179,115,235);
        Block block180 = new Block();
        addObject(block180,150,240);
        Block block181 = new Block();
        addObject(block181,177,237);
        Block block182 = new Block();
        addObject(block182,201,238);
        Block block183 = new Block();
        addObject(block183,223,238);
        Block block184 = new Block();
        addObject(block184,246,235);
        Block block185 = new Block();
        addObject(block185,272,237);
        Block block186 = new Block();
        addObject(block186,308,239);
        Block block187 = new Block();
        addObject(block187,332,239);
        Block block188 = new Block();
        addObject(block188,375,237);
        Block block189 = new Block();
        addObject(block189,389,236);
        Block block190 = new Block();
        addObject(block190,427,234);
        Block block191 = new Block();
        addObject(block191,466,239);
        Block block192 = new Block();
        addObject(block192,512,236);
        Block block193 = new Block();
        addObject(block193,485,238);
        Block block194 = new Block();
        addObject(block194,556,234);
        Block block195 = new Block();
        addObject(block195,593,425);
        Block block196 = new Block();
        addObject(block196,547,433);
        Block block197 = new Block();
        addObject(block197,501,436);
        Block block198 = new Block();
        addObject(block198,519,430);
        Block block199 = new Block();
        addObject(block199,467,434);
        Block block200 = new Block();
        addObject(block200,397,431);
        Block block201 = new Block();
        addObject(block201,432,435);
        Block block202 = new Block();
        addObject(block202,360,436);
        Block block203 = new Block();
        addObject(block203,330,438);
        Block block204 = new Block();
        addObject(block204,304,436);
        Block block205 = new Block();
        addObject(block205,265,435);
        Block block206 = new Block();
        addObject(block206,115,497);
        Block block207 = new Block();
        addObject(block207,142,495);
        Block block208 = new Block();
        addObject(block208,663,243);
        Block block209 = new Block();
        addObject(block209,697,237);
        Block block210 = new Block();
        addObject(block210,551,207);
        Block block211 = new Block();
        addObject(block211,553,177);
        Block block212 = new Block();
        addObject(block212,556,134);
        Block block213 = new Block();
        addObject(block213,561,109);
        Block block214 = new Block();
        addObject(block214,565,70);
        removeObject(block214);
        Block block215 = new Block();
        addObject(block215,753,17);
        Block block216 = new Block();
        addObject(block216,714,21);
        Block block217 = new Block();
        addObject(block217,692,20);
        Block block218 = new Block();
        addObject(block218,660,23);
        Block block219 = new Block();
        addObject(block219,636,28);
        Block block220 = new Block();
        addObject(block220,593,25);
        Block block221 = new Block();
        addObject(block221,570,22);
        Block block222 = new Block();
        addObject(block222,531,18);
        Block block223 = new Block();
        addObject(block223,487,18);
        Block block224 = new Block();
        addObject(block224,459,14);
        Block block225 = new Block();
        addObject(block225,412,14);
        Block block226 = new Block();
        addObject(block226,428,15);
        Block block227 = new Block();
        addObject(block227,369,9);
        Block block228 = new Block();
        addObject(block228,315,17);
        Block block229 = new Block();
        addObject(block229,342,15);
        Block block230 = new Block();
        addObject(block230,266,15);
        Block block231 = new Block();
        addObject(block231,244,14);
        Block block232 = new Block();
        addObject(block232,196,13);
        Block block233 = new Block();
        addObject(block233,165,20);
        removeObject(block213);
        Block block234 = new Block();
        addObject(block234,528,158);
        Block block235 = new Block();
        addObject(block235,527,184);
        Block block236 = new Block();
        addObject(block236,533,201);
        Slime2 slime23 = new Slime2();
        addObject(slime23,142,421);
        Slime slime = new Slime();
        addObject(slime,98,168);
        Slime slime3 = new Slime();
        addObject(slime3,174,169);
        Slime2 slime24 = new Slime2();
        addObject(slime24,326,177);
        Slime2 slime25 = new Slime2();
        addObject(slime25,683,340);
    }
}
