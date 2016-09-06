package com.example.bindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by evin on 9/5/16.
 */
public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    private String profilePic;

    public User(String firstName, String lastName, String profilePic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePic = profilePic;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.example.bindingtest.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.example.bindingtest.BR.lastName);
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    @BindingAdapter("bind:imageUrl")
    public static void loadProfilePic(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }
}
