package com.example.gebruiker.mrpotatohead;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int image;
    ImageView imageViewHat;
    ImageView imageViewEars;
    ImageView imageViewArms;
    ImageView imageViewNose;
    ImageView imageViewGlasses;
    ImageView imageViewShoes;
    ImageView imageViewMouth;
    ImageView imageViewMustache;
    ImageView imageViewEyes;
    ImageView imageViewEyebrows;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewHat = (ImageView) findViewById(R.id.imageViewHat);
        imageViewEars = (ImageView) findViewById(R.id.imageViewEars);
        imageViewArms = (ImageView) findViewById(R.id.imageViewArms);
        imageViewNose = (ImageView) findViewById(R.id.imageViewNose);
        imageViewGlasses = (ImageView) findViewById(R.id.imageViewGlasses);
        imageViewShoes = (ImageView) findViewById(R.id.imageViewShoes);
        imageViewMouth = (ImageView) findViewById(R.id.imageViewMouth);
        imageViewMustache = (ImageView) findViewById(R.id.imageViewMustache);
        imageViewEyes = (ImageView) findViewById(R.id.imageViewEyes);
        imageViewEyebrows = (ImageView) findViewById(R.id.imageViewEyebrows);


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Hat", imageViewHat.getVisibility());
        outState.putInt("Ears", imageViewEars.getVisibility());
        outState.putInt("Arms", imageViewArms.getVisibility());
        outState.putInt("Nose", imageViewNose.getVisibility());
        outState.putInt("Glasses", imageViewGlasses.getVisibility());
        outState.putInt("Shoes", imageViewShoes.getVisibility());
        outState.putInt("Mouth", imageViewMouth.getVisibility());
        outState.putInt("Mustache", imageViewMustache.getVisibility());
        outState.putInt("Eyes", imageViewEyes.getVisibility());
        outState.putInt("Eyebrows", imageViewEyebrows.getVisibility());

    }

    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        imageViewHat.setVisibility(inState.getInt("Hat"));
        imageViewEars.setVisibility(inState.getInt("Ears"));
        imageViewArms.setVisibility(inState.getInt("Arms"));
        imageViewNose.setVisibility(inState.getInt("Nose"));
        imageViewGlasses.setVisibility(inState.getInt("Glasses"));
        imageViewShoes.setVisibility(inState.getInt("Shoes"));
        imageViewMouth.setVisibility(inState.getInt("Mouth"));
        imageViewMustache.setVisibility(inState.getInt("Mustache"));
        imageViewEyes.setVisibility(inState.getInt("Eyes"));
        imageViewEyebrows.setVisibility(inState.getInt("Eyebrows"));

    }


    public void hatClicked(View view) {
        imageViewHat = findViewById(R.id.imageViewHat);

        if (imageViewHat.getVisibility() == View.VISIBLE) {
            imageViewHat.setVisibility(view.INVISIBLE);
        } else {
            imageViewHat.setVisibility(view.VISIBLE);
        }

    }

    public void earsClicked(View view) {
        imageViewEars = findViewById(R.id.imageViewEars);

        if (imageViewEars.getVisibility() == View.VISIBLE) {
            imageViewEars.setVisibility(view.INVISIBLE);
        } else {
            imageViewEars.setVisibility(view.VISIBLE);
        }
    }

    public void armsClicked(View view) {
        imageViewArms = findViewById(R.id.imageViewArms);

        if (imageViewArms.getVisibility() == View.VISIBLE) {
            imageViewArms.setVisibility(view.INVISIBLE);
        } else {
            imageViewArms.setVisibility(view.VISIBLE);
        }
    }

    public void shoesClicked(View view) {
        imageViewShoes = findViewById(R.id.imageViewShoes);

        if (imageViewShoes.getVisibility() == View.VISIBLE) {
            imageViewShoes.setVisibility(view.INVISIBLE);
        } else {
            imageViewShoes.setVisibility(view.VISIBLE);
        }
    }



    public void mouthClicked(View view) {
        imageViewMouth = findViewById(R.id.imageViewMouth);

        if (imageViewMouth.getVisibility() == View.VISIBLE) {
            imageViewMouth.setVisibility(view.INVISIBLE);
        } else {
            imageViewMouth.setVisibility(view.VISIBLE);
        }
    }

    public void eyebrowsClicked(View view) {
        imageViewEyebrows = findViewById(R.id.imageViewEyebrows);

        if (imageViewEyebrows.getVisibility() == View.VISIBLE) {
            imageViewEyebrows.setVisibility(view.INVISIBLE);
        } else {
            imageViewEyebrows.setVisibility(view.VISIBLE);
        }
    }

    public void eyesClicked(View view) {
        imageViewEyes = findViewById(R.id.imageViewEyes);

        if (imageViewEyes.getVisibility() == View.VISIBLE) {
            imageViewEyes.setVisibility(view.INVISIBLE);
        } else {
            imageViewEyes.setVisibility(view.VISIBLE);
        }
    }

    public void glassesClicked(View view) {
        imageViewGlasses = findViewById(R.id.imageViewGlasses);

        if (imageViewGlasses.getVisibility() == View.VISIBLE) {
            imageViewGlasses.setVisibility(view.INVISIBLE);
        } else {
            imageViewGlasses.setVisibility(view.VISIBLE);
        }
    }

    public void mustacheClicked(View view) {
        imageViewMustache = findViewById(R.id.imageViewMustache);

        if (imageViewMustache.getVisibility() == View.VISIBLE) {
            imageViewMustache.setVisibility(view.INVISIBLE);
        } else {
            imageViewMustache.setVisibility(view.VISIBLE);
        }
    }

    public void noseClicked(View view) {
        imageViewNose = findViewById(R.id.imageViewNose);

        if (imageViewNose.getVisibility() == View.VISIBLE) {
            imageViewNose.setVisibility(view.INVISIBLE);
        } else {
            imageViewNose.setVisibility(view.VISIBLE);
        }
    }
}
