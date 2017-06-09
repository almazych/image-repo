package com.almaz.myapp2.model.api;

import com.almaz.myapp2.model.data.Gallery;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("gallery/section/viral/0")
    Call<Gallery> getData();
}
