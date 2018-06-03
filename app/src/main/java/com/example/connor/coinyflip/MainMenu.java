package com.example.connor.coinyflip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    public Button ButAbout;

    public void abMe(){
        ButAbout = (Button)findViewById(R.id.ButAbout);
        ButAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent aboutMe = new Intent(MainMenu.this, About.class);

                startActivity(aboutMe);
            }
        });
    }

    public Button ButPlay;

    public void pl(){
        ButPlay = (Button)findViewById(R.id.ButPlay);
        ButPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pl = new Intent(MainMenu.this, Play.class);

                startActivity(pl);
            }
        });

    }

    public Button ButRules;

    public void rls(){
        ButRules = (Button)findViewById(R.id.ButRules);
        ButRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rules = new Intent(MainMenu.this, Rules.class);

                startActivity(rules);
            }
        });
    }

    private Button Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        pl();
        abMe();
        rls();
        Exit=(Button)findViewById(R.id.Exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
