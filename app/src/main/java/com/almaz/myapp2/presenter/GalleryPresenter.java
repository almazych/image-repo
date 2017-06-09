package com.almaz.myapp2.presenter;

import com.almaz.myapp2.model.Model;
import com.almaz.myapp2.model.ModelImpl;

/**
 * Created by Алмаз on 10.06.2017.
 */

public class GalleryPresenter implements Presenter {

    private Model model = new ModelImpl();


    @Override
    public void onGalleryButtonClick() {

        //Вытащить изображения и отправить в ресайклер
    }
}
