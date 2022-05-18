package observer;

public class RainEvent extends Observable{

	
	private String info;
	private boolean EvStarted = false;
	
	
	
	
	public RainEvent(String info) {
		super();
		this.info = info;
	}

	public void activateEvent() {
		if(this.EvStarted == false) {
			this.EvStarted = true;
			this.notifyAllHandlers();
		}
		
	}
	
	public void publishEvent() {
		this.activateEvent();
	}
}
