package br.com.bluehouse.robot.support;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
@SuppressWarnings("serial")
public class RobotErrorExecutingException extends RuntimeException {

  public RobotErrorExecutingException(String command) {
    super(String.format("Error executing a command! Invalid command: '%s'", command));
  }
}
