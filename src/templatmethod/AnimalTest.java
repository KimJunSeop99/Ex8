package templatmethod;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal bolt = new Dog();
		Animal kitty = new Cat();
		
		
		bolt.playWithOwner();
		System.out.println();
		kitty.playWithOwner();
	}
}
