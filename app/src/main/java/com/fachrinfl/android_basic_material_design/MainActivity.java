package com.fachrinfl.android_basic_material_design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mdDialogBasic,mdDialogConfirmation, mdDialogProgressCircular, mdDialogProgressLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdDialogBasic = (Button) findViewById(R.id.mdDialogBasic);
        mdDialogBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), DialogBasic.class);
                startActivity(intent);
            }
        });

        mdDialogConfirmation = (Button) findViewById(R.id.mdDialogConfirmation);
        mdDialogConfirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), DialogConfirmation.class);
                startActivity(intent);
            }
        });

        mdDialogProgressCircular = (Button) findViewById(R.id.mdDialogProgressCircular);
        mdDialogProgressCircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CircularProgressDialogs.class);
                startActivity(intent);
            }
        });

        mdDialogProgressLinear = (Button) findViewById(R.id.mdDialogProgressLinear);
        mdDialogProgressLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), LinearProgressDialog.class);
                startActivity(intent);
            }
        });

    }
}
