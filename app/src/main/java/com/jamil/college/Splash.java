package com.jamil.college;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.jamil.college.databinding.ActivitySplashBinding;

public class Splash extends AppCompatActivity {
    ActivitySplashBinding binding;
    private Animation anim_from_bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));

        anim_from_bottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);
        binding.tvAppDeveloper.setAnimation(anim_from_bottom);

        Thread thread = new Thread() {
            @Override
            public void run() {
                Intent i = null;
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    SharedPreferences preferences = getSharedPreferences("userdata", MODE_PRIVATE);
                    String email = preferences.getString("email", "n/a");
                    assert email != null;
                    if (email.equals("n/a")) {
                        i = new Intent(Splash.this, MainActivity.class);
                    } else {
                        i = new Intent(Splash.this, MainActivity.class);
                    }
                    startActivity(i);
                    finish();
                }
                super.run();
            }
        };
        thread.start();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel =
                    new NotificationChannel("MyNotifications", "MyNotifications", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        FirebaseMessaging.getInstance().subscribeToTopic("general")
                .addOnCompleteListener(task -> {
                    String message = "Success";
                    if (!task.isSuccessful()) {
                        message = "Failed";
                    }
                });
    }

}