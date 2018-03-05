package org.witsolapur.witchar18.Info;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.witsolapur.witchar18.R;

public class initiatives extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View rootView=inflater.inflate(R.layout.initiatives, container,false);
        return rootView;
    }

    public static initiatives newInstance(int position) {
        initiatives fragment = new initiatives();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}