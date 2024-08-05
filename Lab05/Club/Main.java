package Club;

public class Main {
	public static void main(String[] args) {
        Club club1 = new Club("Team A", 5, 2, 3);
        System.out.println(club1);
        System.out.println("Matches Played: " + club1.numMatchesPlayed());
        System.out.println("Points: " + club1.getPoints());
        System.out.println("Is Finished: " + club1.isFinish());

        Club club2 = new Club(club1);
        club2.setName("Team B");
        System.out.println(club2);
    }
}
