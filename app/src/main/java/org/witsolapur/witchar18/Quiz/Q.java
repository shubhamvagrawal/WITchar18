package org.witsolapur.witchar18.Quiz;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.witsolapur.witchar18.Event.HLVAdapter5;
import org.witsolapur.witchar18.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Q extends android.support.v4.app.Fragment {

    RecyclerView mRecyclerView5;
    RecyclerView.LayoutManager mLayoutManager5;
    RecyclerView.Adapter mAdapter;
    ArrayList<String> alName5;
    ArrayList<Integer> alImage5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.q, container, false);


        // CSEIT RecyclerView1
        alName5 = new ArrayList<>(Arrays.asList("Google It","Logo Quiz" ));
        alImage5 = new ArrayList<>(Arrays.asList(R.drawable.googleit,R.drawable.logoquiz ));


        // Calling the RecyclerView1
        mRecyclerView5 = (RecyclerView) view.findViewById(R.id.recycler_view5);
        mRecyclerView5.setHasFixedSize(true);




        // The number of Columns1
        mLayoutManager5 = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView5.setLayoutManager(mLayoutManager5);

        mAdapter = new HLVAdapter5(getActivity(), alName5, alImage5);
        mRecyclerView5.setAdapter(mAdapter);

    return view;
}
    public static Q newInstance(int position) {
        Q fragment = new Q();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}