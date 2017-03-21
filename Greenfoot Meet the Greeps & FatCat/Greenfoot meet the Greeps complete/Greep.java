// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * A Greep is an alien creature that has come to Earth to collect tomatoes. Greeps like tomatoes.
 */
public class Greep extends Actor
{
    private int tomatoes = 0;

    /**
     * 
     */
    public void act()
    {
        move(4);
        if (isAtEdge()) {
            turn(13);
        }
        if (isTouching(Tomato.class)) {
            tomatoes = tomatoes + 1;
            removeTouching(Tomato.class);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (tomatoes == 1) {
            setImage("greep-with-food.png");
        }
        else if (tomatoes == 3) {
            setImage("greep-with-more-food.png");
        }
    }

    /**
     * 
     */
    public void commands()
    {
        turn(3);
        /* Use these commands to drag them into the 'act' method*/
    }
}
