package com.almaz.myapp2.view;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder>{

    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(GalleryAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
