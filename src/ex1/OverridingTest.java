package ex1;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Weapon weapon = new Weapon();
			Cannon cannon = new Cannon();
			

			System.out.println(weapon.fire());
			System.out.println(cannon.fire());		
	}
}
