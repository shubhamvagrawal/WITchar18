package org.witsolapur.witchar18;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

/**
 * Created by $hubh on 2/18/2018.
 */


public class SplashActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        //getSupportActionBar().hide();

        videoView = (VideoView)findViewById(R.id.videoView);

        Uri video = Uri.parse("android.resource://"+getPackageName() +"/" + R.raw.start);
        videoView.setVideoURI(video);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
startActivity(new Intent(SplashActivity.this, MainActivity.class ));
                finish();
            }
        });
        videoView.start();
    }
}
