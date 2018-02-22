package com.fachrinfl.android_basic_material_design;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SnackbarWithCoordinatorLayout extends AppCompatActivity {

    FloatingActionButton btnEmail;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_with_coordinator_layout);

        btnEmail = (FloatingActionButton) findViewById(R.id.btnEmail);
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar = Snackbar.make(v, "Message sent.", Snackbar.LENGTH_INDEFINITE);
                snackbar.setDuration(5000);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });

                View view = snackbar.getView();
                view.setBackgroundColor(getResources().getColor(R.color.colorSnackbarBackground));

                TextView textMessage = (TextView) view.findViewById(android.support.design.R.id.snackbar_text);
                textMessage.setTextColor(getResources().getColor(R.color.colorSnackbarText));

                TextView textAction = (TextView) view.findViewById(android.support.design.R.id.snackbar_action);
                textAction.setTextColor(getResources().getColor(R.color.colorSnackbarAction));

                snackbar.show();
            }
        });

    }
}
