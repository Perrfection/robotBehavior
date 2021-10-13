package robotBehavior;

public class AgressiveBehavior implements IBehavior{
	public int moveCommand(){
		System.out.println("\tAgressive Behavior: if find another robot attack it");
		return 1;
	}
}