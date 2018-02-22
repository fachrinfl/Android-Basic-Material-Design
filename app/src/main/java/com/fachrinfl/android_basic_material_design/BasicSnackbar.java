package com.fachrinfl.android_basic_material_design;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BasicSnackbar extends AppCompatActivity {

    Button basicOne, basicTwo;
    Snackbar snackbarOne, snackbarTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_snackbar);

        View view = findViewById(R.id.mainLayout);

        snackbarOne = Snackbar.make(view, "Basic one snackbar material design", Snackbar.LENGTH_SHORT);
        basicOne = (Button) findViewById(R.id.basicOne);
        basicOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbarOne.show();
            }
        });

        snackbarTwo = Snackbar.make(view, "Basic two snackbar material design", Snackbar.LENGTH_INDEFINITE);
//        snackbarTwo.setDuration(2500);
        basicTwo = (Button) findViewById(R.id.basicTwo);
        basicTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbarTwo.show();
            }
        });

    }
}
