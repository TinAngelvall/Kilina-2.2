package com.example.kilina_22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button buttonAlong;
    private Button buttonBack;
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        methodRandom();
        init();
    }

    private void init() {

        output();

        buttonAlong = findViewById(R.id.btn_along);
        buttonBack = findViewById(R.id.btn_back);

        buttonAlong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);

                output();

            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, MainActivity.class);
                finish();
            }
        });
    }

    private void output() {

        final TextView output = (TextView) findViewById(R.id.output);
        String addressImage = getString(R.string.output, number);
        output.setText(addressImage);
    }

    private void methodRandom() {

        Random rand = new Random();
        number = rand.nextInt(101);
        int result = number;
    }
}
