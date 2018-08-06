package com.example.android.musicgeneres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent to popactivity

        TextView popTextView = (TextView) findViewById(R.id.pop);
        popTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popCategory = new Intent(MainActivity.this, pop.class);
                startActivity(popCategory);
            }
        });

        //Intent to rockactivity

        TextView rockTextView = (TextView) findViewById(R.id.rock);
        rockTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockCategory = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockCategory);
            }
        });

        //Intent to jazzactivity

        TextView jazzTextView = (TextView) findViewById(R.id.jazz);
        jazzTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jazzCategory = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(jazzCategory);
            }
        });

        //Intent to rapactivity

        TextView rapTextView = (TextView) findViewById(R.id.rap);
        rapTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rapCategory = new Intent(MainActivity.this, RapActivity.class);
                startActivity(rapCategory);

            }
        });
    }
}
