//
//
//
// Brett Napier
//Fragment Quiz App (Assignment 4)
//EKU--CSC309
// 3-22-16
//
//

package com.brettnapier.quiz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Boolean answer = null;
    Integer score = 0;
    Integer numQuestions = 0;
    TextView scoreView;
    Boolean q1Answered = Boolean.FALSE;
    Button fl;
    Button tr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView question = (TextView) findViewById(R.id.textView_question);
        scoreView = (TextView) findViewById(R.id.textView_score);

        //setup question 1 view and onclick listener
        View q1 = (View) findViewById(R.id.textView_q1);
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtons(); //show buttons to answer with
                question.setText("Red is a primary color.");
                answer = Boolean.TRUE;
                if (q1Answered == Boolean.TRUE) {
                    hideButtons(); //hide buttons if answered
                }

            }
        });

        View q2 = (View) findViewById(R.id.textView_q2);
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtons(); //show buttons to answer with
                question.setText("32 fahrenheit is waters freezing point.");
                answer = Boolean.TRUE;
            }
        });

        View q3 = (View) findViewById(R.id.textView_q3);
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtons(); //show buttons to answer with
                question.setText("There are 2 continents.");
                answer = Boolean.FALSE;
            }
        });

        tr = (Button) findViewById(R.id.btn_true);
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer != null) {

                    if (answer == Boolean.TRUE) {
                        score++;
                    }
                    numQuestions++;
                    updateScore();
                }
            }
        });

        fl = (Button) findViewById(R.id.btn_false);
        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer != null) {
                    if (answer == Boolean.FALSE) {
                        score++;
                    }
                    numQuestions++;
                    updateScore();
                }
            }
        });
        hideButtons();

    }

    public void updateScore() {
        scoreView.setText("Score: " + score + "/" + numQuestions);
    }

    public void hideButtons() {
        tr.setVisibility(View.INVISIBLE);
        fl.setVisibility(View.INVISIBLE);
    }

    public void showButtons() {
        tr.setVisibility(View.VISIBLE);
        fl.setVisibility(View.VISIBLE);

    }
}
