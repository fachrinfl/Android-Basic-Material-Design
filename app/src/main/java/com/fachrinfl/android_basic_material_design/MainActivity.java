package com.fachrinfl.android_basic_material_design;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TextInputLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    LinearLayout llInput;
    AppCompatEditText edtUsername, edtPassword;
    TextInputLayout tilUsername, tilPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Text Field");

        llInput = (LinearLayout) findViewById(R.id.llInput);
        llInput.setOnClickListener(null);

        edtUsername = (AppCompatEditText) findViewById(R.id.edtUsername);
        edtUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edtUsername.getText().toString().isEmpty()){
                    tilUsername.setErrorEnabled(true);
                    tilUsername.setError("Username tidak boleh kosong");
                } else {
                    tilUsername.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edtPassword = (AppCompatEditText) findViewById(R.id.edtPassword);
        edtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edtPassword.getText().toString().isEmpty()){
                    tilPassword.setErrorEnabled(true);
                    tilPassword.setError("Password tidak boleh kosong");
                } else {
                    tilPassword.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        tilUsername = (TextInputLayout) findViewById(R.id.tilUsername);
        tilUsername.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (edtUsername.getText().toString().isEmpty()){
                    tilUsername.setErrorEnabled(true);
                    tilUsername.setError("Username tidak boleh kosong");
                } else {
                    tilUsername.setErrorEnabled(false);
                }

            }
        });

        tilPassword = (TextInputLayout) findViewById(R.id.tilPassword);
        tilPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (edtPassword.getText().toString().isEmpty()){
                    tilPassword.setErrorEnabled(true);
                    tilPassword.setError("Password tidak boleh kosong");
                } else {
                    tilPassword.setErrorEnabled(false);
                }

            }
        });


    }
}
