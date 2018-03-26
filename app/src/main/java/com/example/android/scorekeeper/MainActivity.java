package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    int scoreTeamGiants = 0;
    int scoreTeamAthletics = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamG(scoreTeamGiants);
        displayForTeamA(scoreTeamAthletics);
    }

    public void singleHitG(View view) {
        scoreTeamGiants = scoreTeamGiants + 1;
        displayForTeamG(scoreTeamGiants);
    }

    public void homeRunG(View view) {
        scoreTeamGiants = scoreTeamGiants + 4;
        displayForTeamG(scoreTeamGiants);
    }


    public void pitchingWinG(View view) {
        scoreTeamGiants = scoreTeamGiants + 3;
        displayForTeamG(scoreTeamGiants);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.giants_score);
        scoreView.setText(String.valueOf(score));
    }


    public void singleHitA(View view) {
        scoreTeamAthletics = scoreTeamAthletics + 1;
        displayForTeamA(scoreTeamAthletics);
    }

    public void homeRunA(View view) {
        scoreTeamAthletics = scoreTeamAthletics + 4;
        displayForTeamA(scoreTeamAthletics);
    }


    public void pitchingWinA(View view) {
        scoreTeamAthletics = scoreTeamAthletics + 3;
        displayForTeamA(scoreTeamAthletics);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.athletics_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreTeamGiants = 0;
        scoreTeamAthletics = 0;
        displayForTeamG(scoreTeamGiants);
        displayForTeamA(scoreTeamAthletics);
    }
}
