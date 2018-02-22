package com.fachrinfl.android_basic_material_design;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DialogConfirmation extends AppCompatActivity {

    Button btnDialogs_id;
    AlertDialog dialog;
    AlertDialog.Builder builder;
    String[] itemCategories = {"Comedy", "Drama", "Horor", "Romance"};
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_confirmation);

        builder = new AlertDialog.Builder(DialogConfirmation.this, R.style.ConfirmationDialogsTheme);
        builder.setTitle("Select the category");

        builder.setSingleChoiceItems(itemCategories, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                result = itemCategories[which];
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DialogConfirmation.this, result, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        btnDialogs_id = (Button) findViewById(R.id.btnDialogs_id);
        btnDialogs_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });

        dialog = builder.create();


    }
}
