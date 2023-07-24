package com.example.testingapp.networking;

import com.google.gson.annotations.SerializedName;

public class ProductResult {
    @SerializedName("username")
    String username;

    @SerializedName("email")
    String email;

    @SerializedName("profile")
    String profile;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getProfile() {
        return profile;
    }
}
