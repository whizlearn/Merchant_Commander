package com.nicholasdass.merchantcommander;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GameSetupActivity extends AppCompatActivity {

    //Field Variables for profile fragment profile setup***************************
    EditText edtCharacterName;
    EditText edtCompanyName;

    Button btnSubmit;

    //*****************************************************************************

    //Field Variables for profile fragment summary setup***************************
    TextView txtCharacterName;
    TextView txtCompanyName;

    //*****************************************************************************

    public static final String MY_CUSTOM_FRAGMENT_KEY = "CUSTOM_KEY";

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_setup);

//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        //Initialized Variables for profile fragment profile setup***************************
        edtCharacterName = (EditText) findViewById(R.id.edtCharacterName);
        edtCompanyName = (EditText) findViewById(R.id.edtCompanyName);

        btnSubmit = (Button) findViewById(R.id.btnProfileSubmit);

        //Initialized Variables for profile fragment summary setup***************************
        txtCharacterName = (TextView) findViewById(R.id.txtCompanyName);
        txtCompanyName = (TextView) findViewById(R.id.txtCompanyName);

//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtCharacterName.setText(edtCharacterName.getText().toString());
//                txtCompanyName.setText(edtCompanyName.getText().toString());
//                //Nicreturn LocationSetupFragment.newInstance(, 2);
//            }
//        });

    }

//    private Fragment createCustomFragment(){
//        Bundle bundle = new Bundle();
//        bundle.putString(MY_CUSTOM_FRAGMENT_KEY, edtCharacterName.getText().toString());
//
//
//
//
//        return null;
//        //Placeholderfragment
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_setup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void planetNeptune(View view) {

        Toast.makeText(getApplicationContext(), "Neptune", Toast.LENGTH_SHORT).show();

    }

    public void planetMars(View view) {

        Toast.makeText(getApplicationContext(), "Mars", Toast.LENGTH_SHORT).show();

    }

    public void planetEarth(View view) {

        Toast.makeText(getApplicationContext(), "Earth", Toast.LENGTH_SHORT).show();

    }



    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            switch (position) {
                case 0:
                    return ProfileSetupFragment.newInstance(position + 1);
                case 1:
                    return LocationSetupFragment.newInstance(position + 2);
                case 2:
                    return SummarySetupFragment.newInstance(position + 3);
            }
            return null;

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "PROFILE";
                case 1:
                    return "LOCATION";
                case 2:
                    return "SUMMARY";
            }
            return null;
        }


    }
}
