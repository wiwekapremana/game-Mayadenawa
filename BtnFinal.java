import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtnFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtnFinal extends Buttons
{
    /**
     * Act - do whatever the BtnFinal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("klik.wav");
            Greenfoot.setWorld(new Level3());
            Levels.win = 2;
        }
    }    
}