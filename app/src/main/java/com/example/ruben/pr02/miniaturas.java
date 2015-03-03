package com.example.ruben.pr02;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class miniaturas extends Fragment implements View.OnClickListener {

    View parentView = null;

    public miniaturas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        parentView = inflater.inflate(R.layout.fragment_miniaturas, container, false);

        parentView.findViewById(R.id.imageButton1).setOnClickListener(this);


        return parentView;



    }


    @Override
    public void onClick(View v) {

    }
}
