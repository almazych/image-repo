package com.almaz.myapp2.presenter;

import com.almaz.myapp2.model.Model;
import com.almaz.myapp2.model.ModelImpl;
import com.almaz.myapp2.model.data.Datum;
import com.almaz.myapp2.view.View;

import java.util.ArrayList;
import java.util.List;


public class GalleryPresenter{

    private Model model =  ModelImpl.getModel();
    private View view;
    private List<Datum> mDatum = new ArrayList<>();

    public GalleryPresenter(View view) {
        this.view = view;
    }


    public void onGalleryButtonClick() {

        mDatum = model.getImages().getData();

        view.showData(mDatum);
    }

}
