package org.witsolapur.witchar18.Event;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.witsolapur.witchar18.R;


public class EventRules extends Fragment {


    public EventRules() {
        // Required empty public constructor
    }

    private TextView event_rules,syn;
    private EventActivity graphActivity;

    private String graphtitle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.event_rules, container, false);
        event_rules= (TextView) v.findViewById(R.id.eventrules);
        syn= (TextView) v.findViewById(R.id.syn);


        switch (graphtitle){
            case "ASquare":
                String des=getResources().getString(R.string.asquare_rules);
                event_rules.setText(des);
                break;

            case "Code Marathon":
                String des1=getResources().getString(R.string.programming_rules);
                event_rules.setText(des1);
                break;

            case "Web Imagika":
                String des2=getResources().getString(R.string.webimagica_rules);
                event_rules.setText(des2);
                break;

            case "Project Display":
                String des3=getResources().getString(R.string.projcse_rules);
                event_rules.setText(des3);
                break;

            case "Paper Presentation CSE":
                String des4=getResources().getString(R.string.papercse_rules);
                event_rules.setText(des4);

                TextView txt = (TextView) v.findViewById(R.id.syn);
                txt.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/LWYtqlUdEb9NoGaa2"));
                        startActivity(i);
                    }
                });
                syn.setText("Link to Upload Synopsis");
                break;
            case "Poster Making":
                String des5=getResources().getString(R.string.postermaking_rules);
                event_rules.setText(des5);
                break;
            case "Graphity":
                String des6=getResources().getString(R.string.graphity_rules);
                event_rules.setText(des6);
                break;




            case "Expert MANu":
                String des7=getResources().getString(R.string.expertmanu_rules);
                event_rules.setText(des7);
                break;
            case "Catia Champ":
                String des8=getResources().getString(R.string.catia_rules);
                event_rules.setText(des8);
                break;
            case "Deadly Follower":
                String des9=getResources().getString(R.string.deadlyfollower_rules);
                event_rules.setText(des9);
                break;
            case "2Fast2Furious":
                String des99=getResources().getString(R.string.fastfurious_rules);
                event_rules.setText(des99);
                break;
            case "Project Competition Mech":
                String des10=getResources().getString(R.string.projmech_rules);
                event_rules.setText(des10);
                break;
            case "Paper Presentation Mech":
                String des11=getResources().getString(R.string.papermech_rules);
                event_rules.setText(des11);

                TextView txt2 = (TextView) v.findViewById(R.id.syn);
                txt2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/UfUnTNPRHnsQfS8H2"));
                        startActivity(i);
                    }
                });
                syn.setText("Link to Upload Synopsis");
                break;
            case "Enterprise":
                String des12=getResources().getString(R.string.enterpreneurship_rules);
                event_rules.setText(des12);
                break;
            case "Best From Waste":
                String des13=getResources().getString(R.string.bow_rules);
                event_rules.setText(des13);
                break;



            case "EcoCrete":
                String des14=getResources().getString(R.string.ecocrete_rules);
                event_rules.setText(des14);
                break;
            case "DreamCAD":
                String des15=getResources().getString(R.string.dreamcad_rules);
                event_rules.setText(des15);
                break;
            case "InfraCivil":
                String des16=getResources().getString(R.string.infracivil_rules);
                event_rules.setText(des16);
                break;
            case "Wonder Tender":
                String des17=getResources().getString(R.string.wondertender_rules);
                event_rules.setText(des17);
                break;
            case "Aptech Quiz":
                String des18=getResources().getString(R.string.aptech_rules);
                event_rules.setText(des18);
                break;
            case "Project Competition Civil":
                String des19=getResources().getString(R.string.projcivil_rules);
                event_rules.setText(des19);
                break;
            case "Paper Presentation Civil":
                String des20=getResources().getString(R.string.papercivil_rules);
                event_rules.setText(des20);

                TextView txt3 = (TextView) v.findViewById(R.id.syn);
                txt3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/iMhILb7EqbCNB9Dp2"));
                        startActivity(i);
                    }
                });
                syn.setText("Link to Upload Synopsis");
                break;




            case "MCS 51":
                String des21=getResources().getString(R.string.MCS51_rules);
                event_rules.setText(des21);
                break;
            case "Quizotronics":
                String des22=getResources().getString(R.string.quizotronics_rules);
                event_rules.setText(des22);
                break;
            case "Network Treasure Hunt":
                String des23=getResources().getString(R.string.nth_rules);
                event_rules.setText(des23);
                break;
            case "Electron Mechanics":
                String des24=getResources().getString(R.string.electron_rules);
                event_rules.setText(des24);
                break;
            case "Project Presentation ENTC":
                String des25=getResources().getString(R.string.projentc_rules);
                event_rules.setText(des25);
                break;
            case "MATLAB Programming":
                String des26=getResources().getString(R.string.matlab_rules);
                event_rules.setText(des26);
                break;
            case "Energy Contraption":
                String des27=getResources().getString(R.string.energy_rules);
                event_rules.setText(des27);

                TextView txt6 = (TextView) v.findViewById(R.id.syn);
                txt6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("http://agrawalshubham.com/energy-contraption-abstract"));
                        startActivity(i);
                    }
                });
                syn.setText("Link to Abstract");


                break;
            case "Paper Presentation ENTC":
                String des28=getResources().getString(R.string.paperentc_rules);
                event_rules.setText(des28);

                TextView txt4 = (TextView) v.findViewById(R.id.syn);
                txt4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/z59BFZd7594qzJY63"));
                        startActivity(i);
                    }
                });
                syn.setText("Link to Upload Synopsis");
                break;



            case "Google It":
                String des29=getResources().getString(R.string.googleit_rules);
                event_rules.setText(des29);
                break;

            case "Logo Quiz":
                String des30=getResources().getString(R.string.logoquiz_rules);
                event_rules.setText(des30);
                break;
        }
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            graphActivity= (EventActivity) context;
            graphtitle=graphActivity.getGraphtitle();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
