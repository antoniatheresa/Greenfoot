// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class Planet extends World
{

    /**
     * 
     */
    public Planet()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject( new Greep(), 320, 288);
        addObject( new Tomato(), 627, 133);
        addObject( new Tomato(), 680, 408);
        addObject( new Tomato(), 480, 464);
        addObject( new Tomato(), 408, 147);
        addObject( new Tomato(), 129, 128);
        addObject( new Tomato(), 127, 403);
        addObject( new Tomato(), 573, 267);
        addObject( new Tomato(), 244, 556);
        addObject( new Tomato(), 325, 23);
    }
}
