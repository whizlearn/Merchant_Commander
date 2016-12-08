package com.nicholasdass.merchantcommander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CompanyManagementFragment extends Fragment {

    //Field Variables***********************************************************************
    private Button btnInventory;
    private Button btnCurrentTradeMissions;
    private Button btnEmployees;
    private Button btnHangar;
    private Button btnFinances;
    private Button btnSpaceCompanySummary;

    //*************************************************************************************


    public CompanyManagementFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_company_management, container, false);

        //Field Variables initialization**********************************************************

        btnInventory = (Button) rootView.findViewById(R.id.btnInventory);
        btnCurrentTradeMissions = (Button) rootView.findViewById(R.id.btnCurrentTradeMissions);
        btnEmployees = (Button) rootView.findViewById(R.id.btnEmployees);
        btnHangar = (Button) rootView.findViewById(R.id.btnHangar);
        btnFinances = (Button) rootView.findViewById(R.id.btnFinances);
        btnSpaceCompanySummary = (Button) rootView.findViewById(R.id.btnSpaceCompanySummary);

        //*************************************************************************************

        btnClickEvents();


        return rootView;
    }


    // This method handles all button click events for this fragment
    public void btnClickEvents(){

        btnInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Testing Inventory", Toast.LENGTH_SHORT).show();

                InventoryFragment inventoryFragment = new InventoryFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(
                        R.id.content_slideout_menu,
                        inventoryFragment,
                        inventoryFragment.getTag()
                ).commit();
            }
        });

        btnCurrentTradeMissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Testing Current Trade Missions", Toast.LENGTH_SHORT).show();
            }
        });

        btnEmployees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnHangar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnFinances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnSpaceCompanySummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SpaceCompanySummaryFragment spaceCompanySummaryFragment = new SpaceCompanySummaryFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(
                        R.id.content_slideout_menu,
                        spaceCompanySummaryFragment,
                        spaceCompanySummaryFragment.getTag()
                ).commit();

            }
        });

    }

}
