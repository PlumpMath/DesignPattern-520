package proxyAndFacade;

public class TV_controller implements Controller {

	Power po = new Power();
	Display dis = new Display();
	Sound sou = new Sound();
	Boolean status;
	
	public TV_controller() {
		status=false;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		po.on();
		sou.sound_on();
		dis.displayon();
		status=true;	
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		po.off();
		sou.sound_off();
		dis.displayoff();
		status =false;
	}
	
	@Override
	public void sound_up() {
		// TODO Auto-generated method stub
		if (status) 
			sou.sound_up();
		else
			System.out.println("Tv turned Off");
	}

	@Override
	public void sound_down() {
		// TODO Auto-generated method stub
		if (status)
			sou.sound_down();
		else
			System.out.println("Tv turned Off");
	}
	
	@Override
	public void channel_up() {
		
		if (status)
			dis.channel_up();
		else
			System.out.println("Tv turned Off");
	}
	
	@Override
	public void channel_down() {
		// TODO Auto-generated method stub
		
		if (status)
			dis.channel_down();
		else
			System.out.println("Tv turned Off");
	}
}
