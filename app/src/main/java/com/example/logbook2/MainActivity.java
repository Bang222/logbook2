package com.example.logbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button nextButton, previousButton;
    int i = 0;
    private int[] images = new int[] {R.drawable.image1, R.drawable.image2, R.drawable.image3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        previousButton = findViewById(R.id.PreviousButton);
        nextButton = findViewById(R.id.NextButton);
        imageView.setImageResource(images[i]);
        if(i == 0) {
            previousButton.setVisibility(View.GONE);
        }
    }

    public void onClickedNext(View view) {
        if(i < images.length - 1) {
            i++;
            imageView.setImageResource(images[i]);
            if (i == images.length - 1) {
                nextButton.setVisibility(View.GONE);
            } else {
                previousButton.setVisibility(View.VISIBLE);
            }
        }
    }

    public void onClickedPrevious(View view) {
        if (i > 0) {
            i--;
            imageView.setImageResource(images[i]);
            if (i == 0) {
                previousButton.setVisibility(View.GONE);
            } else {
                nextButton.setVisibility(view.VISIBLE);
            }
        }
    }
}