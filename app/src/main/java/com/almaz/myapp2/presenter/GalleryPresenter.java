package com.almaz.myapp2.presenter;

import com.almaz.myapp2.model.Model;
import com.almaz.myapp2.model.ModelImpl;
import com.almaz.myapp2.model.data.Datum;
import com.almaz.myapp2.model.data.Gallery;

import java.util.List;


public class GalleryPresenter implements Presenter {

    private Model model = new ModelImpl();


    @Override
    public Gallery onGalleryButtonClick() {

        return model.getImages();
    }

}
