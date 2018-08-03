package com.anthonypanisales.bjjscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void twoPointsForA(View v) {
        scoreA += 2;
        displayScoreA(scoreA);
    }

    public void twoPointsForB(View v) {
        scoreB += 2;
        displayScoreB(scoreB);
    }

    public void threePointsForA(View v) {
        scoreA += 3;
        displayScoreA(scoreA);
    }

    public void threePointsForB(View v) {
        scoreB += 3;
        displayScoreB(scoreB);
    }

    public void fourPointsForA(View v) {
        scoreA += 4;
        displayScoreA(scoreA);
    }

    public void fourPointsForB(View v) {
        scoreB += 4;
        displayScoreB(scoreB);
    }

    public void displayScoreA(int score) {
        TextView scoreText = findViewById(R.id.scoreA);
        scoreText.setText(String.valueOf(score));
    }

    public void displayScoreB(int score) {
        TextView scoreText = findViewById(R.id.scoreB);
        scoreText.setText(String.valueOf(score));
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }
}
