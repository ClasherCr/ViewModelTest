package com.example.viewmodeltest;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> counter = new MutableLiveData<>();

    public void increaseCounter(View view){
        int currentvalue = counter.getValue() !=null ? counter.getValue():0;

        counter.setValue(currentvalue+1);
    }

    public LiveData<Integer> getCounter(){
        return counter;
    }

}
