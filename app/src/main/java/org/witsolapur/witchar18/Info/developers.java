package org.witsolapur.witchar18.Info;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.witsolapur.witchar18.R;

public class developers extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // TODO Auto-generated method stub
        View view=inflater.inflate(R.layout.credits, container,false);

        return view;
        }



    public static developers newInstance(int position) {
        developers fragment = new developers();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}