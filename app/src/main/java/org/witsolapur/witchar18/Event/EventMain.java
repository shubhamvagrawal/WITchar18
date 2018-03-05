package org.witsolapur.witchar18.Event;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.witsolapur.witchar18.R;

import java.util.ArrayList;
import java.util.Arrays;

public class EventMain extends android.support.v4.app.Fragment {

    RecyclerView mRecyclerView,mRecyclerView2,mRecyclerView3,mRecyclerView4;
    RecyclerView.LayoutManager mLayoutManager,mLayoutManager2,mLayoutManager3,mLayoutManager4;
    RecyclerView.Adapter mAdapter;
    ArrayList<String> alName,alName2,alName3,alName4;
    ArrayList<Integer> alImage,alImage2,alImage3,alImage4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.newevent, container, false);
        getActivity().setTitle("Events");

        // CSEIT RecyclerView1
        alName = new ArrayList<>(Arrays.asList("Code Marathon" ,"Web Imagika","Project Display", "Paper Presentation CSE", "Poster Making","Graphity","ASquare"));
        alImage = new ArrayList<>(Arrays.asList(R.drawable.coding, R.drawable.web, R.drawable.projectpresentation, R.drawable.paperpresentation,R.drawable.poster, R.drawable.graphity,R.drawable.asquare ));


        // MECH RecyclerView2
        alName2 = new ArrayList<>(Arrays.asList("Expert MANu","Catia Champ","2Fast2Furious","Deadly Follower","Project Competition Mech","Paper Presentation Mech","Enterprise","Best From Waste"));
        alImage2 = new ArrayList<>(Arrays.asList( R.drawable.manu,R.drawable.catia,R.drawable.fastfurious,R.drawable.linefollower,R.drawable.projectpresentation,R.drawable.paperpresentation,R.drawable.enterprise,R.drawable.bow));

        // CIVIL RecyclerView3
        alName3 = new ArrayList<>(Arrays.asList("EcoCrete", "DreamCAD", "InfraCivil","Wonder Tender", "Aptech Quiz","Project Competition Civil", "Paper Presentation Civil"));
        alImage3 = new ArrayList<>(Arrays.asList(R.drawable.ecocrete, R.drawable.cad,R.drawable.infracivil, R.drawable.tender, R.drawable.aptechquiz,R.drawable.projectpresentation, R.drawable.paperpresentation));

        // E&TC ELN RecyclerView4
        alName4 = new ArrayList<>(Arrays.asList("MCS 51","Quizotronics","Network Treasure Hunt","Electron Mechanics","Project Presentation ENTC","MATLAB Programming","Energy Contraption","Paper Presentation ENTC" ));
        alImage4 = new ArrayList<>(Arrays.asList(R.drawable.electron, R.drawable.quizotronics,R.drawable.treasurehunt, R.drawable.em,R.drawable.projectpresentation, R.drawable.matlab,R.drawable.energy, R.drawable.paperpresentation));

        // Calling the RecyclerView1
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view5);
        mRecyclerView.setHasFixedSize(true);

        // Calling the RecyclerView2
        mRecyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_view2);
        mRecyclerView2.setHasFixedSize(true);

        // Calling the RecyclerView3
        mRecyclerView3 = (RecyclerView) view.findViewById(R.id.recycler_view3);
        mRecyclerView3.setHasFixedSize(true);

        // Calling the RecyclerView4
        mRecyclerView4 = (RecyclerView) view.findViewById(R.id.recycler_view4);
        mRecyclerView4.setHasFixedSize(true);



        // The number of Columns1
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new HLVAdapter(getActivity(), alName, alImage);
        mRecyclerView.setAdapter(mAdapter);


        // The number of Columns2
        mLayoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView2.setLayoutManager(mLayoutManager2);

        mAdapter = new HLVAdapter2(getActivity(), alName2, alImage2);
        mRecyclerView2.setAdapter(mAdapter);


        // The number of Columns3
        mLayoutManager3 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView3.setLayoutManager(mLayoutManager3);

        mAdapter = new HLVAdapter3(getActivity(), alName3, alImage3);
        mRecyclerView3.setAdapter(mAdapter);


        // The number of Columns4
        mLayoutManager4 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView4.setLayoutManager(mLayoutManager4);

        mAdapter = new HLVAdapter4(getActivity(), alName4, alImage4);
        mRecyclerView4.setAdapter(mAdapter);


    return view;
}
}
