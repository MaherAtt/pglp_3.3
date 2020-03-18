package uvsq.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRobot {

	@Test
	public void testConstructeurDynamique() {
			RobotDynamique rb=new RobotDynamique(1,5);
			assert(rb.orientation==1 && rb.Position==5);
		
	}

}
