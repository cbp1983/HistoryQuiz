package com.example.android.historyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Use this function to calculate the score upon clicking the button at the bottom of the app.
     */

    public void calculateScore(View view) {

        /**
         * int score will keep track of the user's score.  String results will concatenate lines of text to give the correct answers to incorrectly answered questions.
         */

        int score = 0;
        String results = "";

        /**
         * defining checkboxes q1a, q1b, q1c, q1d, q1e to gather check states, corresponding to answers A through E.  Checked states are checked1a through checked1e.
         */

        CheckBox q1a = (CheckBox) findViewById(R.id.q1a);
        boolean checked1a = q1a.isChecked();

        CheckBox q1b = (CheckBox) findViewById(R.id.q1b);
        boolean checked1b = q1b.isChecked();

        CheckBox q1c = (CheckBox) findViewById(R.id.q1c);
        boolean checked1c = q1c.isChecked();

        CheckBox q1d = (CheckBox) findViewById(R.id.q1d);
        boolean checked1d = q1d.isChecked();

        CheckBox q1e = (CheckBox) findViewById(R.id.q1e);
        boolean checked1e = q1e.isChecked();

        /**
         * Determine if the answer is correct. Note: B & D are the right answers
         */
        if (!checked1a && checked1b && !checked1c && checked1d && !checked1e){
            score = score + 1;
        }
        else results += getString(R.string.q1Answer) + "\n";

        /**
         * defining checkboxes q2a, q2b, q2c, q2d to gather check states, corresponding to answers A through D.  Checked states are checked2a through checked2d.
         */

        CheckBox q2a = (CheckBox) findViewById(R.id.q2a);
        boolean checked2a = q2a.isChecked();

        CheckBox q2b = (CheckBox) findViewById(R.id.q2b);
        boolean checked2b = q2b.isChecked();

        CheckBox q2c = (CheckBox) findViewById(R.id.q2c);
        boolean checked2c = q2c.isChecked();

        CheckBox q2d = (CheckBox) findViewById(R.id.q2d);
        boolean checked2d = q2d.isChecked();

        /**
         * Determine if the answer is correct. Note: A & B are the right answers
         */
        if (checked2a && checked2b && !checked2c && !checked2d){
            score = score + 1;
        }
        else results += getString(R.string.q2Answer) + "\n";

        /**
         * defining radio buttons q3a, q3b, q3c, q3d, q3e to gather check states, corresponding to answers A through E.  Checked states are checked3a through checked3e.  Only q3e is needed.
         */

        RadioButton q3e = (RadioButton) findViewById(R.id.q3e);
        boolean checked3e = q3e.isChecked();

        /**
         * Determine if the answer is correct. Note: E is the right answer.
         */
        if (checked3e){
            score = score + 1;
        }
        else results += getString(R.string.q3Answer) + "\n";


        /**
         * defining radio buttons q4a, q4b, q4c, q4d, q4e to gather check states, corresponding to answers A through E.  Checked states are checked4a through checked4e.  Only q4d is needed.
         */

        RadioButton q4d = (RadioButton) findViewById(R.id.q4d);
        boolean checked4d = q4d.isChecked();

        /**
         * Dtermine if the answer is correct. Note: D is the right answer.
         */
        if (checked4d){
            score = score + 1;
        }
        else results += getString(R.string.q4Answer) + "\n";


        /**
         * defining checkboxes q5a, q5b, q5c, q5d, q5e to gather check states, corresponding to answers A through E.  Checked states are checked5a through checked5e.  Only q5d is needed.
         */

        RadioButton q5d = (RadioButton) findViewById(R.id.q5d);
        boolean checked5d = q5d.isChecked();

        /**
         * Determine if the answer is correct. Note: D is the right answer.
         */

        if (checked5d){
            score = score + 1;
        }
        else results += getString(R.string.q5Answer) + "\n";


        /**
         * defining radio buttons q6a, q6b, q6c, q6d, q6e to gather check states, corresponding to answers A through E.  Checked states are checked6a through checked6e. Only q6s is needed.
         */

        RadioButton q6a = (RadioButton) findViewById(R.id.q6a);
        boolean checked6a = q6a.isChecked();


        /**
         * Determine if the answer is correct. Note: A is the right answer.
         */
        if (checked6a){
            score = score + 1;
        }
        else results += getString(R.string.q6Answer) + "\n";


        /**
         * defining checkboxes q7a, q7b, q7c, q7d to gather check states, corresponding to answers A through D.  Checked states are checked7a through checked7d.
         */

        CheckBox q7a = (CheckBox) findViewById(R.id.q7a);
        boolean checked7a = q7a.isChecked();

        CheckBox q7b = (CheckBox) findViewById(R.id.q7b);
        boolean checked7b = q7b.isChecked();

        CheckBox q7c = (CheckBox) findViewById(R.id.q7c);
        boolean checked7c = q7c.isChecked();

        CheckBox q7d = (CheckBox) findViewById(R.id.q7d);
        boolean checked7d = q7d.isChecked();

        CheckBox q7e = (CheckBox) findViewById(R.id.q7e);
        boolean checked7e = q7e.isChecked();

        /**
         * Determine if the answer is correct. Note: B, C, and E are the right answers
         */
        if (!checked7a && checked7b && checked7c && !checked7d && checked7e){
            score = score + 1;
        }
        else results += getString(R.string.q7Answer) + "\n";


        /**
         * Text field for question 8.
         */

        EditText answerGetText = (EditText) findViewById(R.id.q8field);
        String userAnswer8 = answerGetText.getText().toString();

        /**
         * Determine if the answer is correct. Correct answer is 1628.
         */
        if (userAnswer8.equals("1628")){
            score = score + 1;
        }
        else results += getString(R.string.q8Answer) + "\n";

        /**
         * defined checkboxes q9a, q9b, q9c, q9d, q9e to gather check states, corresponding to answers A through E.  Checked states are checked9a through checked9e. Only q9c needed.
         */

        RadioButton q9c = (RadioButton) findViewById(R.id.q9c);
        boolean checked9c = q9c.isChecked();

        /**
         * Determine if the answer is correct. Note: C is the right answer.
         */
        if (checked9c){
            score = score + 1;
        }
        else results += getString(R.string.q9Answer) + "\n";


        /**
         * defined checkboxes q10a, q10b, q10c, q10d, q10e to gather check states, corresponding to answers A through E.  Checked states are checked10a through checked10e. Only q10c needed.
         */

        RadioButton q10b = (RadioButton) findViewById(R.id.q10b);
        boolean checked10b = q10b.isChecked();

        /**
         * Determine if the answer is correct. Note: B is the right answer.
         */
        if (checked10b){
            score = score + 1;
        }
        else results += getString(R.string.q10Answer) + "\n";


        /**
         * Display score
         */
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText("" + score + "/10");

        /**
         * Display correct answers to incorrectly answered questions
         */
        TextView resultsTextView = (TextView) findViewById(R.id.results_text_view);
        resultsTextView.setText("" + results);

        /**
         * Displays toast message
         */

        if (score >= 9) {
            Toast.makeText(this, getString(R.string.toast1) + " " + score + " " + getString(R.string.toast2) + " " + getString(R.string.awesome), Toast.LENGTH_LONG).show();
            return;
        }
        if (score >= 5) {
            Toast.makeText(this, getString(R.string.toast1) + " " + score + " " + getString(R.string.toast2) + " " + getString(R.string.good), Toast.LENGTH_LONG).show();
            return;
        }
        else Toast.makeText(this, getString(R.string.toast1) + " " + score + " " + getString(R.string.toast2) + " " + getString(R.string.low), Toast.LENGTH_LONG).show();
    }


}

