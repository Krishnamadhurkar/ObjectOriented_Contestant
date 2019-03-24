
public class RoboticsResult implements IResult{

//Team 1 results
RoboticsTeam team1;
double team1Points;
int team1Tasks;
boolean team1BotFellDown;
//Team 2 results
RoboticsTeam team2;
double team2Points;
int team2Tasks;
boolean team2BotFellDown;

	public RoboticsResult(RoboticsTeam team1, double team1Points, int team1Tasks, boolean team1BotFellDown, 
		    			  RoboticsTeam team2, double team2Points, int team2Tasks, boolean team2BotFellDown) {
		this.team1 = team1;
		this.team1Points = team1Points;
		this.team1Tasks = team1Tasks;
		this.team1BotFellDown = team1BotFellDown;
		this.team2 = team2;
		this.team2Points = team2Points;
		this.team2Tasks = team2Tasks;
		this.team2BotFellDown = team2BotFellDown;
	}
	
	public boolean isValid(double team1Points, int team1Tasks, 
						   double team2Points, int team2Tasks) {
		if(team1Tasks < 8 && team2Tasks < 8 && team1Points < 16 && team2Points < 16)
			return true;
		else
			return false;
	}
	
	public double getScore (double team1Points, int team1Tasks, boolean team1BotFellDown) {
		double finalScore = (team1Points + team1Tasks); 
		if (team1BotFellDown) 
			return finalScore - 5;
		else 
			return finalScore;
		
	}
	
	public Icontestant getWinner() {
		this.team1
	}
	
}
........

public class RoboticsResult implements IResult{

//Team 1 results
RoboticsTeam team1;
double team1Points;
int team1Tasks;
boolean team1BotFellDown;
//Team 2 results
RoboticsTeam team2;
double team2Points;
int team2Tasks;
boolean team2BotFellDown;

	public RoboticsResult(RoboticsTeam team1, double team1Points, int team1Tasks, boolean team1BotFellDown, 
		    			  RoboticsTeam team2, double team2Points, int team2Tasks, boolean team2BotFellDown) {
		this.team1 = team1;
		this.team1Points = team1Points;
		this.team1Tasks = team1Tasks;
		this.team1BotFellDown = team1BotFellDown;
		this.team2 = team2;
		this.team2Points = team2Points;
		this.team2Tasks = team2Tasks;
		this.team2BotFellDown = team2BotFellDown;
	}
	
	public boolean isValid(double team1Points, int team1Tasks, 
						   double team2Points, int team2Tasks) {
		if(team1Tasks < 8 && team2Tasks < 8 && team1Points < 16 && team2Points < 16)
			return true;
		else
			return false;
	}
	
	public double getScore (double team1Points, int team1Tasks, boolean team1BotFellDown) {
		double finalScore = (team1Points + team1Tasks); 
		if (team1BotFellDown) 
			return finalScore - 5;
		else 
			return finalScore;
		
	}
	
	public Icontestant getWinner() {
		this.team1
	}
	
}
