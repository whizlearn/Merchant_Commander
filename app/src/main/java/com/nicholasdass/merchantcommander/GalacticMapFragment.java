package com.nicholasdass.merchantcommander;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalacticMapFragment extends Fragment {

    // Field Variables**************************************************************

    private ImageView imgEarth;
    private ImageView imgMars;
    private ImageView imgNeptune;

    //******************************************************************************


    public GalacticMapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View viewRoot = inflater.inflate(R.layout.fragment_galactic_map, container, false);

        // Field Variable Initialization**********************************************************

        imgEarth = (ImageView) viewRoot.findViewById(R.id.imgEarth);
        imgMars = (ImageView) viewRoot.findViewById(R.id.imgMars);
        imgNeptune = (ImageView) viewRoot.findViewById(R.id.imgNeptune);

        //***************************************************************************************

        galacticMapClickEvent();

        return viewRoot;
    }

    // THis method handles all button click events for this fragment
    public void galacticMapClickEvent(){

        imgEarth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Earth", Toast.LENGTH_SHORT).show();
            }
        });

        imgMars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "Mars", Toast.LENGTH_SHORT).show();

            }
        });

        imgNeptune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "Neptune", Toast.LENGTH_SHORT).show();

            }
        });



    }

}
