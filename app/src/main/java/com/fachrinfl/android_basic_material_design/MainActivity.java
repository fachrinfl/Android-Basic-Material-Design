package com.fachrinfl.android_basic_material_design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;

    String [] name = {
            "Fachri Naufal",
            "Jhon Doe",
            "Steven Hadson",
            "Robert Alex"
    };

    String [] email = {
            "fachrinaufal@example.com",
            "jhondoe@example.com",
            "stevenhadson@example.com",
            "robertalex@example.com"
    };

    int [] image = {
            R.drawable.profile,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Recyclerview");
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);

        List<User> sampleuser = new ArrayList<>();
        for (int i=0; i<name.length; i++){
            User user = new User();
            user.username = name[i];
            user.useremail = email[i];
            user.userimage = image[i];

            sampleuser.add(user);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        /*GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);*/

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new ReacyclerAdapter(getBaseContext(), sampleuser));

    }
}
