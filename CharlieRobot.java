package robo;

public class CharlieRobot extends BetaRobot{

	public CharlieRobot(String name, String model) {
		super(name, model);
	}
	
	public boolean moveDownLeft() {
		y--;
		x--;
		;
		return false;
	}
	
	public boolean moveUpLeft() {
		y--;
		x--;
		return false;
	}
	
	public boolean moveDownRight() {
		y--;
		x++;
		return false;
	}
	public boolean moveUpRight() {
		y++;
		x++;
		return false;
	}
	
	

	{
		//test
		int i = 0;

		if (moveDownRight() == true) {
			System.err.println("Move test failed\nREASON: moveDownRight() failed!");
		} else {
			i += 25;
		}
		
		if (moveUpRight() == true) {
			System.err.println("Move test failed\nREASON: moveUpRight() failed!");
		} else {
			i += 25;
		}
		if (moveDownLeft() == true) {
			System.err.println("Move test failed\nREASON: moveDownLeft() failed!");
		} else {
			i += 25;
		}
		
		if (moveUpLeft() == true) {
			System.err.println("Move test failed\nREASON: moveUpLeft() failed!");
		} else {
			i += 25;
		}
		
		System.out.println(i);
		
	 
         }
	

}

