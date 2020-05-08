package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.wpi.teamname.entity.CaesarCipher;
import edu.wpi.teamname.entity.ElbonianCipher;
import org.junit.jupiter.api.Test;

/**
 * Tests for your cipher functions; make sure your code works! Test-driven development is a good
 * idea here.
 */
public class CipherTests {

  @Test
  public void cipherSimpleTest1() {}

  @Test
  public void ceasarTest() {
    CaesarCipher ceasar = new CaesarCipher();
    ceasar.setText("abcd");
    assertEquals("zyxw", ceasar.getText());
  }

  @Test
  public void elbonianTest() {
    ElbonianCipher elbonian = new ElbonianCipher();
    elbonian.setText("");
    assertEquals("", elbonian.getText());
  }
}
