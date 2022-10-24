package com.webview.wheel;

import com.google.firebase.database.core.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface ServiceApi {
    @GET("Mpj8N2cR")
    Call<List<Post>> getPosts();
}
