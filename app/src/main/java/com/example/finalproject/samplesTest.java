package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class samplesTest extends AppCompatActivity {

    ListView list_view_sample_tests;
    ArrayList<String> samples_array_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samples_test);

        list_view_sample_tests = findViewById(R.id.list_view_sample_tests);

        //Array with samples number
       // samples_array_list= new ArrayList<>();
        //samples_array_list.add("نموذج رقم 1 ");
        //samples_array_list.add("نموذج رقم 2 ");
        //samples_array_list.add("نموذج رقم 3 ");
       // samples_array_list.add("نموذج رقم 4 ");
       // samples_array_list.add("نموذج رقم 5 ");
        //samples_array_list.add("نموذج رقم 6 ");
        //samples_array_list.add("نموذج رقم 7 ");


        sample_tests_adapter samples_adapter = new sample_tests_adapter(getApplicationContext(), samples_array_list);
        list_view_sample_tests.setAdapter(samples_adapter);
}

    }
