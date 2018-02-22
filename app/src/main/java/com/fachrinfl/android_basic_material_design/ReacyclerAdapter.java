package com.fachrinfl.android_basic_material_design;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by fachrinfl on 19/02/18.
 */

public class ReacyclerAdapter extends RecyclerView.Adapter<ViewHolder>{

    private List<User> users;
    private Context context;

    public ReacyclerAdapter(Context context, List<User> users) {
        this.users = users;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final User sampleuser = users.get(position);
        holder.name.setText(sampleuser.username);
        holder.email.setText(sampleuser.useremail);
//        holder.image.setImageResource(sampleuser.userimage);
        Glide.with(context).load(sampleuser.userimage).into(holder.image);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hello " + sampleuser.username, Toast.LENGTH_SHORT).show();
                Snackbar.make(v, "Your email is " + sampleuser.useremail, Snackbar.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

}
