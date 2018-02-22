package com.fachrinfl.android_basic_material_design;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ProgressBar progressBar_circle, progressBar_linear;
    Handler handler;
    Runnable runnable;
    Timer timer;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Progress Bar");
        setSupportActionBar(toolbar);

        progressBar_circle = (ProgressBar) findViewById(R.id.progressBar_circle);
        progressBar_circle.setVisibility(View.VISIBLE);

        progressBar_linear = (ProgressBar) findViewById(R.id.progressBar_linear);
        progressBar_linear.setVisibility(View.VISIBLE);
        progressBar_linear.setProgress(0);
        progressBar_linear.setSecondaryProgress(0);
        progressBar_linear.setMax(100);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {

                if (++i <= 100){
                    progressBar_linear.setProgress(i);
                    progressBar_linear.setSecondaryProgress(i+10);
                    progressBar_circle.setVisibility(View.GONE);
                } else {
                    timer.cancel();
                }
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, 8000, 500);

    }
}
