
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Match> matches = readMatchData(file);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int[] statistics = getTeamStatistics(matches, team);
        
        System.out.println("Games: " + statistics[0]);
        System.out.println("Wins: " + statistics[1]);
        System.out.println("Losses: " + statistics[2]);
        
    }
    
    public static ArrayList<Match> readMatchData(String file) {
        ArrayList<Match> matches = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                String[] data = line.split(",");
                
                matches.add(new Match(data[0], data[1], Integer.valueOf(data[2]), Integer.valueOf(data[3])));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return matches;
    } 
    
    public static int[] getTeamStatistics(ArrayList<Match> matches, String team) {
        int matchesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;
        
        for (Match match : matches) {
            if (team.equals(match.getHomeTeam())) {
                matchesPlayed++;
                if (match.getHomePoints() > match.getVisitingPoints()) {
                    gamesWon++;
                } else {
                    gamesLost++;
                }
            } else if (team.equals(match.getVisitingTeam())) {
                matchesPlayed++;
                if (match.getVisitingPoints() > match.getHomePoints()) {
                    gamesWon++;
                } else {
                    gamesLost++;
                }
            } 
        }
        
        int[] statistics = {matchesPlayed, gamesWon, gamesLost};
        
        return statistics;
    }
            
    

}
