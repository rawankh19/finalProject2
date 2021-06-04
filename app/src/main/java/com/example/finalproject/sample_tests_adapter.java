package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class sample_tests_adapter extends BaseAdapter {

    private Context context;
    LayoutInflater inflter;
    ArrayList<String> samplesList;

    public sample_tests_adapter(Context context , ArrayList<String> samplesList ) {
        this.context = context;
        this.samplesList = samplesList;

    }

    @Override
    public int getCount() {
        return samplesList.size();
    }

    @Override
    public Object getItem(int position) {
        return samplesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(context).inflate(R.layout.sample_item_layout, null);

        TextView  sample_name = (TextView) view.findViewById(R.id.txt_view_sample_name);
        TextView  sample_number =(TextView)view.findViewById(R.id.txt_view_number);

        return view;
    }
}
