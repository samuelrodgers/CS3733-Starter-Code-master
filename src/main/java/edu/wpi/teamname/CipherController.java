package edu.wpi.teamname;

import edu.wpi.teamname.entity.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/** Cipher application controller; don't modify this file (except for note below) */
public class CipherController implements Initializable {

  @FXML TextField textInputBox;

  @FXML TextArea caesarTextOut;

  @FXML TextArea elbonianTextOut;

  private Message cleartext;
  private CaesarCipher caesarCipher;
  private ElbonianCipher elbonianCipher;

  public CipherController() {
    cleartext = new Message();

    /*
     * You may add additional code here if it relates to your observer pattern implementation.
     */
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    caesarCipher = new CaesarCipher();
    caesarCipher.setText(caesarTextOut.getText());
    elbonianCipher = new ElbonianCipher();
    elbonianCipher.setText(elbonianTextOut.getText());

    cleartext.register(caesarCipher);
    cleartext.register(elbonianCipher);

    textInputBox
        .textProperty()
        .addListener(
            (observable, old, ne) -> {
              if (ne.isBlank()) {
                cleartext.setText("");
              } else {
                cleartext.setText(ne);
              }
            });
  }

  /**
   * Runs once every time the text in the input box changes. Your observer pattern implementation
   * should allow for the text contained inside the different cipher objects to change despite that
   * their setText() functions are never explicitly called here.
   */
  @FXML
  public void onTextUpdate() {
    cleartext.setText(textInputBox.getText());
  }

  /** Runs when the user clicks the 'Encode!' button */
  @FXML
  public void updateOutput() {
    caesarTextOut.setText(caesarCipher.getText());
    elbonianTextOut.setText(elbonianCipher.getText());
  }
}
