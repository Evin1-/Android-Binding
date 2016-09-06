package com.example.bindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.bindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mUser = new User("Edwin", "Hernandez");

        EventListener eventListener = new EventListener();

        binding.setUser(mUser);
        binding.setEvents(eventListener);
    }

    public void doMagic(View view) {
        mUser.setFirstName("Juan");
    }
}
