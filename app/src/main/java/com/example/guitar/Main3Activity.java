package com.example.guitar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class Main3Activity extends Activity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);
            ListView lv = (ListView) findViewById(R.id.list);
            MyMonthAdapter adapter = new MyMonthAdapter(this, R.layout.adapter_item, makeMonth());
            lv.setAdapter(adapter);

        }
        MyMonth[] makeMonth() {
            MyMonth[] arr = new MyMonth[5];

            String monthArr[] = {"Звезда по имени Солнце", "Сансара", "Кукушка", "Никто не услышит", "Лесник"};
            double[] tempArr = {1, 2, 3, 4, 5};

            for (int i = 0; i < arr.length; i++) {
                MyMonth month = new MyMonth();
                month.month = monthArr[i];
                month.temp = tempArr[i];

                arr[i] = month;
            }

            return arr;





        }
}
