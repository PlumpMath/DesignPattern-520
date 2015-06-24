package facade;

public class RunsScore {
	
	public Boolean hasEnoughRuns(Player p) {
	
		if(p.getRuns() > 50)
			return true;
		else
			return false;
		
	}
}
