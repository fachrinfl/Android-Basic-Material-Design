package com.fachrinfl.android_basic_material_design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    SwitchCompat switchCompat;
    AppCompatCheckBox appCompatCheckBox;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Selections Controls");
        setSupportActionBar(toolbar);

        // Switch Compat
        switchCompat = (SwitchCompat) findViewById(R.id.switch_id);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(), "On comment for this article", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Off comment for this article", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Check Box
        appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.checkbox_id);
        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(), "Check Box is Enable", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Check Box is Disable", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Radio Button
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.man_id:
                        Toast.makeText(MainActivity.this, "You are man", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.women_id:
                        Toast.makeText(MainActivity.this, "You are women", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });

    }
}
