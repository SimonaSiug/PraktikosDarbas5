package com.example.praktikosdarbas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextInput;
    private TextView textViewWordCount;
    private TextView textViewCharCount;
    private Button buttonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = findViewById(R.id.editTextInput);
        buttonCount = findViewById(R.id.buttonCount);
        textViewWordCount = findViewById(R.id.textViewWordCount);
        textViewCharCount = findViewById(R.id.textViewCharCount);

        buttonCount.setOnClickListener(v -> {
            String inputString = editTextInput.getText().toString();

            int wordCount = Utils.countWords(inputString);
            int charCount = Utils.countCharacters(inputString);

            textViewWordCount.setText("Word count: " + wordCount);
            textViewCharCount.setText("Character count: " + charCount);
        });
    }
}
