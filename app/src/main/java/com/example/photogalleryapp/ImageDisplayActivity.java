package com.example.photogalleryapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ImageDisplayActivity extends AppCompatActivity {

    private LinearLayout imageContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);

        imageContainer = findViewById(R.id.imageContainer);

        String category = getIntent().getStringExtra("category");
        ArrayList<Integer> imageList = getImagesForCategory(category);

        for (int resId : imageList) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(resId);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            imageView.setAdjustViewBounds(true); // Keeps image aspect ratio
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageContainer.addView(imageView);
        }
    }

    private ArrayList<Integer> getImagesForCategory(String category) {
        ArrayList<Integer> imageList = new ArrayList<>();

        switch (category) {
            case "Nature":
                imageList.add(R.drawable.nature1);
                imageList.add(R.drawable.nature2);
                imageList.add(R.drawable.nature3);
                imageList.add(R.drawable.nature4);
                imageList.add(R.drawable.nature5);
                imageList.add(R.drawable.nature6);
                imageList.add(R.drawable.nature7);
                imageList.add(R.drawable.nature8);
                break;

            case "Self":
                imageList.add(R.drawable.me1);
                imageList.add(R.drawable.me2);
                imageList.add(R.drawable.me3);
                imageList.add(R.drawable.me4);
                imageList.add(R.drawable.me5);
                imageList.add(R.drawable.me6);
                imageList.add(R.drawable.me7);
                imageList.add(R.drawable.me8);
                break;

            case "Technology":
                imageList.add(R.drawable.tec1);
                imageList.add(R.drawable.tec2);
                imageList.add(R.drawable.tec3);
                imageList.add(R.drawable.tec4);
                imageList.add(R.drawable.tec5);
                imageList.add(R.drawable.tec5);
                imageList.add(R.drawable.tec5);
                imageList.add(R.drawable.tec5);
                break;

            case "Favourite":
                imageList.add(R.drawable.me9);
                imageList.add(R.drawable.nature10);
                imageList.add(R.drawable.nature9);
                imageList.add(R.drawable.p15);
                imageList.add(R.drawable.p1);
                imageList.add(R.drawable.nature11);
                imageList.add(R.drawable.me8);
                imageList.add(R.drawable.me11);
                break;
        }

        return imageList;
    }
}
