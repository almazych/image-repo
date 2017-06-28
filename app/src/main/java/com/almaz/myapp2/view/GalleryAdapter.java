package com.almaz.myapp2.view;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.almaz.myapp2.R;
import com.almaz.myapp2.model.data.Datum;
import com.bumptech.glide.Glide;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder>{

    Context context;
    public interface OnItemClickListener {
        void onItemClick(Datum item);
    }

    private List<Datum> mDatum;
    private OnItemClickListener listener;

    public GalleryAdapter(List<Datum> mDatum,  OnItemClickListener listener) {
        this.mDatum = mDatum;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(mDatum.get(position), listener);
    }

    @Override
    public int getItemCount() {
        if (mDatum == null){
            return 0;
        }
        return mDatum.size();
    }

    public void changeDataSet(List<Datum> datum){
        mDatum.clear();
        mDatum.addAll(datum);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageView) ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void bind(final Datum item,  final OnItemClickListener listener) {

            Glide.with(context)
                    .load("https://i.imgur.com/"+item.getCover()+".jpeg")
                    .centerCrop()
                    .placeholder(R.drawable.image_fon)
                    .into(imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
