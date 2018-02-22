package com.fachrinfl.android_basic_material_design;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;
    TextView textView_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation_id);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        textView_id = (TextView) findViewById(R.id.textView_id);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){

            case R.id.recents_id:
                textView_id.setText("Recents");
                return true;

            case R.id.favorites_id:
                textView_id.setText("Favorite");
                return true;

            case R.id.nearby_id:
                textView_id.setText("Near by");
                return true;
        }

        return false;
    }
}
