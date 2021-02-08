package com.example.quizzler;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;


public class MainActivity extends Activity {

    // TODO: Declare constants here
    final int progressBarIncrement = 8;

    ProgressBar progressBar;
    int score = 0;
    TextView scoreHolder;
    int index = 0;
    TextView question;
    Button trueBtn;
     Button falseBtn;
     private final TrueFalse[] mQuestionBank = new TrueFalse[] {
            new TrueFalse(R.string.question_1, false),
            new TrueFalse(R.string.question_2, true),
            new TrueFalse(R.string.question_3, true),
            new TrueFalse(R.string.question_4, true),
            new TrueFalse(R.string.question_5, true),
            new TrueFalse(R.string.question_6, false),
            new TrueFalse(R.string.question_7, true),
            new TrueFalse(R.string.question_8, false),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, false),
            new TrueFalse(R.string.question_12, false),
            new TrueFalse(R.string.question_13,true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueBtn = (Button) findViewById(R.id.true_button);
        falseBtn = (Button) findViewById(R.id.false_button);
        question = (TextView) findViewById(R.id.question_text_view);
        scoreHolder = (TextView) findViewById(R.id.score);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);


        question.setText(mQuestionBank[index].getQuestionId());
        scoreHolder.setText("Score " + score + "/" +mQuestionBank.length);
        Log.d("question score",scoreHolder.getText().toString());

        trueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
            }
        });

        falseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
            }
        });
    }

    public void updateQuestion(){
            index = (index + 1) % mQuestionBank.length;

            if(index == 0){
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Game Over!");
                alert.setCancelable(false);
                alert.setMessage("You Scored " + score + " Points");
                alert.setPositiveButton("Close Application",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int which){
                        finish();
                    }
                });
                alert.show();
            }
            question.setText(mQuestionBank[index].getQuestionId());
            scoreHolder.setText("Score " + score + "/" + mQuestionBank.length);
            progressBar.incrementProgressBy(progressBarIncrement);
    }

    public void checkAnswer(boolean userSelection){
        if(userSelection == mQuestionBank[index].getAnswer()){
            Toast.makeText(getApplicationContext(),R.string.correct_toast,Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(getApplicationContext(),R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
        }
        updateQuestion();

    }
}