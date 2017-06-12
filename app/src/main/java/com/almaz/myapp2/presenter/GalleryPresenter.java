package com.almaz.myapp2.presenter;

import com.almaz.myapp2.model.Model;
import com.almaz.myapp2.model.ModelImpl;
import com.almaz.myapp2.model.data.Gallery;
import com.almaz.myapp2.view.View;



public class GalleryPresenter{

    private Model model = new ModelImpl();
    private View view;

    public GalleryPresenter(View view) {
        this.view = view;
    }


    public Gallery onGalleryButtonClick() {

        view.showData(model.getImages().getData());
        return model.getImages();
    }

}
