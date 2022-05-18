package strategy;

public class StrategyMaxNo implements IStrategyFindSpecificNumber{

	@Override
	public int process(int[] v) {
		int max = v[0];
		for(int i = 1; i < v.length; i++) {
			if(max<v[i]) {
				max = v[i];
			}
		}
		return max;
	}

}
