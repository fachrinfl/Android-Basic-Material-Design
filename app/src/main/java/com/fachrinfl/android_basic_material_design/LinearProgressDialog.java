package com.fachrinfl.android_basic_material_design;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class LinearProgressDialog extends AppCompatActivity {

    Button btnDialogs_id;
    ProgressDialog progressDialog;
    Handler handler;
    Runnable runnable;
    Timer timer;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_progress_dialog);

        progressDialog = new ProgressDialog(LinearProgressDialog.this, R.style.LinearDialogsTheme);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setIndeterminate(false);

        progressDialog.setTitle("Linear Progress Dialog");
        progressDialog.setMessage("Please wait...");
        progressDialog.setProgress(0);
        progressDialog.setMax(100);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {

                i = i + 5;
                if (i <= 100){
                    progressDialog.setProgress(i);
                    progressDialog.setSecondaryProgress(i + 5);
                } else {
                    timer.cancel();
                    progressDialog.cancel();
                    i = 0;
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

        btnDialogs_id = (Button) findViewById(R.id.btnDialogs_id);
        btnDialogs_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.show();
            }
        });

    }
}
