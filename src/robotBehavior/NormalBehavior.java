package robotBehavior;

public class NormalBehavior implements IBehavior{
	public int moveCommand(){
		System.out.println("\tNormal Behavior: if find another robot ignore it");
		return 0;
	}
}
