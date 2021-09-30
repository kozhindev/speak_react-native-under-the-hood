package com.rnunderthehood;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;


public class SimpleButtonView extends Button {

    public SimpleButtonView(Context context) {
        super(context);
        this.setTextColor(Color.BLUE);
        this.setText("NATIVE BUTTON");
    }

    public SimpleButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleButtonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
