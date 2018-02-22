package com.fachrinfl.android_basic_material_design;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fachrinfl on 17/02/18.
 */

public class Three_Fragment extends Fragment {

    View view;

    public Three_Fragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item_three, container, false);
        return view;
    }


}
