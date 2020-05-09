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
    // assertTrue(caesarTest1());
    // assertTrue(caesarTest2());
    // assertTrue(caesarTest3());
    // assertTrue(elbonianTest1());
    assertTrue(elbonianTest2());
  }

  @Test
  public void caesarTest1() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("This is a boring message!");
    assertEquals("Gsrh rh z ylirmt nvhhztv!", caesar.getText());
  }

  @Test
  public void caesarTest2() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("Don't fall over the railing");
    assertEquals("Wlm'g uzoo levi gsv izrormt", caesar.getText());
  }

  @Test
  public void caesarTest3() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText(
        "Would you like to know one of the methods cryptologists (people who work with codes) use to decode"
            + " messages written in simple codes like this? They scan through the message and look for letters that are "
            + "commonly used. Because they know that some letters are used a lot more than others. For example, the letter"
            + " E is used more than any other letter in the alphabet. So if they were trying to break this code, which "
            + "letter do you think they would find the most? (Hint: remember - the letter E gets replaced with another "
            + "letter of the alphabet!");
    assertEquals("", caesar.getText());
  }

  @Test
  public void caesarTest4() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("5555555");
    assertEquals("", caesar.getText());
  }

  @Test
  public void caesarTest5() {
    CaesarCipher caesar = new CaesarCipher();
    caesar.setText("!!!!!!!");
    assertEquals("!!!!!!!", caesar.getText());
  }

  @Test
  public void elbonianTest1() {
    ElbonianCipher elbonian = new ElbonianCipher();
    elbonian.setText("This is 1 message!");
    assertEquals("20080919S0919SaS13051919010705!", elbonian.getText());
  }

  public boolean elbonianTest2() {
    ElbonianCipher elbonian = new ElbonianCipher();
    elbonian.setText("");
    return elbonian.getText().equals("");
  }
}
