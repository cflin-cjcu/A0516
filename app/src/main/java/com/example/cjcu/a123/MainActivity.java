package com.example.cjcu.a123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner sp_fruit;
    private Button button;

    String[] fruit = { "apple","banana", "奇異果" ,"AAA","BBB"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        sp_fruit = findViewById(R.id.sp_fruit);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,fruit);
        //ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,fruit);
        sp_fruit.setAdapter(adapter);

    }
}
