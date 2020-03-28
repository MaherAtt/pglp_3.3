package uvsq.pglp_3_3;

public abstract class Robot {
  int position;
  int orientation;
  
  /**
   * methode qui fait tourner le robot.
   */
  public void tourne() {
    orientation = (orientation + 1) % 4;
  }
}
