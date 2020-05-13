package com.example.guitar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Main4Activity extends AppCompatActivity {
    ImageButton image;
    RelativeLayout layout;
    Button start;
    Button end;
    int b=0;
    MediaPlayer wrong;
    MediaPlayer correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button start = (Button) findViewById(R.id.start);

        final ImageButton image = (ImageButton) findViewById(R.id.image);


        final Button em = (Button) findViewById(R.id.em);
        final Button a = (Button) findViewById(R.id.a);
        final Button am = (Button) findViewById(R.id.am);
        final Button c = (Button) findViewById(R.id.c);
        final Button d = (Button) findViewById(R.id.d);
        final Button e = (Button) findViewById(R.id.e);
        final Button g = (Button) findViewById(R.id.g);
        final Button dm = (Button) findViewById(R.id.dm);
        final Button end = (Button) findViewById(R.id.end);
        correct = MediaPlayer.create(this, R.raw.correct);
        wrong = MediaPlayer.create(this, R.raw.wrong);



        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                image.setImageResource(R.drawable.em);
                    em.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(b==0){
                                correct.start();
                            image.setImageResource(R.drawable.a);
                            b=1;}
                            else {
                                wrong.start();
                            }




                        }
                    });

                    a.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(b==1) {
                                correct.start();
                            image.setImageResource(R.drawable.am);
                            b=2; }                             else {
                                wrong.start();
                            }

                        }
                    });
                am.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(b==2){
                            correct.start();
                            image.setImageResource(R.drawable.c);
                            b=3;
                        }                            else {
                            wrong.start();
                        }

                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(b==3){
                            correct.start();
                            image.setImageResource(R.drawable.d);
                            b=4;
                        }                             else {
                            wrong.start();
                        }

                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (b==4){
                            correct.start();
                            image.setImageResource(R.drawable.e);
                            b=5;
                        }                             else {
                            wrong.start();
                        }

                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(b==5){
                            correct.start();
                            image.setImageResource(R.drawable.g);
                            b=6;
                        }                             else {
                            wrong.start();
                        }

                    }
                });
                g.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (b==6){
                            correct.start();
                            image.setImageResource(R.drawable.dm);
                            b=7;
                        }                             else {
                            wrong.start();
                        }

                    }
                });
                dm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(b==7){
                            correct.start();
                            image.setImageResource(R.drawable.em);
                            b=0;
                        }                             else {
                            wrong.start();
                        }


                    }
                });






            }
        });




        }


                }