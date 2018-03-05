package org.witsolapur.witchar18.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.witsolapur.witchar18.R;

/**
 * Created by $hubh on 2/18/2018.
 */


public class onlinequiz extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view=inflater.inflate(R.layout.onlinequiz, container,false);

        TextView txt = (TextView) view.findViewById(R.id.startquiz);
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Quiz.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public static onlinequiz newInstance(int position) {
        onlinequiz fragment = new onlinequiz();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}