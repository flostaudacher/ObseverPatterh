package oberverPattern;

public class Subscriber implements Observer {
	private String name;
	private Subject channel = new Channel();
	
	@Override
	public void update() {
		System.out.println("Hey "+ name +" Video uploadet!");
	}
	@Override
	public void subscirbeChannel(Subject ch) {
		channel = ch;
	}
	public Subscriber(String name) {
		super();
		this.name = name;
	}
}
