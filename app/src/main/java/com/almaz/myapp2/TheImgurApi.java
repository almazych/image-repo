package com.almaz.myapp2;


import com.almaz.myapp2.model.data.Gallery;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TheImgurApi {

    @GET("gallery/section/sort/0")
    Call<Gallery> getData();
}
