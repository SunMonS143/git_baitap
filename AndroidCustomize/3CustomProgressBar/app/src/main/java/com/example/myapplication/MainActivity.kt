package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        ProgressBar progressBar1 = findViewById(R.id.progress_bar_1);
        ProgressBar progressBar2 = findViewById(R.id.progress_bar_2);
        ProgressBar progressBar3 = findViewById(R.id.progress_bar_3);
        ProgressBar progressBar4 = findViewById(R.id.progress_bar_4);
        ProgressBar progressBar5 = findViewById(R.id.progress_bar_5);
        ProgressBar progressBar6 = findViewById(R.id.progress_bar_6);
        ProgressBar progressBar7 = findViewById(R.id.progress_bar_7);
        ProgressBar progressBar8 = findViewById(R.id.progress_bar_8);
        ProgressBar progressBar9 = findViewById(R.id.progress_bar_9);
        ProgressBar progressBar10 = findViewById(R.id.progress_bar_10);
        ProgressBar progressBar11 = findViewById(R.id.progress_bar_11);
        ProgressBar progressBar12 = findViewById(R.id.progress_bar_12);

        progressBar1.setIndeterminateDrawable(new RotatingPlane());
        progressBar2.setIndeterminateDrawable(new DoubleBounce());
        progressBar3.setIndeterminateDrawable(new Wave());
        progressBar4.setIndeterminateDrawable(new WanderingCubes());
        progressBar5.setIndeterminateDrawable(new Pulse	());
        progressBar6.setIndeterminateDrawable(new ChasingDots());
        progressBar7.setIndeterminateDrawable(new ThreeBounce());
        progressBar8.setIndeterminateDrawable(new Circle());
        progressBar9.setIndeterminateDrawable(new CubeGrid());
        progressBar10.setIndeterminateDrawable(new FadingCircle());
        progressBar11.setIndeterminateDrawable(new FoldingCube());
        progressBar12.setIndeterminateDrawable(new RotatingCircle());


    }
}