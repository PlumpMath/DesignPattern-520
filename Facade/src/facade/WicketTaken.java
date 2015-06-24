package facade;

public class WicketTaken {
	
	public Boolean hasEnoughWicketTaken(Player p) {
		if(p.getWicket() > 5)
			return true;
		else
			return false;
	}

}
