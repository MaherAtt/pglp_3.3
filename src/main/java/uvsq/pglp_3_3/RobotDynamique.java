package uvsq.pglp_3_3;

public class RobotDynamique extends Robot {

	public RobotDynamique(int pos, int ori) {
		Position=pos;
		orientation=ori;
		// TODO Auto-generated constructor stub
	}

	public void avance()
	{
		Position++;
	}
}
