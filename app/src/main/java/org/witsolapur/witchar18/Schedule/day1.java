package org.witsolapur.witchar18.Schedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.witsolapur.witchar18.R;

/**
 * Created by $hubh on 2/18/2018.
 */


public class day1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View rootView=inflater.inflate(R.layout.day1, container,false);
        return rootView;
}

    public static day1 newInstance(int position) {
        day1 fragment = new day1();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }

}

