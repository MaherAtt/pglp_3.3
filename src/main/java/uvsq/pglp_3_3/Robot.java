package uvsq.pglp_3_3;

public class Robot {
	int Position;
	int orientation;
	
	public void tourne() {
		// TODO Auto-generated method stub
		orientation= orientation++%4;
	}

	

}
