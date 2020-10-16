package com.lsg.mvvmdatabinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade

/**
 *  Created by lsg on 2020/10/16
 */
object DataBindingHelper {

    @JvmStatic
    @BindingAdapter("imageWithGlide")
    fun loadImage(imageView: ImageView,url: String){
        Glide.with(imageView).load(url)
            .placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher)
            .transition(withCrossFade())
            .centerCrop()
            .into(imageView)
    }

}