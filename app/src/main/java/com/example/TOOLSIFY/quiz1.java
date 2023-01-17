package com.example.TOOLSIFY;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;

public class quiz1 extends AppCompatActivity {
    ProgressBar progressBar;
    CountDownTimer countDownTimer;
    int timervalue=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        progressBar = findViewById(R.id.progressBar);

        countDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timervalue = timervalue-1;
                progressBar.setProgress(timervalue);
            }

            @Override
            public void onFinish() {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(quiz1.this);
                alertDialog.setView(R.layout.timeout_dialog);
                alertDialog.show();
            }
        }.start();
    }
}