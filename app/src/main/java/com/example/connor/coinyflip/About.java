package com.example.connor.coinyflip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    public Button Exit2;

    public Button ButPlay2;

    public void pl2(){
        ButPlay2 = (Button)findViewById(R.id.ButPlay2);
        ButPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pl2 = new Intent(About.this, Play.class);

                startActivity(pl2);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        pl2();
        Exit2 = (Button)findViewById(R.id.Exit2);
        Exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

}
