//Created by Brian Yu on 10/22/2017
public class BaseballStatistics {
    public static void main(String[] args){
        Baseball baseball = new Baseball();
        BaseballPlayers babeRuth = new BaseballPlayers("Babe Ruth", 0.342);
        System.out.println("The sport is " + baseball.name + " which has " + baseball.numberOfPeriods + " innings and " + baseball.playersOnTeam + " players on each team." );
        System.out.println("The player's name is " + babeRuth.playerName + " who has a batting average of " + babeRuth.statistic);
    }
}

class Sport {
    public String name;
    public int playersOnTeam;
    public int numberOfPeriods;

    public Sport(){
    }

    public Sport(String name, int playersOnTeam, int numberOfPeriods){
        this.name = name;
        this.playersOnTeam = playersOnTeam;
        this.numberOfPeriods = numberOfPeriods;
    }

}
class Players {
    public String playerName;
    double statistic;
    Sport sportName;

    public Players() {
    }

    public Players(String playerName, double statistic, Sport sportName){
        this.playerName = playerName;
        this.statistic = statistic;
        this.sportName = sportName;
    }
}
class Baseball extends Sport {

    public Baseball(){
        this.name = "Baseball";
        this.playersOnTeam = 9;
        this.numberOfPeriods = 9;
    }
}
class BaseballPlayers extends Players {

    public BaseballPlayers(String playerName, double battingAverage){
        this.playerName = playerName;
        this.statistic = battingAverage;
        this.sportName = new Baseball();
    }
}
