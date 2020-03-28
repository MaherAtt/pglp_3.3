package uvsq.pglp_3_3;

public class RobotDynamique extends Robot {
  /**
   * constructeur du robot dynamique.
   * @param pos : la position actuelle du robot
   * @param ori : l'orientation actuelle du robot
   */
  public RobotDynamique(int pos, int ori) {
    position = pos;
    orientation = ori % 4;
  }

  /**
   * methode qui fait avancer le robot.
   */
  public void avance() {
    position++;
  }
}
