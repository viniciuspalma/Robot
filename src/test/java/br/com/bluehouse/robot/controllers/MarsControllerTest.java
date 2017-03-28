package br.com.bluehouse.robot.controllers;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MarsControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void testMoveRobotSuccessfully() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.post("/rest/mars/MMMM").accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andExpect(content().string(equalTo("(0, 4, N)")));
  }

  @Test
  public void testMoveRobotWithInvalidCommands() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.post("/rest/mars/FOO").accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isBadRequest());
  }

  @Test
  public void testMoveRobotOutMap() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.post("/rest/mars/MMMMM").accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isBadRequest());
  }
}
