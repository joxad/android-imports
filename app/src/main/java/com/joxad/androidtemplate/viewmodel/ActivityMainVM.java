package com.joxad.androidtemplate.viewmodel;

import android.databinding.Bindable;

import com.joxad.androidtemplate.databinding.ActivityMainBinding;
import com.joxad.androidtemplate.view.ActivityMain;
import com.joxad.easydatabinding.activity.ActivityBaseVM;

/**
 * Created by josh on 31/05/16.
 */
public class ActivityMainVM extends ActivityBaseVM<ActivityMain, ActivityMainBinding> {
    /***
     * @param activity
     * @param binding
     */
    public ActivityMainVM(ActivityMain activity, ActivityMainBinding binding) {
        super(activity, binding);
    }

    @Bindable
    public String getName() {
        return "Welcome to MyTemplate";
    }

    @Override
    public void onCreate() {

    }
}
