package org.witsolapur.witchar18;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by $hubh on 2/18/2018.
 */

public class MapFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        getActivity().setTitle("Campus Map");
        return inflater.inflate(R.layout.map, container, false);

    }

}