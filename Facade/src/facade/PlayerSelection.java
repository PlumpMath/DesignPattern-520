package facade;

public class PlayerSelection {
	RunsScore rs=null;
	WicketTaken wt = null;
	BoundariesSave bs = null;
	
	public Boolean isFitForSelection(Player p){
		rs = new RunsScore();
		wt = new WicketTaken();
		bs = new BoundariesSave();
		if(rs.hasEnoughRuns(p) == true && wt.hasEnoughWicketTaken(p) == true && bs.hasBoundariesEnoug(p) == true)
			return true;
		else
			return false;
	}
	
}
