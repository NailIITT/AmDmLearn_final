package com.example.guitar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyMonthAdapter extends ArrayAdapter<MyMonth> {
    public MyMonthAdapter(@NonNull Context context, int adapter_item, MyMonth[] arr) {
        super(context, R.layout.adapter_item, arr);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final MyMonth month = getItem(position);
        if(convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item,null);
        }
        ((TextView) convertView.findViewById(R.id.textView)).setText(month.month);
        ((TextView) convertView.findViewById(R.id.textView2)).setText(String.valueOf(month.temp));

        if(month.temp==1)
            ((ImageView) convertView.findViewById(R.id.image_view)).setImageResource(R.drawable.first);
        else if(month.temp==2)
            ((ImageView) convertView.findViewById(R.id.image_view)).setImageResource(R.drawable.second);
        else if(month.temp==3)
            ((ImageView) convertView.findViewById(R.id.image_view)).setImageResource(R.drawable.third);
        else if(month.temp==4)
            ((ImageView) convertView.findViewById(R.id.image_view)).setImageResource(R.drawable.forth);
        else if(month.temp==5)
            ((ImageView) convertView.findViewById(R.id.image_view)).setImageResource(R.drawable.fifth);

        CheckBox ch = (CheckBox) convertView.findViewById(R.id.checkbox);
        ch.setChecked(month.like);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                month.like = ((CheckBox) v).isChecked();
            }
        });
        return convertView;
    }
}
