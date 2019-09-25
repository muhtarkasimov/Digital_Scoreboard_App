
package com.example.digitalscoreboardapp;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digitalscoreboardapp.R;

public class MainActivity extends AppCompatActivity {
    int scoreTemA = 0;
    int scoreTemB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("teamA", scoreTemA);
        outState.putInt("teamB", scoreTemB);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTemA = savedInstanceState.getInt("teamA");
        scoreTemB = savedInstanceState.getInt("teamB");
        displayForTeamA(scoreTemA);
        displayForTeamB(scoreTemB);
    }

    /*
     * Team A Code Started
     * */
    public void teamAOneScore(View view) {
        scoreTemA = scoreTemA + 1;
        displayForTeamA(scoreTemA);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }
    /*
     * Team A Code finish
     * */

    /*
     * Team B Code Started
     * */
    public void teamBOneScore(View view) {
        scoreTemB = scoreTemB + 1;
        displayForTeamB(scoreTemB);
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * Team B Code finish
     * */

    //Reset button code
    public void resetButton(View view) {
        scoreTemA = 0;
        scoreTemB = 0;
        displayForTeamA(0);
        displayForTeamB(0);

    }
}
