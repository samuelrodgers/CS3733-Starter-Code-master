package edu.wpi.teamname.entity;

/** Caesar cipher; you must implement the cipher and the observer pattern */
public class CaesarCipher implements Observer {

  String text = "";

  public void setText(String text) {
    String decoded = "";

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == 'a') {
        decoded += 'z';
      }
      if (text.charAt(i) == 'b') {
        decoded += 'y';
      }
      if (text.charAt(i) == 'c') {
        decoded += 'x';
      }
      if (text.charAt(i) == 'd') {
        decoded += 'w';
      }
      if (text.charAt(i) == 'e') {
        decoded += 'v';
      }
      if (text.charAt(i) == 'f') {
        decoded += 'u';
      }
      if (text.charAt(i) == 'g') {
        decoded += 't';
      }
      if (text.charAt(i) == 'h') {
        decoded += 's';
      }
      if (text.charAt(i) == 'i') {
        decoded += 'r';
      }
      if (text.charAt(i) == 'j') {
        decoded += 'q';
      }
      if (text.charAt(i) == 'k') {
        decoded += 'p';
      }
      if (text.charAt(i) == 'l') {
        decoded += 'o';
      }
      if (text.charAt(i) == 'm') {
        decoded += 'n';
      }
      if (text.charAt(i) == 'n') {
        decoded += 'm';
      }
      if (text.charAt(i) == 'o') {
        decoded += 'l';
      }
      if (text.charAt(i) == 'p') {
        decoded += 'k';
      }
      if (text.charAt(i) == 'q') {
        decoded += 'j';
      }
      if (text.charAt(i) == 'r') {
        decoded += 'i';
      }
      if (text.charAt(i) == 's') {
        decoded += 'h';
      }
      if (text.charAt(i) == 't') {
        decoded += 'g';
      }
      if (text.charAt(i) == 'u') {
        decoded += 'f';
      }
      if (text.charAt(i) == 'v') {
        decoded += 'e';
      }
      if (text.charAt(i) == 'w') {
        decoded += 'd';
      }
      if (text.charAt(i) == 'x') {
        decoded += 'c';
      }
      if (text.charAt(i) == 'y') {
        decoded += 'b';
      }
      if (text.charAt(i) == 'z') {
        decoded += 'a';
      }
      if (text.charAt(i) == 'A') {
        decoded += 'Z';
      }
      if (text.charAt(i) == 'B') {
        decoded += 'Y';
      }
      if (text.charAt(i) == 'C') {
        decoded += 'X';
      }
      if (text.charAt(i) == 'D') {
        decoded += 'W';
      }
      if (text.charAt(i) == 'E') {
        decoded += 'V';
      }
      if (text.charAt(i) == 'F') {
        decoded += 'U';
      }
      if (text.charAt(i) == 'G') {
        decoded += 'T';
      }
      if (text.charAt(i) == 'H') {
        decoded += 'S';
      }
      if (text.charAt(i) == 'I') {
        decoded += 'R';
      }
      if (text.charAt(i) == 'J') {
        decoded += 'Q';
      }
      if (text.charAt(i) == 'K') {
        decoded += 'P';
      }
      if (text.charAt(i) == 'L') {
        decoded += 'O';
      }
      if (text.charAt(i) == 'M') {
        decoded += 'N';
      }
      if (text.charAt(i) == 'N') {
        decoded += 'M';
      }
      if (text.charAt(i) == 'O') {
        decoded += 'L';
      }
      if (text.charAt(i) == 'P') {
        decoded += 'K';
      }
      if (text.charAt(i) == 'Q') {
        decoded += 'J';
      }
      if (text.charAt(i) == 'R') {
        decoded += 'I';
      }
      if (text.charAt(i) == 'S') {
        decoded += 'H';
      }
      if (text.charAt(i) == 'T') {
        decoded += 'G';
        // break;
      }
      if (text.charAt(i) == 'U') {
        decoded += 'F';
      }
      if (text.charAt(i) == 'V') {
        decoded += 'E';
      }
      if (text.charAt(i) == 'W') {
        decoded += 'D';
      }
      if (text.charAt(i) == 'X') {
        decoded += 'C';
      }
      if (text.charAt(i) == 'Y') {
        decoded += 'B';
        // break;
      }
      if (text.charAt(i) == 'Z') {
        decoded += 'A';
      }
      if (text.charAt(i) == ';') {
        decoded += ';';
      }
      if (text.charAt(i) == ':') {
        decoded += ':';
      }
      if (text.charAt(i) == ',') {
        decoded += ',';
      }
      if (text.charAt(i) == '.') {
        decoded += '.';
      }
      if (text.charAt(i) == ' ') {
        decoded += ' ';
      }
      if (text.charAt(i) == '?') {
        decoded += '?';
      }
      if (text.charAt(i) == '!') {
        decoded += '!';
      }
      if (text.charAt(i) == '\'') {
        decoded += '\'';
      }
    }

    if (decoded.length() > 140) {
      decoded = "";
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
