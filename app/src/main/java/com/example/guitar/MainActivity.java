package com.example.guitar;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button chords = (Button) findViewById(R.id.Chords);
        Button songs = (Button) findViewById(R.id.Songs);
        Button game = (Button) findViewById((R.id.Game));


    }
    public void toDo(View v){

            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);

    }
    public void toDo2(View v){
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
    public void toDo3(View v){
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);

    }


}