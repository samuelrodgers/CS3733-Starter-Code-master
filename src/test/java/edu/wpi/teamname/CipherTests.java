package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.wpi.teamname.entity.CaesarCipher;
import edu.wpi.teamname.entity.ElbonianCipher;
import org.junit.jupiter.api.Test;

/**
 * Tests for your cipher functions; make sure your code works! Test-driven development is a good
 * idea here.
 */
public class CipherTests {

  @Test
  public void cipherSetTextTests() {
    //    assertTrue(caesarTest1());
    // assertTrue(caesarTest2());
    // assertTrue(caesarTest3());
    assertTrue(elbonianTest1());
    assertTrue(elbonianTest2());
  }

  @Test
  public void caesarTest1() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("This is a boring message!");
    // return caesar.getText().equals("Gsrh rh z ylirmt nvhhztv!");
    assertEquals("Gsrh rh z ylirmt nvhhztv!", caesar.getText());
  }
@Test
  public void caesarTest2() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("Don't fall over the railing");
    assertEquals("Kvu'a mhss vcly aol yhpspun", caesar.getText());
  }

  @Test
  public void caesarTest3() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("S&P500");
    // return caesar.getText().equals("Z&W500");
    assertEquals("Z&W500", caesar.getText());
  }

  public boolean elbonianTest1() {
    ElbonianCipher elbonian = new ElbonianCipher();
    elbonian.setText("");
    return elbonian.getText().equals("");
  }

  public boolean elbonianTest2() {
    ElbonianCipher elbonian = new ElbonianCipher();
    elbonian.setText("");
    return elbonian.getText().equals("");
  }
}
