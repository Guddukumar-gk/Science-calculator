package com.example.sciencecalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public FragmentsAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0: return new CalculatorFragment();
            case 1: return  new EMIFargment();
            case 2: return  new ConversionFragment();
            default:return new CalculatorFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        String title =null;
        if(position==0)
        {
            title = "Simple";

        }
        if(position==1)
        {
            title = "EMI";

        }
        if(position==2)
        {
            title = "Conversion";

        }
        return title;
    }
}
