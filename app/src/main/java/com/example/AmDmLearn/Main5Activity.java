package com.example.AmDmLearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ListView listView = (ListView) findViewById(R.id.listview);
        final ArrayAdapter<CharSequence> adapterAnimals = ArrayAdapter.createFromResource(this, R.array.songsArray, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapterAnimals);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString(); // получаем текст нажатого элемента

                if(strText.equalsIgnoreCase(getResources().getString(R.string.Zvezda))) {
                    Intent intent = new Intent(Main5Activity.this, ZvezdaActivity.class);
                    startActivity(intent);
                }
                if(strText.equalsIgnoreCase(getResources().getString(R.string.Nikto))) {
                    Intent intent = new Intent(Main5Activity.this, NiktoActivity.class);
                    startActivity(intent);
                }
                if(strText.equalsIgnoreCase(getResources().getString(R.string.Lesnik))) {
                    Intent intent = new Intent(Main5Activity.this, LesnikActivity.class);
                    startActivity(intent);
                }
                if(strText.equalsIgnoreCase(getResources().getString(R.string.Sansara))) {
                    Intent intent = new Intent(Main5Activity.this, SansaraActivity.class);
                    startActivity(intent);
                }
                if(strText.equalsIgnoreCase(getResources().getString(R.string.Kukushka))) {
                    Intent intent = new Intent(Main5Activity.this, KukushkaActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
