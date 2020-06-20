package com.example.retrofitExample;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface JsonPlaceHolderAPI {

    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("_sort") String sort,
            @Query("_order") String order,
            @Query("userId") Integer... userId //using varargs and not Integer[] and because using varargs we have to put it as the last argument
            );

    @GET("posts")
    Call<List<Post>> getPosts(@QueryMap Map<String,String> parameters);

    @GET("posts/{id}/comments")
    Call<List<Comments>> getComments(@Path("id") int postId);
}
