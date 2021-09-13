package robo;

public class CharlieRobot extends BetaRobot{

	public CharlieRobot(String name, String model) {
		super(name, model);
		// TODO Auto-generated constructor stub
	}
	
	public boolean moveDownLeft() {
		y--;
		x--;
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
}
