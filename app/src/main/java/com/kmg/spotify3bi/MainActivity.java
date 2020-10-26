package com.kmg.spotify3bi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.ivCapa);

        Glide.with(this).load("https://img.youtube.com/vi/tc-bxi26GSA/0.jpg").into(imageView);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.watermelon_sugar);
    }



    public void playMusic(View view) {
        if(mediaPlayer == null)
            return;
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            ((ImageView)view).setImageResource(R.drawable.ic_play_circle_filled_black_24dp);
        } else {
            mediaPlayer.start();
            ((ImageView)view).setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
        }

    }
}


