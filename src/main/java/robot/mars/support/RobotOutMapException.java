package robot.mars.support;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
@SuppressWarnings("serial")
public class RobotOutMapException extends RuntimeException {

  public RobotOutMapException() {
    super("The robot can't walk outside of his map!");
  }
}
