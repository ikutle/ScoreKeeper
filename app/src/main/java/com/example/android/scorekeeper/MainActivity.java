package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int awayScore = 0;
    int homeYellowCard = 0;
    int homeRedCard = 0;
    int awayYellowCard = 0;
    int awayRedCard = 0;
    int homeFoul = 0;
    int awayFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when Home Team GOOOAL!!! button is clicked.
     */
    public void homeTeamGoal(View view) {
        homeScore = homeScore + 1;
        homeScore(homeScore);
    }

    /**
     * This method is called when Away Team GOOOAL!!! button is clicked.
     */
    public void awayTeamGoal(View view) {
        awayScore = awayScore + 1;
        awayScore(awayScore);
    }


    /**
     * Displays the given score for Home Team.
     */
    public void homeScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Away Team.
     */
    public void awayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when Home Yellow Card button is clicked.
     */
    public void homeYellowCard(View view) {
        homeYellowCard = homeYellowCard + 1;
        homeYellowCard(homeYellowCard);
    }

    /**
     * Displays the given count of Home team Yellow Card.
     */
    public void homeYellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeYellowCard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when Home Red Card button is clicked.
     */
    public void homeRedCard(View view) {
        homeRedCard = homeRedCard + 1;
        homeRedCard(homeRedCard);
    }

    /**
     * Displays the given count of Home team Red Card.
     */
    public void homeRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeRedCard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when Away Yellow Card button is clicked.
     */
    public void awayYellowCard(View view) {
        awayYellowCard = awayYellowCard + 1;
        awayYellowCard(awayYellowCard);
    }

    /**
     * Displays the given count of Away team Yellow Card.
     */
    public void awayYellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayYellowCard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when Away Red Card button is clicked.
     */
    public void awayRedCard(View view) {
        awayRedCard = awayRedCard + 1;
        awayRedCard(awayRedCard);
    }

    /**
     * Displays the given count of Away team Red Card.
     */
    public void awayRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayRedCard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when Home team Foul button is clicked.
     */
    public void homeFoul(View view) {
        homeFoul = homeFoul + 1;
        homeFoul(homeFoul);
    }

    /**
     * Displays the given count of Home team Foul.
     */
    public void homeFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeFoul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when Away Foul button is clicked.
     */
    public void awayFoul(View view) {
        awayFoul = awayFoul + 1;
        awayFoul(awayFoul);
    }

    /**
     * Displays the given count of Away team Foul.
     */
    public void awayFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayFoul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets all the values and displays them.
     */
    public void reset(View view) {
        homeScore = 0;
        awayScore = 0;
        homeYellowCard = 0;
        homeRedCard = 0;
        awayYellowCard = 0;
        awayRedCard = 0;
        homeFoul = 0;
        awayFoul = 0;
        homeScore(homeScore);
        awayScore(awayScore);
        homeYellowCard(homeYellowCard);
        homeRedCard(homeRedCard);
        awayYellowCard(awayYellowCard);
        awayRedCard(awayRedCard);
        homeFoul(homeFoul);
        awayFoul(awayFoul);
    }
}
