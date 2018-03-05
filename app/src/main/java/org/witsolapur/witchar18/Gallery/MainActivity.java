package org.witsolapur.witchar18.Gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.witsolapur.witchar18.R;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class MainActivity extends AppCompatActivity {

    private FeatureCoverFlow coverFlow;
    private CoverFlowAdapter adapter;
    private ArrayList<Game> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_main);
        coverFlow = (FeatureCoverFlow) findViewById(R.id.coverflow);

        settingDummyData();
        adapter = new CoverFlowAdapter(this, games);
        coverFlow.setAdapter(adapter);
        coverFlow.setOnScrollPositionListener(onScrollListener());
    }

    private FeatureCoverFlow.OnScrollPositionListener onScrollListener() {
        return new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                Log.v("MainActiivty", "position: " + position);
            }

            @Override
            public void onScrolling() {
                Log.i("MainActivity", "scrolling");
            }
        };
    }

    private void settingDummyData() {
        games = new ArrayList<>();
        games.add(new Game(R.drawable.g1, "WITchar 18"));
        games.add(new Game(R.drawable.g2, "WITchar 18"));
        games.add(new Game(R.drawable.g3, "WITchar 18"));
        games.add(new Game(R.drawable.g4, "WITchar 18"));
        games.add(new Game(R.drawable.g5, "WITchar 18"));
        games.add(new Game(R.drawable.g6, "WITchar 18"));
        games.add(new Game(R.drawable.g7, "WITchar 18"));
        games.add(new Game(R.drawable.g8, "WITchar 18"));
        games.add(new Game(R.drawable.g9, "WITchar 18"));
        games.add(new Game(R.drawable.g10, "WITchar 18"));
        games.add(new Game(R.drawable.g11, "WITchar 18"));
        games.add(new Game(R.drawable.g12, "WITchar 18"));
        games.add(new Game(R.drawable.g13, "WITchar 18"));
    }
}