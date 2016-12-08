package com.nicholasdass.merchantcommander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nicholas Dass on 11/28/16.
 */

public class PlanetMarketBuyFragment extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "1";

    public PlanetMarketBuyFragment(){

    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlanetMarketBuyFragment newInstance(int sectionNumber) {
        PlanetMarketBuyFragment fragment = new PlanetMarketBuyFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_planet_market_buy, container, false);


        return rootView;
    }

}
