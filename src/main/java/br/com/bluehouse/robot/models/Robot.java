package br.com.bluehouse.robot.models;

import java.util.List;
import java.awt.Point;

import br.com.bluehouse.robot.support.RobotOutMapException;
import br.com.bluehouse.robot.services.TurnRobot;

public class Robot {
  private static int positionX;
  private static int positionY;
  private static Character direction;
  private static MarsMap marsMap;

  public Robot(int positionX, int positionY, Character direction, MarsMap marsMap) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.direction = direction;
    this.marsMap = marsMap;
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

  public void left() {
    this.direction = new TurnRobot().turnLeft(this.direction);
  }

  public void right() {
    this.direction = new TurnRobot().turnRight(this.direction);
  }

  private Point getPointRobot() {
    if (!this.marsMap.inMap(this.positionX, this.positionY)) {
      throw new RobotOutMapException();
    }

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
