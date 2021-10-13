package robotBehavior;

public class Robot {
	IBehavior behavior;
	String name;

	public Robot(String name)
	{
		this.name = name;
		this.behavior = new NormalBehavior();
	}

	public void setBehavior(IBehavior behavior)
	{
		this.behavior = behavior;
	}

	public IBehavior getBehavior()
	{
		return behavior;
	}

	public void move()
	{
		System.out.println(this.name + ": Based on user input " +
					 "the behavior object decides the next move:");
		int command = behavior.moveCommand();
		// ... send the command to mechanisms
		System.out.println("\tThe result returned by behavior object " +
					"is sent to the movement mechanisms " + 
					"for the robot '"  + this.name + "': " + command);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}