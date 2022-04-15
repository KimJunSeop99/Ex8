package ex8;

public class GoodCalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc goodcalc = new GoodCalc();

		int[] avg = new int[] {5,15,222};
		System.out.println(goodcalc.add(2,3));
		System.out.println(goodcalc.subtract(2,3));
		System.out.println(goodcalc.average(avg));
	}
}
