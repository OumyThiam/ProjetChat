package com.example.projetchat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;


import android.widget.ImageView;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.media.MediaPlayer;

import android.widget.Button;



import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    private Button button;

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);




        final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.my_sound);

        final Button playCatMeow = (Button) this.findViewById(R.id.play_cat_meow);

        playCatMeow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                catSoundMediaPlayer.start();
            }
        });
        button = (Button)

                findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();


            }
        });


    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }


}