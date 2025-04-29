package used;

public class SubCalc implements Calculator {
	
	/**
	* Calculator実装クラス<br>
	* 減算を行う
	*/

	@Override
	public Integer calc(Integer x, Integer y) {
		return x - y;
	}

}
