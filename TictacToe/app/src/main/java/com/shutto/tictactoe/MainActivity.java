package com.shutto.tictactoe;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView click3, click5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  button = findViewById(R.id.buttn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BeginGame();
            }
        });

        **/

        ImageView click3 = findViewById(R.id.threes);
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byThree();
            }
        });
        ImageView click5 = findViewById(R.id.fives);
        click5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byFive();
            }
        });

    }
    /*
    public void BeginGame() {
        Intent intent = new Intent(MainActivity.this, NextActivity.class);
        startActivity(intent);
    }
    */

    public void byThree() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    public void byFive() {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
}
