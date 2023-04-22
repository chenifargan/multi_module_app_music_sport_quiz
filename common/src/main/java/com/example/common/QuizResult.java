package com.example.common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.TextView;

public class QuizResult extends AppCompatActivity {
private TextView correctAnswer, incorrestAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);
        findViews();
final int getCorrectAnswer = getIntent().getIntExtra("correct",0);
final int getIncorrectAnswer=  getIntent().getIntExtra("incorrect",0);
correctAnswer.setText("Correct answer: "+ String.valueOf(getCorrectAnswer));
incorrestAnswer.setText("Incorrect answer "+ String.valueOf(getIncorrectAnswer));

    }

    private void findViews() {

        correctAnswer = findViewById(R.id.correct_answer);
        incorrestAnswer =  findViewById(R.id.incorrect_answer);

    }
}