package com.example.android.practiceset2;

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

    private void displayA(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        quantityTextView.setText("" + number);
    }

    public void add3A(View view) {
        scoreA+=3;
        displayA(scoreA);
    }

    public void add2A(View view) {
        scoreA+=2;
        displayA(scoreA);
    }

    public void add1A(View view) {
        scoreA+=1;
        displayA(scoreA);
    }

    public void add3B(View view) {
        scoreB+=3;
        displayB(scoreB);
    }

    public void add2B(View view) {
        scoreB+=2;
        displayB(scoreB);
    }

    public void add1B(View view) {
        scoreB+=1;
        displayB(scoreB);
    }

    public void reset(View view) {
        displayA(0);
        displayB(0);
        scoreA=0;
        scoreB=0;
    }
}
