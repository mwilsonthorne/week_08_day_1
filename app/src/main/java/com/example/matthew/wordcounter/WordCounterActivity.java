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
        this.sentenceEditText = findViewById(R.id.sentence_text);
        this.counterButton = findViewById(R.id.button_counter);
        this.answerText = findViewById(R.id.answer_count);
    }

    public void onCounterButtonClicked(View button) {
//        String sentence = sentenceEditText.getText().toString();
        int countWords = WordCounter.countWords(sentenceEditText.getText().toString());
        String countWordString = String.valueOf(countWords);
        answerText.setText(countWordString); //if you just want the number
//        answerText.setText(countWords + " words"); //if you want to add int + string

//        Log.d(getClass().toString(), "onCounterButtonClicked was called");
//        Log.d(getClass().toString(), "The sentence constructed was '" + sentence + "'");
    }




}
