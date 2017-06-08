package com.almaz.myapp2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TheImgurApi {

    @GET("gallery/section/sort/0.json")
    Call<Gallery> getData();
}
