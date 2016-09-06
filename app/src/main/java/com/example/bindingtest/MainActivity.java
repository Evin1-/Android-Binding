package com.example.bindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("Edwin", "Hernandez");
        EventListener eventListener = new EventListener();

        binding.setUser(user);
        binding.setEvents(eventListener);
    }
}
