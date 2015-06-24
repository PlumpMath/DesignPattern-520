package proxyAndFacade;
 

public class RemoteController implements Controller {
	TV_controller tv=new TV_controller();
	
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		if (!tv.status) {
			tv.on();
		}
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		if (tv.status) {
			tv.off();
		}
	}
	
	@Override
	public void sound_up() {
		// TODO Auto-generated method stub
		tv.sound_up();
	}

	@Override
	public void sound_down() {
		// TODO Auto-generated method stub
		tv.sound_down();
	}

	@Override
	public void channel_up() {
		// TODO Auto-generated method stub
		tv.channel_up();
	}

	@Override
	public void channel_down() {
		// TODO Auto-generated method stub
		tv.channel_down();
	}

}
