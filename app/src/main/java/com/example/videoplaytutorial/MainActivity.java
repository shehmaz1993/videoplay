package com.example.videoplaytutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
     private VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoview=(VideoView)findViewById(R.id.video1);
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoplayback);
        videoview.setVideoURI(uri);
        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        videoview.start();
    }
}
