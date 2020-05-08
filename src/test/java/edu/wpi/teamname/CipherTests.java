package edu.wpi.teamname;

import static junit.framework.TestCase.assertEquals;

import edu.wpi.teamname.entity.CaesarCipher;
import edu.wpi.teamname.entity.ElbonianCipher;
import org.junit.Test;

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
    ceasar.setText("");
    assertEquals("", ceasar.getText());
  }

  @Test
  public void elbonianTest() {
    ElbonianCipher elbonian = new ElbonianCipher();
    elbonian.setText("");
    assertEquals("", elbonian.getText());
  }
}
