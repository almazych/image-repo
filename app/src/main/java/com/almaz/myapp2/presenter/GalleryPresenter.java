package com.almaz.myapp2.presenter;

import android.util.Log;

import com.almaz.myapp2.model.Model;
import com.almaz.myapp2.model.ModelImpl;
import com.almaz.myapp2.model.data.Gallery;
import com.almaz.myapp2.view.MainActivity;
import com.almaz.myapp2.view.View;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class GalleryPresenter{

    private Model model =  ModelImpl.getModel();
    Gallery gallery  = new Gallery();
    private View mView;

    public GalleryPresenter(MainActivity mView){
        this.mView = mView;
    }

    public void onGalleryButtonClick() {
        model.getImages().enqueue(new Callback<Gallery>() {
            @Override
            public void onResponse(Call<Gallery> call, Response<Gallery> response) {
                if (response.isSuccessful()) {
                    Log.d("LogTag", "Status Code = " + response.code());
                    gallery = response.body();
                    mView.showData(gallery.getData());
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
    }
}
