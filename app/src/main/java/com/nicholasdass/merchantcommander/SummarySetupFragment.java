package com.nicholasdass.merchantcommander;

/**
 * Created by Nicholas Dass on 11/21/16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class SummarySetupFragment extends Fragment {

    private Button btnConfirm;



    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "3";

    public SummarySetupFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SummarySetupFragment newInstance(int sectionNumber) {
        SummarySetupFragment fragment = new SummarySetupFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);


        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_summary_setup, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        //textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

        btnConfirm = (Button) rootView.findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(getActivity(), SlideoutMenuActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}