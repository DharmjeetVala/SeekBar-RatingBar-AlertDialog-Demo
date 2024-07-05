package com.example.practical_7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Program_3 extends AppCompatActivity {

    Button alertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program3);

        alertButton = findViewById(R.id.alertButton);

        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlertBox();
            }
        });

    }

    private void openAlertBox(){

        AlertDialog.Builder builder = new AlertDialog.Builder(Program_3.this);
        builder.setTitle("Exit Program");
        builder.setMessage("Are you sure want to exit?");
        builder.setIcon(R.drawable.exitapp);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }
}