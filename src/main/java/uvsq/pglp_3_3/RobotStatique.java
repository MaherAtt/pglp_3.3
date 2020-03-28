package uvsq.pglp_3_3;

public class RobotStatique extends Robot {
  /**
  * constructeur du robot statique.
  * @param pos : la position actuelle et final du robot
  * @param ori : l'orientation actuelle du robot
  */
  public RobotStatique(int pos, int ori) {
    position = pos;
    orientation = ori % 4;
  }
}
