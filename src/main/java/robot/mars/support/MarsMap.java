package robot.mars.support;

public class MarsMap {
  private static int verticalSize = 0;
  private static int horizontalSize = 0;

  public MarsMap(int verticalSize, int horizontalSize) {
    this.verticalSize = verticalSize;
    this.horizontalSize = horizontalSize;
  }

  public boolean inMap(int x, int y) {
    int horizontal = x + 1;
    int vertical = y + 1;

    boolean overHorizontal = (horizontal >= 0) && (horizontal <= this.horizontalSize);
    boolean overVertical = (vertical >= 0) && (vertical <= this.verticalSize);

    return overVertical && overVertical;
  }
}
