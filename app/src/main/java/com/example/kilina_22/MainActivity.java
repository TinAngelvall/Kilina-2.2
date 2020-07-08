package com.example.kilina_22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

        init();
    }

    private void init() {
        final TextView output = (TextView) findViewById(R.id.output);

        method_random();
        String address_image = getString(R.string.output, number);
        output.setText(address_image);

        buttonAlong = findViewById(R.id.btn_along);
        buttonBack = findViewById(R.id.btn_back);

        buttonAlong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method_random();
                String address_image = getString(R.string.output, number);
                output.setText(address_image);
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void method_random() {

        Random rand = new Random();
        number = rand.nextInt(101);
        int result = number;
    }
}
