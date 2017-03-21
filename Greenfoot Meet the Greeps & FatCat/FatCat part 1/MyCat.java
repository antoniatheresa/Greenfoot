// WARNING: This file is auto-generated and any changes to it will be overwritten

/**
 * 
 */
public class MyCat extends Cat
{
    private boolean isTired = false;
    private boolean isBored = true;
    private boolean isHungry = false;

    /**
     * 
     */
    public void act()
    {
        if (isAlone()) {
            sleep(5);
        }
    }
}
