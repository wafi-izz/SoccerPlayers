import java.util.Arrays;
import java.util.Objects;

public class SoccerPlayerMain {
    public static void main(String[] args) {
        SoccerPlayer player1 = new SoccerPlayer("john",20,new String[]{"alex","doe"},5);
        SoccerPlayer player2 = new SoccerPlayer("doe",20,new String[]{"alex","doe"});
        SoccerPlayer player3 = new SoccerPlayer("eric",20,5);
        player3.setTeam(new String[]{"foe","finn"});
        SoccerPlayer player4 = new SoccerPlayer("max",20,new String[]{"alex","doe"},5);
        SoccerPlayer player5 = new SoccerPlayer("finn",20,5);
        player5.setTeam(new String[]{"alex","doe"});
        SoccerPlayer player6 = new SoccerPlayer("mark",20,new String[]{"alex","doe"});

        System.out.println(player1.equals(player4));
        System.out.println(player2.equals(player5));
        System.out.println(player3.equals(player6));

    }
}
class SoccerPlayer {
    private String name;
    private int age;
    private String[] team;
    private int scoreGoals;
    public SoccerPlayer(String name, int age, String[] team, int scoreGoals) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoreGoals = scoreGoals;
    }
    public SoccerPlayer(String name, int age, String[] team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }
    public SoccerPlayer(String name, int age, int scoreGoals) {
        this.name = name;
        this.age = age;
        this.scoreGoals = scoreGoals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getTeam() {
        return team;
    }

    public void setTeam(String[] team) {
        this.team = team;
    }

    public int getScoreGoals() {
        return scoreGoals;
    }

    public void setScoreGoals(int scoreGoals) {
        this.scoreGoals = scoreGoals;
    }
    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", team: " + team + ", scoreGoals: " + scoreGoals;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerPlayer soccerPlayer = (SoccerPlayer) o;
        if (Arrays.equals(team, soccerPlayer.team) && scoreGoals == soccerPlayer.scoreGoals) return true;
        else return false;
    }
}

//Create SoccerPlayer class
//
//Task:
//a. Create SoccerPlayers class which will have name, age, team, scoredGoals.
//b. Create 3 Constructor (name, age, team, scoredGoals) (name, age, scoredGoals) (name, age, team)
//c. Create getter and setter for all variables.
//d. Override toString function
//e. Override equals function to compare scoredGoals and team (just two of them)
//f. Create main function and in the main function create 5-6 players. Then Test all of them.
//g. Create github repo for this project from your github and publish your codes in your github, then send the link to me.
//
//
//        !!! IMPORTANT !!!
//If you have any question please ask me and try to complete the exercise