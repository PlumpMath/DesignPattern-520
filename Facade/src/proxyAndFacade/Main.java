package proxyAndFacade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller remCo=new RemoteController();
		remCo.on();
		remCo.sound_up();
		remCo.sound_down();
		remCo.channel_up();
		remCo.channel_down();
		remCo.off();
		remCo.sound_up();

	}

}
