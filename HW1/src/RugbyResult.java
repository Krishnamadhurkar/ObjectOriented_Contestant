
public class RugbyResult implements IResult {

	RugbyTeam team1;
	RugbyTeam team2;
	double team1Points;
	double team2Points;
	
	public RugbyResult(RugbyTeam team1, RugbyTeam team2, double team1Points, double team2Points) {
		this.team1 = team1;
		this.team2 = team2;
		this.team1Points = team1Points;
		this.team2Points = team2Points;
	}
	
	public boolean isValid(double team1Points, double team2Points) {
		if(team1Points < 150 && team2Points < 150)
			return true;
		else
			return false;
	}
	
	
	
	
	
}
