package edu.wpi.teamname.entity;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.ArrayList;

/** Elbonian cipher; you must implement the cipher and the observer pattern */
public class ElbonianCipher implements Observer {

  private String text = "";

  public void setText(String text) {
    String decoded = "";
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    ArrayList<String> numberString = new ArrayList<>();
    {
      numberString.add("01");
      numberString.add("02");
      numberString.add("03");
      numberString.add("04");
      numberString.add("05");
      numberString.add("06");
      numberString.add("07");
      numberString.add("08");
      numberString.add("09");
      numberString.add("10");
      numberString.add("11");
      numberString.add("12");
      numberString.add("13");
      numberString.add("14");
      numberString.add("15");
      numberString.add("16");
      numberString.add("17");
      numberString.add("18");
      numberString.add("19");
      numberString.add("20");
      numberString.add("21");
      numberString.add("22");
      numberString.add("23");
      numberString.add("24");
      numberString.add("25");
      numberString.add("26");
    }
    int counter = 0;

    for (char c : text.toCharArray()) {
      counter++;
      if (c < 'a' || c > 'z') {
        // This is a number. check if 1 or 2 digits. change to letter
        CharArrayReader reader = new CharArrayReader(text.toCharArray());
        char[] dub = new char[2];
        try {
          reader.read(dub, counter, 2);
        } catch (IOException e) {
          e.printStackTrace();
        }
        String finalDub = dub.toString();
        int pos = numberString.indexOf(finalDub);
        decoded += alphabet.charAt(pos);
      } else if (c == ' ') {
        // This is a space. Change it to an 'S'
        decoded += 'S';
      } else if ((c > 'a' || c < 'z') && c != ' ') {
        // This is a letter. Change it to a number
        int pos = alphabet.indexOf(c);
        decoded += numberString.get(pos);
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
