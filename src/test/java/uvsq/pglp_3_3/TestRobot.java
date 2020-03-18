package uvsq.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRobot {

	@Test
	public void testConstructeurDynamique() {
			RobotDynamique rb=new RobotDynamique(1,5);
			assert(rb.orientation==1 && rb.Position==5);		
	}
	
	@Test
	public void testConstructeurStatique() {
			RobotStatique rb=new RobotStatique(1,5);
			assert(rb.orientation==1 && rb.Position==5);		
	}
	@Test
	public void testConstructeurDynamiqueOrient() {
			RobotDynamique rb=new RobotDynamique(5,5);
			assert(rb.orientation==1 && rb.Position==5);		
	}
	@Test
	public void testConstructeurStatiqueOri() {
			RobotDynamique rb=new RobotDynamique(6,5);
			assert(rb.orientation==2 && rb.Position==5);		
	}
	
	@Test
	public void testAvance() {
			RobotDynamique rb=new RobotDynamique(1,5);
			rb.avance();
			assert(rb.orientation==1 && rb.Position==6);		
	}
	@Test
	public void testTourne() {
			RobotDynamique rb=new RobotDynamique(1,5);
			rb.tourne();
			assert(rb.orientation==2 && rb.Position==5);		
	}
	@Test
	public void testTourneStatique() {
			RobotStatique rb=new RobotStatique(1,5);
			rb.tourne();
			assert(rb.orientation==2 && rb.Position==5);		
	}
	
}
