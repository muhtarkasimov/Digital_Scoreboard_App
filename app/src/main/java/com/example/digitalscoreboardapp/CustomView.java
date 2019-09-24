package com.example.digitalscoreboardapp;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;


public class CustomView extends View
{
    private int stuff; // stuff

    public CustomView(Context context) {
        super(context);
    }

    @Override
    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("stuff", this.stuff); // ... save stuff
        return bundle;
    }

    @Override
    public void onRestoreInstanceState(Parcelable state)
    {
        if (state instanceof Bundle) // implicit null check
        {
            Bundle bundle = (Bundle) state;
            this.stuff = bundle.getInt("stuff"); // ... load stuff
            state = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(state);
    }
}
