package com.almaz.myapp2.model;

import android.util.Log;

import com.almaz.myapp2.model.api.ApiModule;
import com.almaz.myapp2.model.data.Gallery;
import com.almaz.myapp2.presenter.GalleryPresenter;
import com.almaz.myapp2.view.View;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ModelImpl implements Model {

    private static ModelImpl sModel;
    GalleryPresenter mPresenter = new GalleryPresenter(null);



    @Override
    public void getImages() {

        ApiModule.getApi().getData().enqueue(mPresenter.getCall());
    }





    private ModelImpl(){}

    public static void initInstance() {
        if (sModel == null) {
            sModel = new ModelImpl();
        }
    }

    public static ModelImpl getModel(){
        return  sModel;
    }


}
