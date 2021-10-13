package robotBehavior;

public class DefensiveBehavior implements IBehavior{
	public int moveCommand()
	{
		System.out.println("\tDefensive Behavior: if find another robot run from it");
		return -1;
	}
}