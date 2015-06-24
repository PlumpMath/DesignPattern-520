package facade;

public class Player {
	private	String name;
	private Integer runs,wicket,boundarySave;
	
	public Player(String n,int r,int w,int bs) {
		name=n;
		runs=r;
		wicket=w;
		boundarySave=bs;
	}
	
	public String getName() {
		return name;
	}
	public Integer getRuns() {
		return runs;
	}
	public Integer getWicket() {
		return wicket;
	}
	public Integer getBoundarySave() {
		return boundarySave;
	}
		
}
