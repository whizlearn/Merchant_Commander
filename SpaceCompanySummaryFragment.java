package com.nicholasdass.merchantcommander;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpaceCompanySummaryFragment extends Fragment {

    private TextView txtCompanyName;
    private TextView txtMerchantCommanderName;

    private ImageView imgSpaceCompanyLogo;

    private TextView txtNumberOfEmployees;
    private TextView txtNumberOfShips;


    public SpaceCompanySummaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewRoot = inflater.inflate(R.layout.fragment_space_company_summary, container, false);

        txtCompanyName = (TextView) viewRoot.findViewById(R.id.txtCompanyName);
        txtMerchantCommanderName = (TextView) viewRoot.findViewById(R.id.txtMerchantCommanderName);

        imgSpaceCompanyLogo = (ImageView) viewRoot.findViewById(R.id.imgSpaceCompanyLogo);

        txtNumberOfEmployees = (TextView) viewRoot.findViewById(R.id.txtNumberOfEmployees);
        txtNumberOfShips = (TextView) viewRoot.findViewById(R.id.txtNumberOfShips);

        return viewRoot;
    }

}
