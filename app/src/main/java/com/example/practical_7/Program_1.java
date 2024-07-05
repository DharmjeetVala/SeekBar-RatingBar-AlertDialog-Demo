package com.example.practical_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.practical_7.R;

public class Program_1 extends AppCompatActivity {

    SeekBar seekBar;
    TextView textsize,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program1);
        seekBar = (SeekBar) findViewById(R.id.seekbar);
        text = (TextView) findViewById(R.id.text1);
        textsize = (TextView) findViewById(R.id.text2);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                text.setTextSize(i);
                textsize.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}