package robo;


public class BetaRobot extends AlphaRobot {

	    public BetaRobot(String name, String model) {
		super(name, model);
		}
		
		private byte Charge = 0;
		
	    public void setCharge(byte Charge) {
		   if(Charge>=0 && Charge<=100)
		    this.Charge = Charge;	 
		}

		public byte getCharge() {
			return Charge;
		}
		
		
		

		
		@Override	
		public boolean moveRight() {
			Charge-=0.5;
			x++;
			return false;
		}

		@Override
		public boolean moveLeft() {
			Charge--;
			x--;
			return false;
		}

		@Override
		public boolean moveDown() {
			Charge--;
			y++;
			return false;
			
		}

		@Override
		public boolean moveUp() {
			Charge--;
			y--;
			return false;
		}

}
