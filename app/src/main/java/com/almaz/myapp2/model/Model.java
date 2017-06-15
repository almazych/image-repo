package com.almaz.myapp2.model;

import com.almaz.myapp2.model.data.Gallery;

import retrofit2.Call;


public interface Model {

    Call<Gallery> getImages();
}
