package com.fachrinfl.android_basic_material_design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mdBasicSnackbar, mdSnackbarWithCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdBasicSnackbar = (Button) findViewById(R.id.mdBasicSnackbar);
        mdBasicSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), BasicSnackbar.class);
                startActivity(intent);
            }
        });

        mdSnackbarWithCoordinatorLayout = (Button) findViewById(R.id.mdSnackbarWithCoordinatorLayout);
        mdSnackbarWithCoordinatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SnackbarWithCoordinatorLayout.class);
                startActivity(intent);
            }
        });

    }
}
