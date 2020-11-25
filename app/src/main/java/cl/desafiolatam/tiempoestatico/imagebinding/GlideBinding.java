package cl.desafiolatam.tiempoestatico.imagebinding;

import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import cl.desafiolatam.tiempoestatico.R;

public class GlideBinding {
    @BindingAdapter("imageResource")
    public static void setImageResorce(ImageView imgView, int imgURL) {
        Context context = imgView.getContext();

        RequestOptions option = new RequestOptions()
                .placeholder(R.drawable.ic_dom)
                .error(R.drawable.ic_dom);

        Glide.with(context)
                .setDefaultRequestOptions(option)
                .load(imgURL)
                .into(imgView);
    }
}
