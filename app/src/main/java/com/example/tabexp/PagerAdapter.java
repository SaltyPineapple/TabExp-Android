package com.example.tabexp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm, mNumOfTabs);
        this.mNumOfTabs = mNumOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new TabFrag1();
            case 1: return new tabFrag2();
            case 2: return new tabFrag3();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
