package org.witsolapur.witchar18;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import org.witsolapur.witchar18.Event.EventMain;

import me.anwarshahriar.calligrapher.Calligrapher;

import static java.lang.System.exit;

/**
 * Created by $hubh on 2/18/2018.
 */

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.home:
                  transaction.replace(R.id.container,new QuizFragment()).commit();
                    return true;
                case R.id.schedule:
                    transaction.replace(R.id.container,new ScheduleFragment()).commit();
                    return true;
                case R.id.events:
                    transaction.replace(R.id.container,new EventMain()).commit();
                    return true;
                case R.id.map:
                    transaction.replace(R.id.container,new MapFragment()).commit();
                    return true;
                case R.id.info:
                    transaction.replace(R.id.container,new InfoFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setElevation(0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.events);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container,new EventMain()).commit();

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"productsans.ttf",true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu main) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, main);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.aboutus:
                Intent intent = new Intent(MainActivity.this,Aboutus.class);
                startActivity(intent);
                return true;
            case R.id.gallery:
                Intent intent2 = new Intent(MainActivity.this, org.witsolapur.witchar18.Gallery.MainActivity.class);
                startActivity(intent2);
                return true;
            case R.id.privacypolicy:
                Intent intent3 = new Intent(MainActivity.this,Privacy.class);
                startActivity(intent3);
                return true;
            case R.id.payment:
                Intent intent4 = new Intent(MainActivity.this,Payment.class);
                startActivity(intent4);
                return true;
            case R.id.exit:
                exit(0);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);
        }
    }
}
