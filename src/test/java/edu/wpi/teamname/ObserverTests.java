package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.wpi.teamname.entity.*;
import org.junit.jupiter.api.Test;

import edu.wpi.teamname.entity.*;
import org.junit.Test;

/**
 * Tests for your observer pattern; make sure your code works! Test-driven development is a good
 * idea here.
 */
public class ObserverTests {

  @Test
  public void testSetText() {
    Message message = new Message();
    message.setText("");
    assertEquals("", message.getText());
  }
}
