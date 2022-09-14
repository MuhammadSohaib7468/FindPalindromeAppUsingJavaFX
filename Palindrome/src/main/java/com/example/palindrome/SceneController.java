package com.example.palindrome;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SceneController {
    @FXML
    private Label txtResult;
    @FXML
    private TextField txtWord, txtReversedWord;

    // DECLARING VARIABLES
    @FXML
    private String Word;
    @FXML
    private String ReversedWord;
    @FXML
    private int Result;
    @FXML
    protected void btnFind()
    {
        // SETTING REVERSED WORD TEXT TO ZERO
        ReversedWord = "";

        // GETTING TEXT FROM INPUT OF USER
        Word = txtWord.getText();

        // USING FOR LOOP TO REVERSE TEXT
        for (int i = Word.length() - 1; i >= 0; i--)
        {
            ReversedWord = (ReversedWord + Word.charAt(i)).toUpperCase();
        }

        // DISPLAYING OUTPUT OF REVERSED WORD
        txtReversedWord.setText(ReversedWord);

        // COMPARING WORD WITH REVERSED WORD
        Result = Word.compareToIgnoreCase(ReversedWord);
        if (Result == 0)
        {
            txtResult.setText("Yes!!! " + Word  + " is Palindrome");
        }
        else if (Result != 0)
        {
            txtResult.setText("No!!! " + Word  + " is not Palindrome");
        }
    }
}