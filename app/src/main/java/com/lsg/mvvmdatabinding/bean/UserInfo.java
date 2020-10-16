package com.lsg.mvvmdatabinding.bean;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

/**
 * Created by lsg on 2020/10/15
 */
public class UserInfo {

    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();

    public UserInfo(String name,int age) {
        this.name.set(name);
        this.age.set(age);
    }
}
