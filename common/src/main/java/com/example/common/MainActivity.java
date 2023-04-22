package com.example.common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public abstract class MainActivity extends AppCompatActivity {
private TextView timer;
private TextView questions;
private TextView question;
private AppCompatButton option1, option2,option3,option4, nextBtn;
private Timer quizTimer;
private int totalTimeInMins=0;
    private int second =0;
private ArrayList<QuestionList> arr = new ArrayList<>();
private int currentQuestionPosition=0;
private String selectedOptionByUser="";
    //protected abstract ArrayList <QuestionList> getData();
    protected abstract ArrayList<QuestionList> getData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findViews();
updateUI();

startTimer(timer);

questions.setText((currentQuestionPosition+1)+"/"+arr.size());
question.setText(arr.get(0).getQuestion());
option1.setText(arr.get(0).getOption1());
option2.setText(arr.get(0).getOption2());
option3.setText(arr.get(0).getOption3());
option4.setText(arr.get(0).getOption4());



option1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(selectedOptionByUser.isEmpty()){
            selectedOptionByUser = option1.getText().toString();
            option1.setBackgroundResource(R.drawable.round_back_red);
            option1.setTextColor(Color.WHITE);
            revealAnswer();
            arr.get(currentQuestionPosition).setUserSelected(selectedOptionByUser);
        }

    }
});
option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_back_red);
                    option2.setTextColor(Color.WHITE);
                    revealAnswer();
                    arr.get(currentQuestionPosition).setUserSelected(selectedOptionByUser);
                }
            }
        });
option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_back_red);
                    option3.setTextColor(Color.WHITE);
                    revealAnswer();
                    arr.get(currentQuestionPosition).setUserSelected(selectedOptionByUser);
                }
            }
        });
option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_back_red);
                    option4.setTextColor(Color.WHITE);
                    revealAnswer();
                    arr.get(currentQuestionPosition).setUserSelected(selectedOptionByUser);
                }
            }
        });
nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please select an option",Toast.LENGTH_SHORT).show();
                }
                else{
changeNextQuestion();
                }

            }
        });


//getCorrectAnswer();
    }

    private int getCorrectAnswer() {
        int correctAnswer=0;
        for(int i=0;i<arr.size();i++){
final String getUserSelectedAnswer= arr.get(i).getUserSelected();
final String getAnswer= arr.get(i).getAnswer();
if(getUserSelectedAnswer.equals(getAnswer)){
    correctAnswer++;
}
        }
        return correctAnswer;
    }
    private int getInCorrectAnswer() {
        int correctAnswer=0;
        for(int i=0;i<arr.size();i++){
            final String getUserSelectedAnswer= arr.get(i).getUserSelected();
            final String getAnswer= arr.get(i).getAnswer();
            if(!getUserSelectedAnswer.equals(getAnswer)){
                correctAnswer++;
            }
        }
        return correctAnswer;
    }

    private void startTimer(TextView timerTextView) {
        quizTimer = new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
            if(second==59){
                totalTimeInMins++;
                second=0;
            }
         /*   else if(second==0&&totalTimeInMins==0){//
                quizTimer.purge();
                quizTimer.cancel();
                Toast.makeText(MainActivity.this,"Time Over",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"correct " + String.valueOf(getCorrectAnswer()),Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,"Incorrect " + getInCorrectAnswer(),Toast.LENGTH_SHORT).show();


            }*/
            else{
                second++;
            }
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                     String finalMinutes = String.valueOf(totalTimeInMins);
                     String finalSeconds = String.valueOf(second);
                    if(finalMinutes.length()==1){
                        finalMinutes = "0"+finalMinutes;
                    }
                    if(finalSeconds.length()==1){
                        finalSeconds = "0"+finalSeconds;
                    }
                    timer.setText(finalMinutes+":"+finalSeconds);
                }
            });
            }
        }  ,1000,100);
    }

    private void updateUI() {
        arr = getData();

        //questions.setText((currentQuestionPosition+1)+"/"+arr.size());

        // timer.setText(getData());
    }

    private void findViews() {
        question = findViewById(R.id.question);
        questions = findViewById(R.id.questions);
        timer = findViewById(R.id.tv_timer);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        nextBtn = findViewById(R.id.btn_next);

    }

private void revealAnswer(){
        final String getAnswer= arr.get(currentQuestionPosition).getAnswer();
        if(option1.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_back_green);
            option1.setTextColor(Color.WHITE);
        }
        else if(option2.getText().toString().equals(getAnswer)){
            option2.setBackgroundResource(R.drawable.round_back_green);
            option2.setTextColor(Color.WHITE);
        }
        else if(option3.getText().toString().equals(getAnswer)){
            option3.setBackgroundResource(R.drawable.round_back_green);
            option3.setTextColor(Color.WHITE);
        }
        else{
            option4.setBackgroundResource(R.drawable.round_back_green);
            option4.setTextColor(Color.WHITE);
        }
}
private void changeNextQuestion(){
        currentQuestionPosition++;
        if(currentQuestionPosition+1==arr.size()){
            nextBtn.setText("Submit Quiz");

        }
        if(currentQuestionPosition<arr.size()){
            selectedOptionByUser="";
            option1.setBackgroundResource(R.drawable.round_back_for_option);
            option1.setTextColor(Color.BLACK);
            option2.setBackgroundResource(R.drawable.round_back_for_option);
            option2.setTextColor(Color.BLACK);
            option3.setBackgroundResource(R.drawable.round_back_for_option);
            option3.setTextColor(Color.BLACK);
            option4.setBackgroundResource(R.drawable.round_back_for_option);
            option4.setTextColor(Color.BLACK);
            questions.setText((currentQuestionPosition+1)+"/"+arr.size());
            question.setText(arr.get(currentQuestionPosition).getQuestion());
            option1.setText(arr.get(currentQuestionPosition).getOption1());
            option2.setText(arr.get(currentQuestionPosition).getOption2());
            option3.setText(arr.get(currentQuestionPosition).getOption3());
            option4.setText(arr.get(currentQuestionPosition).getOption4());


        }
        else {
            Intent intent = new Intent(MainActivity.this,QuizResult.class);
            intent.putExtra("correct",getCorrectAnswer());
            intent.putExtra("incorrect",getInCorrectAnswer());
            startActivity(intent);
        }
        //new intent result

}
}