package facade;

public class BoundariesSave {
	
	public Boolean hasBoundariesEnoug(Player p){
		if(p.getBoundarySave()> 5)
			return true;
		else
			return false;
	}

}
