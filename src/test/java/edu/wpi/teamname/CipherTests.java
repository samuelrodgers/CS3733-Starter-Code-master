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
  public void cipherSimpleTest1() {
    assertTrue(ceasarTest1());
    assertTrue(ceasarTest2());
    assertTrue(ceasarTest3());
    assertTrue(elbonianTest1());
    assertTrue(elbonianTest2());
  }

  public boolean ceasarTest1() {
    CaesarCipher ceasar = new CaesarCipher();
    ceasar.setText("This is a boring message!");
    return ceasar.getText().equals("Gsrh rh z ylirmt nvhhztv!");
  }

  public boolean ceasarTest2() {
    CaesarCipher ceasar = new CaesarCipher();
    ceasar.setText("Don't fall over the railing");
    return ceasar.getText().equals("Kvu'a mhss vcly aol yhpspun");
  }

  public boolean ceasarTest3() {
    CaesarCipher ceasar = new CaesarCipher();
    ceasar.setText("S&P500");
    return ceasar.getText().equals("Z&W500");
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
