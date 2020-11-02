package oberverPattern;

public interface Subject {

	void subscribe(Subscriber sub);

	void unsubscribe(Observer sub);

	void notifySubscriebrs();

	void upload(String title);

}