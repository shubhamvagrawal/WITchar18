package org.witsolapur.witchar18.Info;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import org.witsolapur.witchar18.R;

public class accommodation extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // TODO Auto-generated method stub
        View view=inflater.inflate(R.layout.accommodation, container,false);

        ImageView img = (ImageView) view.findViewById(R.id.f1);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:9739317478"));
                startActivity(i);
            }
        });

        ImageView img2 = (ImageView) view.findViewById(R.id.s1);
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:7748829190"));
                startActivity(i);
            }
        });

        ImageView img3 = (ImageView) view.findViewById(R.id.s2);
        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:9657209366"));
                startActivity(i);
            }
        });




        ImageView img4 = (ImageView) view.findViewById(R.id.f2);
        img4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:9890957320"));
                startActivity(i);
            }
        });

        ImageView img5 = (ImageView) view.findViewById(R.id.f3);
        img5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:9665171880"));
                startActivity(i);
            }
        });

        ImageView img6 = (ImageView) view.findViewById(R.id.f4);
        img6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:9422025706"));
                startActivity(i);
            }
        });


        ImageView img7 = (ImageView) view.findViewById(R.id.s3);
        img7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:8624928868"));
                startActivity(i);
            }
        });

        ImageView img8 = (ImageView) view.findViewById(R.id.s4);
        img8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:9637425103"));
                startActivity(i);
            }
        });


        Button bt = (Button) view.findViewById(R.id.reqaccom);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://goo.gl/forms/6A2BeonRlJFaZRcI3"));
                startActivity(i);
            }
        });


        return view;
    }

    public static accommodation newInstance(int position) {
        accommodation fragment = new accommodation();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}