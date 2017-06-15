package com.almaz.myapp2.model;

import com.almaz.myapp2.model.api.ApiModule;
import com.almaz.myapp2.model.data.Gallery;

import retrofit2.Call;

public class ModelImpl implements Model {

    private static ModelImpl sModel;

    private ModelImpl(){}

    public static void initInstance() {
        if (sModel == null) {
            sModel = new ModelImpl();
        }
    }

    public static ModelImpl getModel(){
        return  sModel;
    }


    @Override
    public Call<Gallery> getImages() {
        return ApiModule.getApi().getData();
    }
}
