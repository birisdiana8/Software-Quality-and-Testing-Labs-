package strategy;

public class Data {
	
	private int[]  vector = null;
	private IStrategyFindSpecificNumber strategy;
	
	public Data(int[] vector, IStrategyFindSpecificNumber strategy) {
		super();
		this.vector = vector;
		this.strategy = strategy;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	public IStrategyFindSpecificNumber getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategyFindSpecificNumber strategy) {
		this.strategy = strategy;
	}
	
	public int processVector() {
		return this.strategy.process(vector);
	}

}
