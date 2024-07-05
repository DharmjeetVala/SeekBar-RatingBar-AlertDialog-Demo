package com.example.practical_7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] languages = {
            "\n1. Create a simple Application that shows the use of SeekBar.\n",
            "\n2. Create a simple Application that shows the use of RatingBar.\n",
            "\n3. Create a simple Application that shows the use of Alert Dialog.\n"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView languagesListView = findViewById(R.id.languagesListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, languages);

        languagesListView.setAdapter(adapter);

        languagesListView.setOnItemClickListener((parent, view, position, id) -> {
            String language = languages[position];
            if(position == 0){
                Intent i = new Intent(this, Program_1.class);
                startActivity(i);
            } else if (position == 1) {
                Intent i = new Intent(this, Program_2.class);
                startActivity(i);
            }else {
                Intent i = new Intent(this, Program_3.class);
                startActivity(i);
            }

        });
    }
}
