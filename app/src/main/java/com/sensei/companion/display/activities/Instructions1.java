package com.sensei.companion.display.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sensei.companion.R;

public class Instructions1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.instructions_pg1, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
