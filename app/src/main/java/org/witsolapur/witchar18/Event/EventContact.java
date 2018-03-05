package org.witsolapur.witchar18.Event;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.witsolapur.witchar18.R;


public class EventContact extends Fragment {
    public EventContact() {
        // Required empty public constructor
    }

    private TextView fname,sname,fcontact,scontact,reg;
    private ImageView simg,fimg;
    private EventActivity graphActivity;


    private String graphtitle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.event_contact, container, false);

        reg= v.findViewById(R.id.reg);
        fname= v.findViewById(R.id.fname);
        sname= v.findViewById(R.id.sname);

        fcontact= v.findViewById(R.id.fcontact);
        scontact= v.findViewById(R.id.scontact);

        simg= v.findViewById(R.id.simg);
        fimg= v.findViewById(R.id.fimg);


        switch (graphtitle){

            case "ASquare":

                ImageView img1 = v.findViewById(R.id.c1);
                img1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9763709600")); startActivity(i);
                    }
                });
                ImageView img2 = v.findViewById(R.id.c2);
                img2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8484855116")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.kathawate);
                fname.setText("Prof. Mr P.N.Kathavate");
                fcontact.setText("9763709600");
                simg.setImageResource(R.drawable.pooja);
                sname.setText("Pooja Kairamkonda");
                scontact.setText("8484855116");

                TextView txt = (TextView) v.findViewById(R.id.reg);
                txt.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Code Marathon":
                ImageView img3 = v.findViewById(R.id.c1);
                img3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9637619995")); startActivity(i);
                    }
                });
                ImageView img4 = v.findViewById(R.id.c2);
                img4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9407323891")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.kumavat);
                fname.setText("Prof. Mrs. K.R.Pardeshi");
                fcontact.setText("9637619995");
                simg.setImageResource(R.drawable.shrey);
                sname.setText("Shrey Jain");
                scontact.setText("9407323891");

                TextView txt2 = (TextView) v.findViewById(R.id.reg);
                txt2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Web Imagika":
                ImageView img5 = v.findViewById(R.id.c1);
                img5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9420546769")); startActivity(i);
                    }
                });
                ImageView img6 = v.findViewById(R.id.c2);
                img6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9892923116")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.ambarkar);
                fname.setText("Prof. Mrs. S.S. Ambarkar");
                fcontact.setText("9420546769");
                simg.setImageResource(R.drawable.pragati);
                sname.setText("Pragati Ajanalkar");
                scontact.setText("7755931952");

                TextView txt3 = (TextView) v.findViewById(R.id.reg);
                txt3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;


            case "Project Display":
                ImageView img7 = v.findViewById(R.id.c1);
                img7.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9850563472")); startActivity(i);
                    }
                });
                ImageView img8 = v.findViewById(R.id.c2);
                img8.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8605007944")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.dixit);
                fname.setText("Mrs R.K.Dixit");
                fcontact.setText("9850563472");
                simg.setImageResource(R.drawable.aditi);
                sname.setText("Aditi Chikkali");
                scontact.setText("8605007944");

                TextView txt4 = (TextView) v.findViewById(R.id.reg);
                txt4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");
                break;


            case "Paper Presentation CSE":
                ImageView img9 = v.findViewById(R.id.c1);
                img9.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9881175332")); startActivity(i);
                    }
                });
                ImageView img10 = v.findViewById(R.id.c2);
                img10.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9405659859")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.mahant);
                fname.setText("Mr M.A.Mahant");
                fcontact.setText("9881175332");
                simg.setImageResource(R.drawable.yogesh);
                sname.setText("Yogesh Kalyanshetty");
                scontact.setText("9405659859");

                TextView txt5 = (TextView) v.findViewById(R.id.reg);
                txt5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;


            case "Poster Making":
                ImageView img11 = v.findViewById(R.id.c1);
                img11.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8446508006")); startActivity(i);
                    }
                });
                ImageView img12 = v.findViewById(R.id.c2);
                img12.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9404704265")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.attar);
                fname.setText("Prof. Ms. R.A.Attar");
                fcontact.setText("9923847008");
                simg.setImageResource(R.drawable.asmi);
                sname.setText("Asmita Desai");
                scontact.setText("9404704265");

                TextView txt6 = (TextView) v.findViewById(R.id.reg);
                txt6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Graphity":
                ImageView img13 = v.findViewById(R.id.c1);
                img13.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8055514289")); startActivity(i);
                    }
                });
                ImageView img14 = v.findViewById(R.id.c2);
                img14.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9730471093")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.karpe);
                fname.setText("Prof. Mrs. S.K. Karpe");
                fcontact.setText("8055514289");
                simg.setImageResource(R.drawable.kabra);
                sname.setText("Vedant Kabra");
                scontact.setText("9730471093");

                TextView txt7 = (TextView) v.findViewById(R.id.reg);
                txt7.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");


                break;











            case "Expert MANu":
                ImageView img15 = v.findViewById(R.id.c1);
                img15.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9422025706")); startActivity(i);
                    }
                });
                ImageView img16 = v.findViewById(R.id.c2);
                img16.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:7588434634")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.doshi);
                fname.setText("Prof.D.J.Doshi");
                fcontact.setText("9422025706");
                simg.setImageResource(R.drawable.dahale);
                sname.setText("Mr.Mahesh Dahale");
                scontact.setText("7588434634");

                TextView txt8 = (TextView) v.findViewById(R.id.reg);
                txt8.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");
                break;

            case "Catia Champ":
                ImageView img17 = v.findViewById(R.id.c1);
                img17.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9028193550")); startActivity(i);
                    }
                });
                ImageView img18 = v.findViewById(R.id.c2);
                img18.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9595889201")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.chitte);
                fname.setText("Prof.P.G.Chitte");
                fcontact.setText("9028193550");
                simg.setImageResource(R.drawable.vibhute);
                sname.setText("Mr.Shubham Vibhute");
                scontact.setText("9595889201");

                TextView txt9 = (TextView) v.findViewById(R.id.reg);
                txt9.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Deadly Follower":
                ImageView img19 = v.findViewById(R.id.c1);
                img19.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9822217799")); startActivity(i);
                    }
                });
                ImageView img20 = v.findViewById(R.id.c2);
                img20.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9766810489")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.mistry);
                fname.setText("Prof.R.D.Mistry");
                fcontact.setText("9822217799");
                simg.setImageResource(R.drawable.kurandwade);
                sname.setText("Mr.Akshay Kurandwade");
                scontact.setText("9766810489");

                TextView txt10 = (TextView) v.findViewById(R.id.reg);
                txt10.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "2Fast2Furious":
                ImageView img99 = v.findViewById(R.id.c1);
                img99.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9822217799")); startActivity(i);
                    }
                });
                ImageView img98 = v.findViewById(R.id.c2);
                img98.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9766810489")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.mistry);
                fname.setText("Prof.R.D.Mistry");
                fcontact.setText("9822217799");
                simg.setImageResource(R.drawable.kurandwade);
                sname.setText("Mr.Akshay Kurandwade");
                scontact.setText("9766810489");

                TextView txt11 = (TextView) v.findViewById(R.id.reg);
                txt11.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Project Competition Mech":
                ImageView img21 = v.findViewById(R.id.c1);
                img21.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9421953485")); startActivity(i);
                    }
                });
                ImageView img22 = v.findViewById(R.id.c2);
                img22.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9527731240")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.dulange);
                fname.setText("Dr.S.R.Dulange");
                fcontact.setText("9421953485");
                simg.setImageResource(R.drawable.salave);
                sname.setText("Mr.Sumit Salave");
                scontact.setText("9527731240");

                TextView txt12 = (TextView) v.findViewById(R.id.reg);
                txt12.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");


                break;


            case "Paper Presentation Mech":
                ImageView img23 = v.findViewById(R.id.c1);
                img23.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9850890208")); startActivity(i);
                    }
                });
                ImageView img24 = v.findViewById(R.id.c2);
                img24.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8237289505")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.naik);
                fname.setText("Prof.S.B.Naik");
                fcontact.setText("9850890208");
                simg.setImageResource(R.drawable.vasagadekar);
                sname.setText("Ms.Akshay Vasagadekar");
                scontact.setText("8237289505");

                TextView txt13 = (TextView) v.findViewById(R.id.reg);
                txt13.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Enterprise":
                ImageView img25 = v.findViewById(R.id.c1);
                img25.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9823013172")); startActivity(i);
                    }
                });
                ImageView img26 = v.findViewById(R.id.c2);
                img26.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8275267733")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.tuljapure);
                fname.setText("Dr.S.B.Tuljapure");
                fcontact.setText("9823013172");
                simg.setImageResource(R.drawable.sujit);
                sname.setText("Mr.Sujit Patil");
                scontact.setText("8275267733");

                TextView txt14 = (TextView) v.findViewById(R.id.reg);
                txt14.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Best From Waste":
                ImageView img27 = v.findViewById(R.id.c1);
                img27.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9823013172")); startActivity(i);
                    }
                });
                ImageView img28 = v.findViewById(R.id.c2);
                img28.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:7972971907")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.tuljapure);
                fname.setText("Dr.S.B.Tuljapure");
                fcontact.setText("9823013172");
                simg.setImageResource(R.drawable.sidnale);
                sname.setText("Ms.Shreya Sidnale");
                scontact.setText("7972971907");

                TextView txt15 = (TextView) v.findViewById(R.id.reg);
                txt15.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;













            case "EcoCrete":
                ImageView img29 = v.findViewById(R.id.c1);
                img29.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9423065280")); startActivity(i);
                    }
                });
                ImageView img30 = v.findViewById(R.id.c2);
                img30.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:7776952236")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.konapure);
                fname.setText("Prof. C.G. Konapure");
                fcontact.setText("9423065280");
                simg.setImageResource(R.drawable.rahul);
                sname.setText("Mr. Rahul Matade");
                scontact.setText("7776952236");

                TextView txt16 = (TextView) v.findViewById(R.id.reg);
                txt16.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;


            case "DreamCAD":
                ImageView img31 = v.findViewById(R.id.c1);
                img31.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9890637119")); startActivity(i);
                    }
                });
                ImageView img32 = v.findViewById(R.id.c2);
                img32.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9158403903")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.dhan);
                fname.setText("Prof. P.V. Dhanshetti");
                fcontact.setText("9890637119");
                simg.setImageResource(R.drawable.ket);
                sname.setText("Miss Divya Ket");
                scontact.setText("9158403903");

                TextView txt17 = (TextView) v.findViewById(R.id.reg);
                txt17.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "InfraCivil":
                ImageView img33 = v.findViewById(R.id.c1);
                img33.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9561568456")); startActivity(i);
                    }
                });
                ImageView img34 = v.findViewById(R.id.c2);
                img34.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9422143816")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.skkulkarni);
                fname.setText("Prof. S. K. Kulkarni");
                fcontact.setText("9561568456");
                simg.setImageResource(R.drawable.mayur);
                sname.setText("Mr. Mayur Khivasara");
                scontact.setText("9422143816");

                TextView txt18 = (TextView) v.findViewById(R.id.reg);
                txt18.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Wonder Tender":
                ImageView img35 = v.findViewById(R.id.c1);
                img35.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9822402069")); startActivity(i);
                    }
                });
                ImageView img36 = v.findViewById(R.id.c2);
                img36.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9767660524")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.gosavi);
                fname.setText("Prof. S.B. Gosavi");
                fcontact.setText("9822402069");
                simg.setImageResource(R.drawable.subash);
                sname.setText("Mr. Subhash Karewar");
                scontact.setText("9767660524");

                TextView txt19 = (TextView) v.findViewById(R.id.reg);
                txt19.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Aptech Quiz":
                ImageView img37 = v.findViewById(R.id.c1);
                img37.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9763536711")); startActivity(i);
                    }
                });
                ImageView img38 = v.findViewById(R.id.c2);
                img38.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9834549986")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.ashok);
                fname.setText("Prof. Ashok Kumar");
                fcontact.setText("9763536711");
                simg.setImageResource(R.drawable.yamul);
                sname.setText("Miss Dhanlaxmi Yemul");
                scontact.setText("9834549986");

                TextView txt20 = (TextView) v.findViewById(R.id.reg);
                txt20.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Project Competition Civil":
                ImageView img39 = v.findViewById(R.id.c1);
                img39.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9011579656")); startActivity(i);
                    }
                });
                ImageView img40 = v.findViewById(R.id.c2);
                img40.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:7387124240")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.kashid);
                fname.setText("Dr. S.S Kashid");
                fcontact.setText("9011579656");
                simg.setImageResource(R.drawable.kshitij);
                sname.setText("Mr. Kshitij Dhekhane");
                scontact.setText("7387124240");

                TextView txt21 = (TextView) v.findViewById(R.id.reg);
                txt21.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Paper Presentation Civil":
                ImageView img41 = v.findViewById(R.id.c1);
                img41.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9923282288")); startActivity(i);
                    }
                });
                ImageView img42 = v.findViewById(R.id.c2);
                img42.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9373823476")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.ssdeshmukh);
                fname.setText("Prof.  S. C. Deshmukh");
                fcontact.setText("9923282288");
                simg.setImageResource(R.drawable.saniya);
                sname.setText("Miss. Saniya Makandar");
                scontact.setText("9373823476");

                TextView txt22 = (TextView) v.findViewById(R.id.reg);
                txt22.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;









            case "MCS 51":
                ImageView img43 = v.findViewById(R.id.c1);
                img43.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9860148150")); startActivity(i);
                    }
                });
                ImageView img44 = v.findViewById(R.id.c2);
                img44.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8446488726")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.vipul);
                fname.setText("Mr. Kondekar Vipul");
                fcontact.setText("9860148150");
                simg.setImageResource(R.drawable.sonam);
                sname.setText("Ms. Sonam Mashal");
                scontact.setText("8446488726");

                TextView txt23 = (TextView) v.findViewById(R.id.reg);
                txt23.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;


            case "Quizotronics":
                ImageView img45 = v.findViewById(R.id.c1);
                img45.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8378981403")); startActivity(i);
                    }
                });
                ImageView img46 = v.findViewById(R.id.c2);
                img46.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8379018117")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.vskulkarni);
                fname.setText("Mrs.V.S. Kulkarni");
                fcontact.setText("8378981403");
                simg.setImageResource(R.drawable.sharmili);
                sname.setText("Ms.Sharmili Kamble");
                scontact.setText("8379018117");

                TextView txt24 = (TextView) v.findViewById(R.id.reg);
                txt24.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Network Treasure Hunt":
                ImageView img47 = v.findViewById(R.id.c1);
                img47.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9421068108")); startActivity(i);
                    }
                });
                ImageView img48 = v.findViewById(R.id.c2);
                img48.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9545195030")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.patnaik);
                fname.setText("Mr. Patnaik P.D.R.");
                fcontact.setText("9421068108");
                simg.setImageResource(R.drawable.anuj);
                sname.setText("Mr. Anuj Pandharpatte");
                scontact.setText("9545195030");

                TextView txt25 = (TextView) v.findViewById(R.id.reg);
                txt25.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Electron Mechanics":
                ImageView img49 = v.findViewById(R.id.c1);
                img49.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9922399811")); startActivity(i);
                    }
                });
                ImageView img50 = v.findViewById(R.id.c2);
                img50.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9545161711")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.thalange);
                fname.setText("Dr. Ms. A. V. Thalange");
                fcontact.setText("9922399811");
                simg.setImageResource(R.drawable.sonal);
                sname.setText("Ms.Sonal Jamma");
                scontact.setText("9545161711");

                TextView txt26 = (TextView) v.findViewById(R.id.reg);
                txt26.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Project Presentation ENTC":
                ImageView img51 = v.findViewById(R.id.c1);
                img51.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9823776587")); startActivity(i);
                    }
                });
                ImageView img52 = v.findViewById(R.id.c2);
                img52.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8390249304")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.mergu);
                fname.setText("Dr. R.R.Mergu");
                fcontact.setText("9823776587");
                simg.setImageResource(R.drawable.utkarsha);
                sname.setText("Ms. Utkarsha Thorat");
                scontact.setText("8390249304");

                TextView txt27 = (TextView) v.findViewById(R.id.reg);
                txt27.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "MATLAB Programming":
                ImageView img53 = v.findViewById(R.id.c1);
                img53.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9422461564")); startActivity(i);
                    }
                });
                ImageView img54 = v.findViewById(R.id.c2);
                img54.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8600969535")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.gundale);
                fname.setText("Prof A. S. Gundale");
                fcontact.setText("9422461564");
                simg.setImageResource(R.drawable.vishakha);
                sname.setText("Ms. Vishakha Edke");
                scontact.setText("8600969535");

                TextView txt28 = (TextView) v.findViewById(R.id.reg);
                txt28.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Energy Contraption":
                ImageView img55 = v.findViewById(R.id.c1);
                img55.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9423331596")); startActivity(i);
                    }
                });
                ImageView img56 = v.findViewById(R.id.c2);
                img56.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9595698397")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.shelke);
                fname.setText("Dr.Mrs. Rupali J.Shelke");
                fcontact.setText("9423331596");
                simg.setImageResource(R.drawable.chippa);
                sname.setText("Mr.Vinayak Chippa");
                scontact.setText("9595698397");

                TextView txt29 = (TextView) v.findViewById(R.id.reg);
                txt29.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;

            case "Paper Presentation ENTC":
                ImageView img57 = v.findViewById(R.id.c1);
                img57.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9822112304")); startActivity(i);
                    }
                });
                ImageView img58 = v.findViewById(R.id.c2);
                img58.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:9545652244")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.rnchavan);
                fname.setText("Mr. Chavan R.N.");
                fcontact.setText("9822112304");
                simg.setImageResource(R.drawable.raj);
                sname.setText("Mr. Raj Sonawane");
                scontact.setText("9545652244");

                TextView txt30 = (TextView) v.findViewById(R.id.reg);
                txt30.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://goo.gl/forms/8hVatT3TG2gWgM2b2"));
                        startActivity(i);
                    }
                });
                reg.setText("Register");

                break;





