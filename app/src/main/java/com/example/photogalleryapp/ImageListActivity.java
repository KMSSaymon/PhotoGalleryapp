package com.example.photogalleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ImageListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageAdapter imageAdapter;
    int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);

        // Get the selected category from the intent
        Intent intent = getIntent();
        String category = intent.getStringExtra("category");

        // Setup RecyclerView
        recyclerView = findViewById(R.id.recyclerViewImages);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 items per row

        // Set the images based on category
        switch (category) {
            case "Nature":
                images = new int[]{R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4,};
                break;
            case "Self":
                images = new int[]{R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8};
                break;
            case "Technology":
                images = new int[]{R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12};
                break;
            case "Favourite":
                images = new int[]{R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16};
                break;
            default:
                Toast.makeText(this, "Invalid category", Toast.LENGTH_SHORT).show();
                break;
        }

        // Initialize adapter and set to RecyclerView
        imageAdapter = new ImageAdapter(this, images);
        recyclerView.setAdapter(imageAdapter);
    }
}
