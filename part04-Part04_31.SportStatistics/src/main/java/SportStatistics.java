
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();

        System.out.println("File:");
        String fileName = scan.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] csvFormat = line.split(",");

                String homeTeam = csvFormat[0];
                String visitingTeam = csvFormat[1];
                int homeTeamPoints = Integer.valueOf(csvFormat[2]);
                int visitingTeamPoints = Integer.valueOf(csvFormat[3]);

                games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team:");
        String teamName = scan.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

//        for (Game g : games) {
//            if (g.getHomeTeam().equals(teamName)) {
//                gamesPlayed++;
//                
//                if (g.getHomeTeamPoints() > g.getVisitingTeamPoints()) {
//                    wins++;
//                } else {
//                    losses++;
//                }
//
//            }
//            if (g.getVisitingTeam().equals(teamName)) {
//                gamesPlayed++;
//                
//                if (g.getVisitingTeamPoints() > g.getHomeTeamPoints()) {
//                    wins++;
//                } else {
//                    losses++;
//                }
//            }
//        }
// This code will be simplified applying Object-Oriented principles, aka. implementing the funcionality in the class/object itself
        for (Game g : games) {
            if (g.teamParticipates(teamName)) {
                gamesPlayed++;
                
                if (g.teamWins(teamName)) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
