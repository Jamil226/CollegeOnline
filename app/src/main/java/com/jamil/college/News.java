package com.jamil.college;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jamil.college.databinding.ActivityNewsBinding;

public class News extends AppCompatActivity {
    private ActivityNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityNewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}