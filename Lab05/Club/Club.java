package Club;

public class Club {
	private String name;
	private int wins;
	private int draws;
	private int losses;
	
	public Club() {
		name = "";
		wins = 0;
		draws = 0;
		losses =0;
	}

	public Club(String name, int wins, int draws, int losses) {
		this.name = name;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
	}
	
	public Club(Club club) {
		name = club.name;
		wins = club.wins;
		draws = club.draws;
		losses = club.losses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int numMatchesPlayed() {
		return wins + draws + losses;
	}
	
	public boolean isFinish() {
		if(numMatchesPlayed()>=10) return true;
		return false;
	}
	
	public int getPoints() {
		return wins*3 + draws*1;
	}
	
	public String toString() {
		return String.format("Club %s: %d/%d/%d",name, wins,draws,losses); 
	}
	
}
