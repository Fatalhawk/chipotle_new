package com.sensei.companion.display.program_managers;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sensei.companion.R;
import com.sensei.companion.connection.ConnectManager;

public class GenericProgramManager extends TouchBarFragment {

    private int testCounter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_generic_program_manager, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (super.mListener != null) {
            super.mListener.onFragmentInteraction(uri);
        }
    }

    public void testSendMessage (View v) {
        testCounter ++;
        ConnectManager.sendMessageToPC("YOOOOO<EC> #" + testCounter);
    }
}
