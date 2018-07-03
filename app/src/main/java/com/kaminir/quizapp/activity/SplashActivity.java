package com.kaminir.quizapp.activity;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.kaminir.quizapp.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView imageView;
    private Animation animation;
    private ProgressBar progressBar;
    private ConstraintLayout layout;

    private static final int SPLASH_DURATION = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        layout = (ConstraintLayout) findViewById(R.id.splashLayout);
        imageView = (ImageView) findViewById(R.id.ivSplashIcon);
        animation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
    }
}
