package robot.mars.support;

import java.util.List;
import java.awt.Point;

public class Robot {
  private static int positionX;
  private static int positionY;
  private static Character direction;

  public Robot(int positionX, int positionY, Character direction) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.direction = direction;
  }

  public Point move() {
    switch (this.direction) {
      case 'N': return this.moveNorth();
      case 'E': return this.moveEast();
      case 'S': return this.moveSouth();
      case 'W': return this.moveWest();
      default: return this.getPointRobot();
    }
  }

  private Point getPointRobot() {
    return new Point(this.positionX, this.positionY);
  }

  private Point moveNorth() {
    this.positionY++;
    return this.getPointRobot();
  }

  private Point moveSouth() {
    this.positionY--;
    return this.getPointRobot();
  }

  private Point moveEast() {
    this.positionX++;
    return this.getPointRobot();
  }

  private Point moveWest() {
    this.positionX--;
    return this.getPointRobot();
  }

  @Override
  public String toString() {
    return "(" + this.positionX + ", " + this.positionY + ", " + this.direction + ")";
  }
}
