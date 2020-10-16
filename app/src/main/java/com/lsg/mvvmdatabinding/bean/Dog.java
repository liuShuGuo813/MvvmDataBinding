package com.lsg.mvvmdatabinding.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.lsg.mvvmdatabinding.BR;

/**
 * Created by lsg on 2020/10/15
 */
public class Dog extends BaseObservable {

    //如果是public修饰的,直接用@Bindable
    @Bindable
    public String name;
    //如果是private修饰的,需在get方法中使用@Bindable
    private String color;

    public void setDataOnlyName(String name,String color){
        this.name = name;
        this.color = color;
        notifyPropertyChanged(BR.name);
    }

    public void setDataAll(String name,String color){
        this.name = name;
        this.color = color;
        notifyChange();
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name == null ? "" : name;
    }

    @Bindable
    public String getColor() {
        return color == null ? "" : color;
    }

    public void setColor(String color) {
        this.color = color == null ? "" : color;
    }
}
