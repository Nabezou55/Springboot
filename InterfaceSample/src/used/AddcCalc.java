package used;

public class AddcCalc implements Calculator {
	
	/**
	* Calculator実装クラス<br>
	* 加算を行う
	*/
	
	@Override
	public Integer calc(Integer x, Integer y) {
		return x + y;
	}

}
