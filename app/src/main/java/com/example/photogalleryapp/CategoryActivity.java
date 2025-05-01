package com.example.photogalleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Buttons for categories
        Button btnNature = findViewById(R.id.btnNature);
        Button btnSelf = findViewById(R.id.btnSelf);
        Button btnTechnology = findViewById(R.id.btnTechnology);
        Button btnFavourite = findViewById(R.id.btnFavourite);
        Button btnLogout = findViewById(R.id.btnLogout); // 🔹 Add this

        // Set onClick listeners for categories
        btnNature.setOnClickListener(view -> openImageDisplayActivity("Nature"));
        btnSelf.setOnClickListener(view -> openImageDisplayActivity("Self"));
        btnTechnology.setOnClickListener(view -> openImageDisplayActivity("Technology"));
        btnFavourite.setOnClickListener(view -> openImageDisplayActivity("Favourite"));

        // 🔐 Set onClick listener for logout
        btnLogout.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut(); // Sign out the user
            Intent intent = new Intent(CategoryActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish(); // End current activity
        });
    }

    // Method to start ImageDisplayActivity with the selected category
    private void openImageDisplayActivity(String category) {
        Intent intent = new Intent(CategoryActivity.this, ImageDisplayActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}
