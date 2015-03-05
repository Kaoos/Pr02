package com.example.ruben.pr02;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class miniaturas extends Fragment implements View.OnClickListener {
    public String  idImg;
    View parentView = null;
    ReciveDatosFrag  Callback;
    public miniaturas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        parentView = inflater.inflate(R.layout.fragment_miniaturas, container, false);

        parentView.findViewById(R.id.imageButton1).setOnClickListener(this);
        parentView.findViewById(R.id.imageButton2).setOnClickListener(this);
        parentView.findViewById(R.id.imageButton3).setOnClickListener(this);

        return parentView;



    }

    @Override
    public void onClick(View v) {





            Callback.cambiaIMG(v.getId());

    }




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Callback = (ReciveDatosFrag) activity;
   }


}
