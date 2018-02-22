package com.fachrinfl.android_basic_material_design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Toolbar");
        toolbar.setSubtitle("with android material design");
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.add_post:
                Toast.makeText(getApplicationContext(), R.string.add_post, Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(getApplicationContext(), R.string.settings, Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(getApplicationContext(), R.string.logout, Toast.LENGTH_SHORT).show();
                break;
            case R.id.icn_account:
                Toast.makeText(getApplicationContext(), R.string.icnaccount, Toast.LENGTH_SHORT).show();
                break;
            case R.id.icn_search:
                Toast.makeText(getApplicationContext(), R.string.icnsearch, Toast.LENGTH_SHORT).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}