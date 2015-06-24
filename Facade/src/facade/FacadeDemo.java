package facade;

public class FacadeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p = new Player("Adam",100,7,15);
		PlayerSelection ps = new PlayerSelection();
		if(ps.isFitForSelection(p) == true)
			System.out.println("Player is Selected");
		else
			System.out.println("Player can't be Selected");
	}

}
