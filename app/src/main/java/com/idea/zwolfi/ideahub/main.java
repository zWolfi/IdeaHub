package com.idea.zwolfi.ideahub;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.View;
import android.os.Handler;
import android.content.Intent;

public class main extends AppCompatActivity {
    protected Animation animFadeIn;
    protected ImageView imgSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        //Changing status bar color
        //Check if android version is more than 21
        if(Build.VERSION.SDK_INT >= 21)
        {
            Window window = this.getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorDarkBlue));
        }

        //Creating splash animation
        animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);

        imgSplash = findViewById(R.id.splash_logo);
        imgSplash.setVisibility(View.VISIBLE);
        imgSplash.startAnimation(animFadeIn);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent mainIntent = new Intent(main.this, mainMenu.class);
                startActivity(mainIntent);
                finish();
            }
        },5000);
    }
}
