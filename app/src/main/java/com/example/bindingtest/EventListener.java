package com.example.bindingtest;

import android.util.Log;
import android.view.View;

/**
 * Created by evin on 9/5/16.
 */
public class EventListener {
    private static final String TAG = "MyHandlersTAG_";

    public void onClickFriend(View view) {
        Log.d(TAG, "onClickFriend: ");
    }

    public void onClickEnemy(View view, User user) {
        Log.d(TAG, "onClickEnemy: " + user.getFirstName());
        Log.d(TAG, "onClickEnemy: " + user.getLastName());
    }
}
