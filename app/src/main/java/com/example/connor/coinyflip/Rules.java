package com.example.connor.coinyflip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rules extends AppCompatActivity {

    public Button Play3;

    public void pl3(){
        Play3 = (Button)findViewById(R.id.ButPlay3);
        Play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pl3 = new Intent(Rules.this, Play.class);

                startActivity(pl3);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        pl3();
    }
}
