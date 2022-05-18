package observer;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainEvent rain = new RainEvent("rain");
		
		IHandler diana = new DianaHadler();
		IHandler alexandra = new AlexandraHandler();
		IHandler anto = new AntoHandler();
		
		rain.subscribeHandler(diana);
		rain.subscribeHandler(alexandra);
		rain.subscribeHandler(anto);
		
		rain.activateEvent();
		
		
	}

}
