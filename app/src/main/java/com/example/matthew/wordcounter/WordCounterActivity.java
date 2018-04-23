package com.example.matthew.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {


    EditText sentenceEditText;
    Button counterButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        sentenceEditText = findViewById(R.id.sentence_text);
        counterButton = findViewById(R.id.button_counter);
        answerText = findViewById(R.id.answer_count);
    }

    public void onCounterButtonClicked(View button) {
//        String sentence = sentenceEditText.getText().toString();
        int countWords = WordCounter.countWords(sentenceEditText.getText().toString());
        answerText.setText(countWords + " words");

//        Log.d(getClass().toString(), "onCounterButtonClicked was called");
//        Log.d(getClass().toString(), "The sentence constructed was '" + sentence + "'");
    }




}
