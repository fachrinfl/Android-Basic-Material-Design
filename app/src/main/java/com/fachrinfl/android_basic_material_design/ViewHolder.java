package com.fachrinfl.android_basic_material_design;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by fachrinfl on 19/02/18.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView name;
    public TextView email;
    public LinearLayout linearLayout;

    public ViewHolder(View itemView) {
        super(itemView);

        image = (ImageView) itemView.findViewById(R.id.imageView_id);
        name = (TextView) itemView.findViewById(R.id.name_id);
        email = (TextView) itemView.findViewById(R.id.email_id);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.rv_item);
    }
}
