package edu.wpi.teamname.entity;

/** Caesar cipher; you must implement the cipher and the observer pattern */
public class CaesarCipher implements Observer {

  String text = "";

  public void setText(String text) {
    //		char [] textArr = text.toCharArray();
    //		for(int i=0; i<textArr.length;i++){
    //			if ()
    //		}
    //		this.text = "changed";
    String decoded = "";
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String alphabet2 = "zyxwvutsrqponmlkjihgfedcba";

    for (char c : text.toCharArray()) {
      if (c < 'a' || c > 'z') {
        // This is not a letter. Just repeat it verbatim.
        decoded += c;
      } else {
        // This is a letter. Flipify it.
        int pos = alphabet.indexOf(c);
        decoded += alphabet2.charAt(pos);
      }
    }
    this.text = decoded;
  }

  public String getText() {
    return text;
  }

  @Override
  public void notify(Object object) {
    this.setText(String.valueOf(object));
  }
}
