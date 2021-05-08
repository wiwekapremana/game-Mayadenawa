import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditScreen extends Menus
{

    /**
     * Constructor for objects of class CreditScreen.
     * 
     */
    
    public CreditScreen()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Exit exit = new Exit();
        addObject(exit,726,558);
    }
}
