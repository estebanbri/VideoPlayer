package com.estebanb123.videoplayer;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.VideoView;
import android.widget.MediaController; //MediaController te da los botones de play,avanzar,retroceder el video



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView maguiVideoViewOBJ = (VideoView)findViewById(R.id.maguiVideoView);
        maguiVideoViewOBJ.setVideoPath("https://www.thenewboston.com/forum/project_files/006_testVideo.mp4");

        //Player controller(es opcional si vos queres meterle los botones si no no les pones los botones y funca igual)
        MediaController mediaControlerOBJ = new MediaController(this);
        mediaControlerOBJ.setAnchorView(maguiVideoViewOBJ);
        maguiVideoViewOBJ.setMediaController(mediaControlerOBJ);

        maguiVideoViewOBJ.start();
    }


}
