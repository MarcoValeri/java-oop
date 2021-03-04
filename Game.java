/**
 * This class models (football) games between two teams on a
 * specific date with a number of goals for each team and
 * functionality to update each team's internal statistics
 * when the game has finished.
 */
public class Game {
    private String date;
    private Team teamH;
    private Team teamG;
    private int goalH;
    private int goalG;
    
    private static Game[] allGames = new Game[100];
    
    public Game(String date, Team teamH, Team teamG) {
        this.date = date;
        this.teamH = teamH;
        this.teamG = teamG;
        goalH = 0;
        goalG = 0;
    }

    public static Game[] getGames() {
        return allGames;
    }

    /**
     * returns all the games on a given date 
     * @return games
     */
    public static Game[] getGames(String date) 
    {
        // TODO: INSERT YOUR CODE HERE
        // create and return an array that contains 
        //          an appropriate selection of games
    }

    /**
     * returns the date of the game
     * @return date
     */
    public String getDate()
    {
        // TODO: INSERT YOUR CODE HERE
    }
        
    /**
     * returns home team
     * @return team
     */
    public Team getTeamH()
    {
        // TODO: INSERT YOUR CODE HERE
    }
    
    /**
     * returns away team
     * @return team
     */
    public Team getTeamG()
    {
        // TODO: INSERT YOUR CODE HERE
    }
    
    /**
     * returns the home team goals
     * @return goals
     */
    public int getGoalsH()
    {
        // TODO: INSERT YOUR CODE HERE
    }    

    /**
     * returns the away team goals
     * @return goals
     */
    public int getGoalsG()
    {
        // TODO: INSERT YOUR CODE HERE
    }  
    
    /**
     * called when home team scores
     */
    public void goalH() 
    {
        // TODO: INSERT YOUR CODE HERE
    }
    
    /**
     * called when away team scores
     */
    public void goalG()
    {
        // TODO: INSERT YOUR CODE HERE
    }
    
    /**
     * called at the end of the game
     */
    public void whistle()
    {
        // TODO: INSERT YOUR CODE HERE
        // record the game result for both teams
    }       
}