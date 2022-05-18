package strategy;

public class StrategyMinNo implements IStrategyFindSpecificNumber {

	@Override
	public int process(int[] v) {
		int min = v[0];
		for(int i = 1; i < v.length; i++) {
			if(min>v[i]) {
				min = v[i];
			}
		}
		return min;
	}

}
