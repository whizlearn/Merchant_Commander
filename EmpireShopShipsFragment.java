package com.nicholasdass.merchantcommander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nicholas Dass on 11/28/16.
 */

/**
 * A placeholder fragment containing a simple view.
 */
public class EmpireShopShipsFragment extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "1";

    public EmpireShopShipsFragment() {

    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static EmpireShopShipsFragment newInstance(int sectionNumber) {
        EmpireShopShipsFragment fragment = new EmpireShopShipsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_empire_shop_ships, container, false);

        return rootView;
    }
}
