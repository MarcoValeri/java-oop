/**
 * This class models a football team with a name, a number of
 * games played, a number of points and a total goal difference.
 */
public class Team {
    private String name;
    private int games, points, goalDifference;
    
    /**
     * constructor
     * param name 
     */
    public Team(String name) {
        this.name = name;
        games = 0;
        points = 0;
        goalDifference = 0;
    }

    /**
     * return the team name
     * return name
     */
    public String teamName() {
        return name;
    }
    
    /**
     * returns the number of points
     * return points
     */
    public int numberOfPoints() {
        return points;
    }
    
    /**
     * returns the number of games played
     * return games
     */
    public int numberOfGames() {
        return games;
    }
    
    /** 
     * returns the total goal difference
     * return goal difference
     */
    public int totalGoalDifference() {
        return goalDifference;
    }
    
    /**
     * called at the end of each game to update the stats
     * param goalsFor goals scored
     * param goalsAgainst goals conceded
     */ 
    public void addResult(int goalsFor, int goalsAgainst) {
        games = games + 1;
        goalDifference = goalsFor - goalsAgainst;
        
        if (goalsFor - goalsAgainst > 0) {
            points = points + 3;
        } else if (goalsFor - goalsAgainst == 0) {
            points = points + 1;
        }
    }    
}