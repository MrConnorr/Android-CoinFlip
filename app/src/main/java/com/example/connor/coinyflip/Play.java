package com.example.connor.coinyflip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Play extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private  ImageView coin;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        ex3();
        coin = (ImageView) findViewById(R.id.coin);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCoin();
            }
        });
    }

    private void flipCoin() {
        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(1000);
        fadeOut.setFillAfter(true);
        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                coin.setImageResource(RANDOM.nextFloat() > 0.5f ? R.drawable.tails : R.drawable.heads);

                Animation fadeIn = new AlphaAnimation(0, 1);
                fadeIn.setInterpolator(new DecelerateInterpolator());
                fadeIn.setDuration(3000);
                fadeIn.setFillAfter(true);

                coin.startAnimation(fadeIn);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        coin.startAnimation(fadeOut);
    }

    public Button Exit3;

    public void ex3(){
        Exit3 = (Button)findViewById(R.id.Exit3);
        Exit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exr3 = new Intent(Play.this, About.class);

                startActivity(exr3);
            }
        });

    }

}
