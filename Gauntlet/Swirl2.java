import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Swirl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swirl2 extends Particle
{
    BackgroundPlayer display;
    int life;

    public Swirl2(double vx, double vy)
    {
        super();
        getImage().setTransparency(0);
        display = new BackgroundPlayer(this);
        display.add("default", "Particle", 3, 3, 27, 27);
        addPlayer(display);
        display.play("default", false, 0);

        setV(vx, vy);

        life = Greenfoot.getRandomNumber(50);
    }

    public void update()
    {
        super.update();
        addForce(Math.signum(Greenfoot.getRandomNumber(3) - 1) * 0.5, Math.signum(Greenfoot.getRandomNumber(3) - 1) * 0.5);
        addForce(Math.signum(Greenfoot.getRandomNumber(2)) * getVY() * -0.5, Math.signum(Greenfoot.getRandomNumber(2) * getVX() * 0.5));
        applyVel();

        life--;
        if (life <= 0)
            delete();
    }
}