/* -------------------------------- OUT OF THE BOX EVENTS -------------------------------------------------------- */





            case "Google It":
                ImageView img59 = v.findViewById(R.id.c1);
                img59.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:7020414837")); startActivity(i);
                    }
                });
                ImageView img60 = v.findViewById(R.id.c2);
                img60.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8888829991")); startActivity(i);
                    }
                });

                fimg.setImageResource(R.drawable.aakarshjain);
                fname.setText("Aakarsh Jain");
                fcontact.setText("7020414837");
                simg.setImageResource(R.drawable.shubhamagrawal);
                sname.setText("Shubham Agrawal");
                scontact.setText("8888829991");
                break;



            case "Logo Quiz":
                ImageView img61 = v.findViewById(R.id.c1);
                img61.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:7769882021")); startActivity(i);
                    }
                });
                ImageView img62 = v.findViewById(R.id.c2);
                img62.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("tel:8888829991")); startActivity(i);
                    }
                });


                fimg.setImageResource(R.drawable.pritampatil);
                fname.setText("Pritam Patil");
                fcontact.setText("7769882021");
                simg.setImageResource(R.drawable.shubhamagrawal);
                sname.setText("Shubham Agrawal");
                scontact.setText("8888829991");
                break;

        }
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            graphActivity= (EventActivity) context;
            graphtitle= EventActivity.getGraphtitle();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
