package ex8;

public class GoodCalc extends Calculator {
	int a;
	int b;
	
	@Override
	public int add(int a, int b) {
		this.a = a;
		this.b = b;
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		this.a = a;
		this.b = b;
		return a-b;
	}

	@Override
	public int average(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

}
