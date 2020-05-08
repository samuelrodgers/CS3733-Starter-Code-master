package edu.wpi.teamname;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import edu.wpi.teamname.entity.CaesarCipher;
import edu.wpi.teamname.entity.ElbonianCipher;
import org.junit.Test;

/**
 * Tests for your cipher functions; make sure your code works! Test-driven development is a good
 * idea here.
 */
public class CipherTests {

  @Test
  public void cipherSetTextTests() {
    assertTrue(caesarTest1());
    assertTrue(caesarTest2());
    assertTrue(caesarTest3());
    assertTrue(elbonianTest1());
    assertTrue(elbonianTest2());
  }

  public boolean caesarTest1() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("This is a boring message!");
    return caesar.getText().equals("Gsrh rh z ylirmt nvhhztv!");
  }

  public boolean caesarTest2() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("Don't fall over the railing");
    return caesar.getText().equals("Kvu'a mhss vcly aol yhpspun");
  }

  public boolean caesarTest3() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("S&P500");
    return caesar.getText().equals("Z&W500");
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
