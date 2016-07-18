package com.futurepower.baseadapterhoder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);

        final ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            data.add("ListView:" + i);
        }

        listView.setAdapter(new TestAdapter(data));
    }
}
