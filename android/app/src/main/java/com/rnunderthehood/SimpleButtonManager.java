package com.rnunderthehood;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;


public class SimpleButtonManager extends SimpleViewManager<SimpleButtonView> {

    @Override
    public String getName() {
        return "SimpleButton";
    }

    @Override
    protected SimpleButtonView createViewInstance(ThemedReactContext reactContext) {
        return new SimpleButtonView(reactContext);
    }
}
