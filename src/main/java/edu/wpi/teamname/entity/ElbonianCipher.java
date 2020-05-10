package edu.wpi.teamname.entity;

import java.util.ArrayList;

/** Elbonian cipher; you must implement the cipher and the observer pattern */
public class ElbonianCipher implements Observer {

  private String text = "";

  public void setText(String text) {
    String decoded = "";
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    ArrayList<Character> numberString = new ArrayList<>();
    ArrayList<String> numbersPrint = new ArrayList<>();

    numbersPrint.add("01");
    numbersPrint.add("02");
    numbersPrint.add("03");
    numbersPrint.add("04");
    numbersPrint.add("05");
    numbersPrint.add("06");
    numbersPrint.add("07");
    numbersPrint.add("08");
    numbersPrint.add("09");
    numbersPrint.add("10");
    numbersPrint.add("11");
    numbersPrint.add("12");
    numbersPrint.add("13");
    numbersPrint.add("14");
    numbersPrint.add("15");
    numbersPrint.add("16");
    numbersPrint.add("17");
    numbersPrint.add("18");
    numbersPrint.add("19");
    numbersPrint.add("20");
    numbersPrint.add("21");
    numbersPrint.add("22");
    numbersPrint.add("23");
    numbersPrint.add("24");
    numbersPrint.add("25");
    numbersPrint.add("26");
    numberString.add('1');
    numberString.add('2');
    numberString.add('3');
    numberString.add('4');
    numberString.add('5');
    numberString.add('6');
    numberString.add('7');
    numberString.add('8');
    numberString.add('9');
    int counter = 0;

    for (char c : text.toCharArray()) {
      if (counter >= 139) {
        break;
      } else {
        if (c == '_') {
          decoded += '0';
        } else if (c == '0') {
          decoded += '_';
        } else if (c == ' ') {
          decoded += 'S';
        } else if (c == 'S') {
          decoded += ' ';
        }
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
            || c == '8' || c == '9') {
          // This is a number. check if 1 or 2 digits. change to letter
          int pos = numberString.indexOf(c);
          decoded += alphabet.charAt(pos);
        } else if (alphabet.indexOf(c) != (-1)) {
          // This is a letter. Change it to a number
          int pos = alphabet.indexOf(c);
          decoded += numbersPrint.get(pos);
        } else if (capitals.indexOf(c) != (-1) && c != 'S') {
          // This is a capital letter. Change it to a number
          int pos = capitals.indexOf(c);
          decoded += numbersPrint.get(pos);
        }
        if (c == ';') {
          decoded += ';';
        }
        if (c == ':') {
          decoded += ':';
        }
        if (c == ',') {
          decoded += ',';
        }
        if (c == '.') {
          decoded += '.';
        }
        if (c == '?') {
          decoded += '?';
        }
        if (c == '!') {
          decoded += '!';
        }
        if (c == '\'') {
          decoded += '\'';
        }
        counter++;
      }
    }
    this.text = decoded;
  }

  public String getText() {
    return text;
  }

  @Override
  public void notify(Object object) {
    String objectString = (String) object;
    setText(objectString);
  }
}
