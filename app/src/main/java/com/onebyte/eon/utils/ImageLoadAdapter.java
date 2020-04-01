package com.onebyte.eon.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class ImageLoadAdapter {

    @BindingAdapter("loadImage")
    public static void loadImage(ImageView view, String url) {
        if(url != null && !url.isEmpty()){
            Glide.with(view).load(url).into(view);
        }
    }
}
