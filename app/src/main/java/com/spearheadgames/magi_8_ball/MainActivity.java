package com.spearheadgames.magi_8_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_8Ball);
        Button askButton = findViewById(R.id.askButton);

        final int [] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random numberGenerator = new Random();
                int ranNumber = numberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[ranNumber]);
            }
        });

    }
}
