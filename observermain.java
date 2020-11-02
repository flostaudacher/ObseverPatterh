package oberverPattern;

public class observermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject flo = new Channel();
		Subscriber sub1= new Subscriber("julian");
		Subscriber sub2= new Subscriber("jakob");
		
		flo.subscribe(sub1);
		flo.subscribe(sub2);
		
		sub1.subscirbeChannel(flo);
		sub2.subscirbeChannel(flo);
		
		flo.unsubscribe(sub1);
		
		flo.upload("How to learn programming!");
	}

}
