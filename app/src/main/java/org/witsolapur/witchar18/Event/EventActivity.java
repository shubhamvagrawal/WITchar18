package org.witsolapur.witchar18.Event;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import org.witsolapur.witchar18.R;

public class EventActivity extends AppCompatActivity {
    private ViewPager mPager4;
    private TabLayout graphtab;
    private static String graphtitle;
    private EventTabPagerAdapter eventTabPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        mPager4= (ViewPager) findViewById(R.id.pager3);
        graphtab= (TabLayout) findViewById(R.id.tab3);
        Bundle extras=getIntent().getExtras();
        graphtitle=extras.getString("graphname");
        switch (graphtitle){

            case "ASquare":
                this.setTitle("ASquare");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Code Marathon":
                this.setTitle("Code Marathon");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Web Imagika":
                this.setTitle("Web Imagika");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Project Display":
                this.setTitle("Project Display");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Paper Presentation CSE":
                this.setTitle("Paper Presentation");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Poster Making":
                this.setTitle("Poster Making");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Graphity":
                this.setTitle("Graphity");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;




            case "Expert MANu":
                this.setTitle("Expert MANu");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Catia Champ":
                this.setTitle("Catia Champ");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Deadly Follower":
                this.setTitle("Deadly Follower");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "2Fast2Furious":
                this.setTitle("2Fast2Furious");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Project Competition Mech":
                this.setTitle("Project Competition");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Paper Presentation Mech":
                this.setTitle("Paper Presentation");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Enterprise":
                this.setTitle("Enterprise");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Best From Waste":
                this.setTitle("Best From Waste");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;



            case "EcoCrete":
                this.setTitle("EcoCrete");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "DreamCAD":
                this.setTitle("DreamCAD");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "InfraCivil":
                this.setTitle("InfraCivil");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Wonder Tender":
                this.setTitle("Wonder Tender");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Aptech Quiz":
                this.setTitle("Aptech Quiz");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Project Competition Civil":
                this.setTitle("Project Competition Civil");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Paper Presentation Civil":
                this.setTitle("Paper Presentation Civil");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;




            case "MCS 51":
                this.setTitle("MCS 51");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Quizotronics":
                this.setTitle("Quizotronics");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Network Treasure Hunt":
                this.setTitle("Network Treasure Hunt");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Electron Mechanics":
                this.setTitle("Electron Mechanics");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Project Presentation ENTC":
                this.setTitle("Project Presentation ENTC");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "MATLAB Programming":
                this.setTitle("MATLAB Programming");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Energy Contraption":
                this.setTitle("Energy Contraption");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "Paper Presentation ENTC":
                this.setTitle("Paper Presenatation ENTC");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;



            case "Google It":
                this.setTitle("Google It");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Logo Quiz":
                this.setTitle("Logo Quiz");
                Glide.with(this).load(R.drawable.rhy).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

        }
        graphtab.addTab(graphtab.newTab().setText("Details"));
        graphtab.addTab(graphtab.newTab().setText("Rules"));
        graphtab.addTab(graphtab.newTab().setText("Contact"));
        eventTabPagerAdapter =new EventTabPagerAdapter(getSupportFragmentManager());
        mPager4.setAdapter(eventTabPagerAdapter);
        mPager4.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(graphtab));
        graphtab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPager4.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public static String getGraphtitle(){
        return graphtitle;
    }
}
