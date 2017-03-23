import org.junit.Test;
import static org.junit.Assert.*;

import robot.mars.support.MarsMap;

public class MarsMapTest {

  @Test
  public void testInMapWithValidParameters() {
    MarsMap marsMap = new MarsMap(5, 5);

    assertTrue("must be in the map and return true", marsMap.inMap(4, 4));
  }

  @Test
  public void testInMapWithInalidParameters() {
    MarsMap marsMap = new MarsMap(5, 5);

    assertFalse("must be out the map and return false", marsMap.inMap(5, 5));
  }
}
