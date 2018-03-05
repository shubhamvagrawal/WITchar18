package org.witsolapur.witchar18.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.witsolapur.witchar18.Event.EventActivity;
import org.witsolapur.witchar18.MainActivity;
import org.witsolapur.witchar18.R;

/**
 * Created by $hubh on 2/18/2018.
 */


public class offlinequiz extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view=inflater.inflate(R.layout.offlinequiz, container,false);

        ImageView img = (ImageView) view.findViewById(R.id.googleit);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),EventActivity.class);
                startActivity(intent);
            }
        });

        ImageView img2 = (ImageView) view.findViewById(R.id.logoquiz);
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    public static offlinequiz newInstance(int position) {
        offlinequiz fragment = new offlinequiz();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}