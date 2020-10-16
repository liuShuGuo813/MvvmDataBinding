package com.lsg.mvvmdatabinding.bean;

import androidx.databinding.ObservableField;

import java.lang.reflect.Field;

/**
 * Created by lsg on 2020/10/16
 */
public class HuMan {

    public final ObservableField<String> name = new ObservableField<>();

    public HuMan(String name) {
        this.name.set(name);
    }
}
