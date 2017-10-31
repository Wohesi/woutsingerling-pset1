package com.example.gebruiker.mrpotatohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // INSTANCE STATES
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // De state van de button opslaan
        String imageViewValue = textView.getImage().toString();
        outState.putString("imageView", "imageViewValue");

    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

    }

    public void hatClicked(View view) {
        ImageView hat = findViewById(R.id.imageViewHat);

        if (hat.getVisibility() == View.VISIBLE) {
            hat.setVisibility(view.INVISIBLE);
        } else {
            hat.setVisibility(view.VISIBLE);
        }

    }

    public void earsClicked(View view) {
        ImageView ears = findViewById(R.id.imageViewEars);

        if (ears.getVisibility() == View.VISIBLE) {
            ears.setVisibility(view.INVISIBLE);
        } else {
            ears.setVisibility(view.VISIBLE);
        }
    }

    public void armsClicked(View view) {
        ImageView arms = findViewById(R.id.imageViewArms);

        if (arms.getVisibility() == View.VISIBLE) {
            arms.setVisibility(view.INVISIBLE);
        } else {
            arms.setVisibility(view.VISIBLE);
        }
    }

    public void shoesClicked(View view) {
        ImageView shoes = findViewById(R.id.imageViewShoes);

        if (shoes.getVisibility() == View.VISIBLE) {
            shoes.setVisibility(view.INVISIBLE);
        } else {
            shoes.setVisibility(view.VISIBLE);
        }
    }



    public void mouthClicked(View view) {
        ImageView mouth = findViewById(R.id.imageViewMouth);

        if (mouth.getVisibility() == View.VISIBLE) {
            mouth.setVisibility(view.INVISIBLE);
        } else {
            mouth.setVisibility(view.VISIBLE);
        }
    }

    public void eyebrowsClicked(View view) {
        ImageView eb = findViewById(R.id.imageViewEyebrows);

        if (eb.getVisibility() == View.VISIBLE) {
            eb.setVisibility(view.INVISIBLE);
        } else {
            eb.setVisibility(view.VISIBLE);
        }
    }

    public void eyesClicked(View view) {
        ImageView eyes = findViewById(R.id.imageViewEyes);

        if (eyes.getVisibility() == View.VISIBLE) {
            eyes.setVisibility(view.INVISIBLE);
        } else {
            eyes.setVisibility(view.VISIBLE);
        }
    }

    public void glassesClicked(View view) {
        ImageView glasses = findViewById(R.id.imageViewGlasses);

        if (glasses.getVisibility() == View.VISIBLE) {
            glasses.setVisibility(view.INVISIBLE);
        } else {
            glasses.setVisibility(view.VISIBLE);
        }
    }

    public void mustacheClicked(View view) {
        ImageView mustache = findViewById(R.id.imageViewMustache);

        if (mustache.getVisibility() == View.VISIBLE) {
            mustache.setVisibility(view.INVISIBLE);
        } else {
            mustache.setVisibility(view.VISIBLE);
        }
    }

    public void noseClicked(View view) {
        ImageView nose = findViewById(R.id.imageViewNose);

        if (nose.getVisibility() == View.VISIBLE) {
            nose.setVisibility(view.INVISIBLE);
        } else {
            nose.setVisibility(view.VISIBLE);
        }
    }
}