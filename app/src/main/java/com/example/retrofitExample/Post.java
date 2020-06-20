package com.example.retrofitExample;

import com.google.gson.annotations.SerializedName;

class Post {
    private int userId;
    private int id;
    private String title;

    @SerializedName("body")
    private String text;

    int getUserId() {
        return userId;
    }

    int getId() {
        return id;
    }

    String getTitle() {
        return title;
    }

    String getText() {
        return text;
    }
}
