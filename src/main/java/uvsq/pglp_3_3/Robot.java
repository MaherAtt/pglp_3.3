package uvsq.pglp_3_3;

public abstract class Robot {
	int Position;
	int orientation;
	
	
	public void tourne() {
		// TODO Auto-generated method stub
		orientation= (orientation+1)%4;
	}

	

}
