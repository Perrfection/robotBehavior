package robotBehavior;

import java.util.Random;

public class ErraticBehavior implements IBehavior {
	Random rand = new Random();
	public int moveCommand(){
		int random = (rand.nextInt(3))-1;
		System.out.println("\tErratic Behavior: if find another movie in randome direction ");
		return random;
		}
}