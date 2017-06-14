package com.almaz.myapp2.model;

import android.util.Log;

import com.almaz.myapp2.model.api.ApiModule;
import com.almaz.myapp2.model.data.Datum;
import com.almaz.myapp2.model.data.Gallery;
import com.almaz.myapp2.view.GalleryAdapter;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ModelImpl implements Model {

    Gallery gallery;

    private static ModelImpl sModel;

    private ModelImpl(){
        gallery = new Gallery();
    }

    public static void initInstance() {

        if (sModel == null) {
            sModel = new ModelImpl();
        }
    }

    public static ModelImpl getModel(){


        return  sModel;
    }


    @Override
    public Gallery getImages() {

        ApiModule.getApi().getData().enqueue(new Callback<Gallery>() {
            @Override
            public void onResponse(Call<Gallery> call, Response<Gallery> response) {
                if (response.isSuccessful()) {
                    Log.d("LogTag", "Status Code = " + response.code());
                    gallery = response.body();

                } else {
                    try {
                        Log.d("LogTag", response.errorBody().string());
                    } catch (IOException ioe) {
                        Log.d("LogTag", ioe.getLocalizedMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<Gallery> call, Throwable t) {
                Log.d("LogTag", "FAIL");
            }
        });

        return gallery;

    }



}
