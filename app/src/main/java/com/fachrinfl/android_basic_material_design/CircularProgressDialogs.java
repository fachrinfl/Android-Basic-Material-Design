package com.fachrinfl.android_basic_material_design;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CircularProgressDialogs extends AppCompatActivity {

    Button btnDialogs_id;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circular_progress_dialogs);

        progressDialog = new ProgressDialog(CircularProgressDialogs.this, R.style.CircularDialogsTheme);
        progressDialog.setTitle("Circular Progress Dialog");
        progressDialog.setMessage("Please wait...");

        btnDialogs_id = (Button) findViewById(R.id.btnDialogs_id);
        btnDialogs_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.show();
            }
        });

    }
}
