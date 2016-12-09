package io.github.hexiangyuan.lolgame.main.bindconfig;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-9
 */

public class BindConfig {

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView,String imageUrl){
        Glide.with(imageView.getContext()).load(imageUrl).into(imageView);
    }
}
