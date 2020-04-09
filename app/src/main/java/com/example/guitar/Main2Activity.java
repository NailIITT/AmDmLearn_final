package com.example.guitar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class Main2Activity extends AppCompatActivity {
    Button Am;
    ImageButton am1;
    ImageButton am2;
    ImageButton am3;
    Button Dm;
    ImageButton dm1;
    ImageButton dm2;
    ImageButton dm3;
    Button Em;
    ImageButton em2;
    Button C;
    ImageButton c3;
    Button G;
    ImageButton g2;
    Button E;
    ImageButton e1;
    Button D;
    ImageButton d2;
    Button A;
    ImageButton a1;
    MediaPlayer am;
    MediaPlayer dm;
    MediaPlayer a;
    MediaPlayer c;
    MediaPlayer d;
    MediaPlayer e;
    MediaPlayer g;
    MediaPlayer em;

    boolean flag = true;
    int k = 0;
    public void soundPlay(MediaPlayer sound){
        sound.start();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toolbar  toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Am = (Button) findViewById(R.id.am);
        am1 = (ImageButton) findViewById(R.id.am1);
        am2 = (ImageButton) findViewById(R.id.am2);
        am3 = (ImageButton) findViewById(R.id.am3);
        dm1 = (ImageButton) findViewById(R.id.dm1);
        dm3 = (ImageButton) findViewById(R.id.dm3);
        Dm = (Button) findViewById(R.id.dm);
        Em = (Button) findViewById(R.id.em);
        em2 = (ImageButton) findViewById(R.id.em2);
        C = (Button) findViewById(R.id.c);
        c3 = (ImageButton) findViewById(R.id.c3);
        G = (Button) findViewById(R.id.g);
        g2 = (ImageButton) findViewById(R.id.g2);
        E = (Button) findViewById(R.id.e);
        e1 = (ImageButton) findViewById(R.id.e1);
        D = (Button) findViewById(R.id.d);
        d2 = (ImageButton) findViewById(R.id.d2);
        A = (Button) findViewById(R.id.a);
        a1 = (ImageButton) findViewById(R.id.a1);
        am = MediaPlayer.create(this, R.raw.am_m);
        c = MediaPlayer.create(this, R.raw.c_m);
        d = MediaPlayer.create(this, R.raw.d_m);
        dm = MediaPlayer.create(this, R.raw.dm_m);
        e = MediaPlayer.create(this, R.raw.e_m);
        a = MediaPlayer.create(this, R.raw.a_m);
        em = MediaPlayer.create(this, R.raw.em_m);
        g = MediaPlayer.create(this, R.raw.g_m);


        final ImageButton.OnClickListener oclAm = new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                k++;

                if (k % 2 != 0) {
                    am1.setImageResource(R.drawable.ic_launcher_foreground);
                    am2.setImageResource(R.drawable.ic_launcher_foreground);
                    am3.setImageResource(R.drawable.ic_launcher_foreground);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                    soundPlay(am);


                } else {
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                    flag = !flag;
                }


            }
        };
        Am.setOnClickListener(oclAm);
        final ImageButton.OnClickListener oclDm = new View.OnClickListener() {
            int k = 0;

            @Override
            public void onClick(View v) {
                k++;
                if (k % 2 != 0) {
                    dm1.setImageResource(R.drawable.ic_launcher_foreground);
                    dm3.setImageResource(R.drawable.ic_launcher_foreground);
                    am2.setImageResource(R.drawable.ic_launcher_foreground);
                    am1.setImageResource(0);

                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);

                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);


                    am1.setImageResource(0);
                    am3.setImageResource(0);
                    soundPlay(dm);
                } else {
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);

                }


            }
        };
        Dm.setOnClickListener(oclDm);
        final ImageButton.OnClickListener oclEm = new View.OnClickListener() {
            int k = 0;

            @Override
            public void onClick(View v) {
                k++;
                if (k % 2 != 0) {
                    em2.setImageResource(R.drawable.ic_launcher_foreground);
                    am3.setImageResource(R.drawable.ic_launcher_foreground);
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                    soundPlay(em);
                } else {
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                }


            }
        };
        Em.setOnClickListener(oclEm);
        final ImageButton.OnClickListener oclC = new View.OnClickListener() {
            int k = 0;

            @Override
            public void onClick(View v) {
                k++;
                if (k % 2 != 0) {
                    am1.setImageResource(R.drawable.ic_launcher_foreground);
                    c3.setImageResource(R.drawable.ic_launcher_foreground);
                    am3.setImageResource(R.drawable.ic_launcher_foreground);
                    am2.setImageResource(0);
                    em2.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                    soundPlay(c);

                } else {
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                }


            }
        };
        C.setOnClickListener(oclC);
        final ImageButton.OnClickListener oclG = new View.OnClickListener() {
            int k = 0;

            @Override
            public void onClick(View v) {
                k++;
                if (k % 2 != 0) {
                    dm1.setImageResource(R.drawable.ic_launcher_foreground);
                    g2.setImageResource(R.drawable.ic_launcher_foreground);
                    em2.setImageResource(R.drawable.ic_launcher_foreground);
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    c3.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                    soundPlay(g);


                } else {
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                }


            }
        };
        G.setOnClickListener(oclG);
        final ImageButton.OnClickListener oclE = new View.OnClickListener() {
            int k = 0;

            @Override
            public void onClick(View v) {
                k++;
                if (k % 2 != 0) {
                    e1.setImageResource(R.drawable.ic_launcher_foreground);
                    am3.setImageResource(R.drawable.ic_launcher_foreground);
                    em2.setImageResource(R.drawable.ic_launcher_foreground);
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                    soundPlay(e);


                } else {
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                }


            }
        };
        E.setOnClickListener(oclE);
        final ImageButton.OnClickListener oclD = new View.OnClickListener() {
            int k = 0;

            @Override
            public void onClick(View v) {
                k++;
                if (k % 2 != 0) {
                    am1.setImageResource(R.drawable.ic_launcher_foreground);
                    am2.setImageResource(R.drawable.ic_launcher_foreground);
                    d2.setImageResource(R.drawable.ic_launcher_foreground);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                    soundPlay(d);


                } else {
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                }


            }
        };
        D.setOnClickListener(oclD);
        final ImageButton.OnClickListener oclA = new View.OnClickListener() {
            int k = 0;

            @Override
            public void onClick(View v) {
                k++;
                if (k % 2 != 0) {
                    a1.setImageResource(R.drawable.ic_launcher_foreground);
                    am2.setImageResource(R.drawable.ic_launcher_foreground);
                    am3.setImageResource(R.drawable.ic_launcher_foreground);
                    am1.setImageResource(0);

                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);

                    dm3.setImageResource(0);
                    soundPlay(a);


                } else {
                    am1.setImageResource(0);
                    am2.setImageResource(0);
                    am3.setImageResource(0);
                    em2.setImageResource(0);
                    c3.setImageResource(0);
                    g2.setImageResource(0);
                    dm1.setImageResource(0);
                    e1.setImageResource(0);
                    d2.setImageResource(0);
                    a1.setImageResource(0);
                    dm3.setImageResource(0);
                }


            }
        };
        A.setOnClickListener(oclA);



    }


@Override
        public void onBackPressed(){
        try {
            Intent intent = new Intent (Main2Activity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
        catch(Exception e) {
        }
        }

}



