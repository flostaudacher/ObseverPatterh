package oberverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<Subscriber> subs= new ArrayList<>();
	public static String title;
	
	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	@Override
	public void unsubscribe(Observer sub) {
		subs.remove(sub);
	}
	@Override
	public void notifySubscriebrs() {
		for (Observer sub : subs) {
			sub.update();
		}
	}
	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriebrs();
	}
}
