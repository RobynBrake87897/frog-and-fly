import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    public Fly()
    {
        /**
         * modify this code to make the turtle face any random 
         * initial direction
         */
        setRotation(Greenfoot.getRandomNumber(360));
        
    }
        /**
         * Make the fly turn left or right 5 degrees when the left or right 
         * arrow key is pressed. If the fly touches a Food object, remove the 
         * Food objectfrom the world. and if fly is at edge make it turn 25. 
         * and, if the fly is touching food update the score
         * 
         * @param none nothing is required
         * @return none noth8ing is returned
         */
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        if( Greenfoot.isKeyDown("up")==true)
        {
            // make fly move forward 4 steps
            move(4);
        }
        if(Greenfoot.isKeyDown("right")==true)
        {
            
            turn(5);
        }
        else if(Greenfoot.isKeyDown("left")==true) // if left key is pressed
        {
            
            turn(-5);
        }
        if( isTouching(Food.class)== true)
        {
            removeTouching(Food.class);
            ((Beach)getWorld()).update();
        } 
        if(isAtEdge() == true)
        {
            turn(25);
        }
    }    
}
