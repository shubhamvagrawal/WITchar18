package org.witsolapur.witchar18;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.witsolapur.witchar18.Quiz.Q;
import org.witsolapur.witchar18.Quiz.onlinequiz;

/**
 * Created by $hubh on 2/18/2018.
 */


public class QuizFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        getActivity().setTitle("Out of the Box");
        View view = inflater.inflate(R.layout.tabs, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);
        return view;
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm)
        {
            super(fm);
        }

        @Override
        public Fragment getItem(int day)
        {

            switch (day)
            {
                case 0:
                    return Q.newInstance(1);
                case 1:
                    return onlinequiz.newInstance(1);
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int day) {

            switch (day) {
                case 0:
                    return "Offline";
                case 1:
                    return "Online";
                default:
                    return null;
            }
        }
    }
}