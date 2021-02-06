package com.example.quizzler;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;


public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here:
     Button trueBtn;
     Button falseBtn;


    // TODO: Uncomment to create question bank
//    private TrueFalse[] mQuestionBank = new TrueFalse[] {
//            new TrueFalse(R.string.question_1, true),
//            new TrueFalse(R.string.question_2, true),
//            new TrueFalse(R.string.question_3, true),
//            new TrueFalse(R.string.question_4, true),
//            new TrueFalse(R.string.question_5, true),
//            new TrueFalse(R.string.question_6, false),
//            new TrueFalse(R.string.question_7, true),
//            new TrueFalse(R.string.question_8, false),
//            new TrueFalse(R.string.question_9, true),
//            new TrueFalse(R.string.question_10, true),
//            new TrueFalse(R.string.question_11, false),
//            new TrueFalse(R.string.question_12, false),
//            new TrueFalse(R.string.question_13,true)
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueBtn = (Button) findViewById(R.id.true_button);
        falseBtn = (Button) findViewById(R.id.false_button);

        trueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("true listener","its true");
            }
        });

        falseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("false listener","its false");
            }
        });

    }
}