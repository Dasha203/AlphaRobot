import java.util.Scanner;

public class AlphaRobot extends AbstractRobot{

	private String name;
	private String model;
	private int x;
	private int y;

	 boolean moveRight;
	 boolean moveLeft;
	 boolean moveUp;
	 boolean moveDown;
	 
	/////////////////////////////////////////
	
	 

	public String getName() {
		return name;
	}

	public AlphaRobot(String name, String model) {
		super();
		setName(name);
		setModel(model);
	}

	public void setName(String name) {
		if(name != null){ 
				this.name = name; 
		}
			
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model != null){ 
		this.model = model; 
	}
	
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x>0 && x<100) {
			this.x = x;
		}else {
			System.err.println("Error");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y>0 && y<100) {
			this.y = y;
		}else {
			System.err.println("Error");
		}
	}
	

	
		
	public boolean moveRight() {
		x++;
		return false;
	}

	@Override
	public boolean moveLeft() {
		x--;
		return false;
	}

	@Override
	public boolean moveDown() {
		y++;
		return false;
	}

	@Override
	public boolean moveUp() {
		y--;
		return false;
	}

	
	
	

