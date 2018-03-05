package org.witsolapur.witchar18.Event;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.witsolapur.witchar18.R;

public class EventDetails extends Fragment {


    public EventDetails() {
        // Required empty public constructor
    }

    private TextView event_details,date,time,venue,depart,room;
    private EventActivity graphActivity;

    private String graphtitle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.event_details, container, false);
        event_details= (TextView) v.findViewById(R.id.eventdetails);
        date= (TextView) v.findViewById(R.id.date);
        time= (TextView) v.findViewById(R.id.time);
        venue= (TextView) v.findViewById(R.id.venue);
        room= (TextView) v.findViewById(R.id.room);
        depart= (TextView) v.findViewById(R.id.depart);

        switch (graphtitle){

            case "ASquare":
                String des=getResources().getString(R.string.asquare_info);
                event_details.setText(des);
                venue.setText("Main Building \n1st Floor");
                room.setText("M220: IT LAB");
                date.setText("16 March");
                time.setText("11.30 AM");
                depart.setText("CSE & IT");
                break;
            case "Code Marathon":
                String des1=getResources().getString(R.string.programming_contest_info);
                event_details.setText(des1);
                date.setText("17 March");
                time.setText("9 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("M226: DATABASE LAB");
                depart.setText("CSE & IT");
                break;
            case "Web Imagika":
                String des2=getResources().getString(R.string.web_imagica_info);
                event_details.setText(des2);
                date.setText("17 March");
                time.setText("9 AM");
                venue.setText("Main Building\nGround Floor");
                room.setText("M129: LAB1");
                depart.setText("CSE & IT");
                break;
            case "Project Display":
                String des3=getResources().getString(R.string.projcse_info);
                event_details.setText(des3);
                date.setText("16 March");
                time.setText("9 AM");
                venue.setText("Main Building\nGround Floor");
                room.setText("M130: MULTIMEDIA LAB");
                depart.setText("CSE & IT");
                break;
            case "Paper Presentation CSE":
                String des4=getResources().getString(R.string.papercse_info);
                event_details.setText(des4);
                date.setText("16 March");
                time.setText("S1: 11AM\nS2: 2PM\nS3: 4PM");
                venue.setText("Main Building\n3RD Floor");
                room.setText("S1: M329\nS2: M330\nS3: M331");
                depart.setText("CSE & IT");
                break;
            case "Poster Making":
                String des5=getResources().getString(R.string.poster_making_info);
                event_details.setText(des5);
                date.setText("16 March");
                time.setText("11 AM");
                venue.setText("New Building\n1st Floor");
                room.setText("Seminar Hall");
                depart.setText("CSE & IT");
                break;
            case "Graphity":
                String des6=getResources().getString(R.string.graphity_info);
                event_details.setText(des6);
                date.setText("16 March");
                time.setText("11.30 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("M226:Database Lab");
                depart.setText("CSE & IT");
                break;




            case "Expert MANu":
                String des7=getResources().getString(R.string.manu_expert_info);
                event_details.setText(des7);
                date.setText("16 March");
                time.setText("9 AM");
                venue.setText("CM Building");
                room.setText("Classroom");
                depart.setText("Mechanical");
                break;
            case "Catia Champ":
                String des8=getResources().getString(R.string.catia_champ_info);
                event_details.setText(des8);
                date.setText("16 March");
                time.setText("9 AM");
                venue.setText("CM Building");
                room.setText("Computer Center");
                depart.setText("Mechanical");
                break;
            case "Deadly Follower":
                String des9=getResources().getString(R.string.deadlyfollower_info);
                event_details.setText(des9);
                date.setText("17 March");
                time.setText("10 AM");
                venue.setText("CM Building");
                room.setText("Mech Dept.");
                depart.setText("Mechanical");
                break;
            case "2Fast2Furious":
                String des99=getResources().getString(R.string.fastfurious_info);
                event_details.setText(des99);
                date.setText("16 March");
                time.setText("11 AM");
                venue.setText("CM Building");
                room.setText("Mech Dept.");
                depart.setText("Mechanical");
                break;
            case "Project Competition Mech":
                String des10=getResources().getString(R.string.projmech_info);
                event_details.setText(des10);
                date.setText("16 March");
                time.setText("9 AM");
                venue.setText("CM Building");
                room.setText("Workshop");
                depart.setText("Mechanical");
                break;
            case "Paper Presentation Mech":
                String des11=getResources().getString(R.string.papermech_info);
                event_details.setText(des11);
                date.setText("16 March");
                time.setText("S1: 11AM\nS2: 2PM\nS3: 4PM");
                venue.setText("CM Building");
                room.setText("Classroom");
                depart.setText("Mechanical");
                break;
            case "Enterprise":
                String des12=getResources().getString(R.string.enterprise_info);
                event_details.setText(des12);
                date.setText("17 March");
                time.setText("9 AM");
                venue.setText("CM Building");
                room.setText("Classroom");
                depart.setText("Mechanical");
                break;
            case "Best From Waste":
                String des13=getResources().getString(R.string.best_from_waste_info);
                event_details.setText(des13);
                date.setText("17 March");
                time.setText("9 AM");
                venue.setText("CM Building");
                room.setText("Drawing Hall");
                depart.setText("Mechanical");
                break;



            case "EcoCrete":
                String des14=getResources().getString(R.string.ecocrete_info);
                event_details.setText(des14);
                date.setText("16 March");
                time.setText("10 am ");
                venue.setText("Testing Material Lab");
                room.setText("CM 107");
                depart.setText("CIVIL");
                break;
            case "DreamCAD":
                String des15=getResources().getString(R.string.dreamcad_info);
                event_details.setText(des15);
                date.setText("17 March");
                time.setText("9 AM");
                venue.setText("Civil Comp. Lab");
                room.setText("CM 204");
                depart.setText("CIVIL");
                break;
            case "InfraCivil":
                String des16=getResources().getString(R.string.infracivil_info);
                event_details.setText(des16);
                date.setText("16 March");
                time.setText("2 PM");
                venue.setText("Testing Material Lab");
                room.setText("CM 107");
                depart.setText("CIVIL");
                break;
            case "Wonder Tender":
                String des17=getResources().getString(R.string.wonder_tender_info);
                event_details.setText(des17);
                date.setText("17 March");
                time.setText("10 AM");
                venue.setText("CM Building");
                room.setText("CM 308");
                depart.setText("CIVIL");
                break;
            case "Aptech Quiz":
                String des18=getResources().getString(R.string.aptech_info);
                event_details.setText(des18);
                date.setText("16 March");
                time.setText("2 PM");
                venue.setText("CM Building");
                room.setText("CM 312");
                depart.setText("CIVIL");
                break;
            case "Project Competition Civil":
                String des19=getResources().getString(R.string.projcivil_info);
                event_details.setText(des19);
                date.setText("16 March");
                time.setText("12.00 PM");
                venue.setText("Civil Drawing Hall");
                room.setText("CM 229");
                depart.setText("CIVIL");
                break;
            case "Paper Presentation Civil":
                String des20=getResources().getString(R.string.papercivil_info);
                event_details.setText(des20);
                date.setText("16 March");
                time.setText("S1: 11AM\nS2: 2PM\nS3: 4PM");
                venue.setText("CM Building");
                room.setText("CM 205\nSeminar Hall");
                depart.setText("CIVIL");
                break;




            case "MCS 51":
                String des21=getResources().getString(R.string.microcontroller_info);
                event_details.setText(des21);
                date.setText("16 March");
                time.setText("11.30 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("Lab");
                depart.setText("ENTC & ELN");
                break;
            case "Quizotronics":
                String des22=getResources().getString(R.string.quizotronics_info);
                event_details.setText(des22);
                date.setText("17 March");
                time.setText("9 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("Programming Lab");
                depart.setText("ENTC & ELN");
                break;
            case "Network Treasure Hunt":
                String des23=getResources().getString(R.string.network_treasure_hunt_info);
                event_details.setText(des23);
                date.setText("17 March");
                time.setText("9 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("M209: Actel Lab");
                depart.setText("ENTC & ELN");
                break;
            case "Electron Mechanics":
                String des24=getResources().getString(R.string.electron_info);
                event_details.setText(des24);
                date.setText("16 March");
                time.setText("11 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("TE BE Classroom");
                depart.setText("ENTC & ELN");
                break;
            case "Project Presentation ENTC":
                String des25=getResources().getString(R.string.projentc_info);
                event_details.setText(des25);
                date.setText("16 March");
                time.setText("9 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("Electronics Proj. Lab");
                depart.setText("ENTC & ELN");
                break;
            case "MATLAB Programming":
                String des26=getResources().getString(R.string.matlab_info);
                event_details.setText(des26);
                date.setText("17 March");
                time.setText("9.45 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("Lab");
                depart.setText("ENTC & ELN");
                break;
            case "Energy Contraption":
                String des27=getResources().getString(R.string.energy_contraption_info);
                event_details.setText(des27);
                date.setText("17 March");
                time.setText("7.30 AM");
                venue.setText("Main Building\n1st Floor");
                room.setText("Old Library");
                depart.setText("ENTC & ELN");
                break;
            case "Paper Presentation ENTC":
                String des28=getResources().getString(R.string.paperentc_info);
                event_details.setText(des28);
                date.setText("16 March");
                time.setText("S1: 11AM\nS2: 2PM\nS3: 4PM");
                venue.setText("Main Building\n1st Floor");
                room.setText("Lab");
                depart.setText("ENTC & ELN");
                break;




            case "Google It":
                String des29=getResources().getString(R.string.googleit_info);
                event_details.setText(des29);
                date.setText(" ");
                time.setText(" ");
                venue.setText(" ");
                room.setText(" ");
                depart.setText("ALL");
                break;

            case "Logo Quiz":
                String des30=getResources().getString(R.string.logoquiz_info);
                event_details.setText(des30);
                date.setText(" ");
                time.setText(" ");
                venue.setText(" ");
                room.setText(" ");
                depart.setText("ALL");
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
