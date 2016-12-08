package com.nicholasdass.merchantcommander;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class EmpireShopEmployeesFragment extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "2";


    public EmpireShopEmployeesFragment() {
        // Required empty public constructor
    }

    /**
            * Returns a new instance of this fragment for the given section
    * number.
    */
    public static EmpireShopEmployeesFragment newInstance(int sectionNumber) {
        EmpireShopEmployeesFragment fragment = new EmpireShopEmployeesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewRoot = inflater.inflate(R.layout.fragment_empire_shop_employees, container, false);

        return viewRoot;
    }

}
