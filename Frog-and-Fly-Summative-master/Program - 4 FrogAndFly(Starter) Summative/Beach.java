import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    private Scoreboard score;
    
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       addFood();

       // add a Fly object at a random position somewhere in the world
       addObject( new Fly(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
       
       // add a Frog object at the center of the world 
       addObject( new Frog(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
       
       score = new Scoreboard();
       addObject(score,75,25);
    }
    /**
     * Adds n Food objects to the world
     * 
     * @param (int n)
     * @return nothing is required
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    /**
     * adds 10 food items randomly in the world
     * 
     * @param none there are none
     * @return nothing is required
     */
    private void addFood()
    {
        // use addObject to add ten food items in the world (beach)
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
    }
    /**
     * adds a frog in the middle of the world
     * 
     * @param none noth8ing is required
     * @return none nothing is returned
     */
    public void addFrog()
    {
        addObject( new Frog(), getWidth()/2, getHeight()/2);
    }
    /**
     * updates score in top left courner if you touch food
     * 
     * @param none tnothing is required
     * @return none nothing is returned
     */
    public void update()
    {
        score.addToScore();
    }
}
