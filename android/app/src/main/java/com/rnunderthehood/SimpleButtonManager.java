package com.rnunderthehood;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;


public class SimpleButtonManager extends SimpleViewManager<SimpleButtonView> {

    @Override
    public String getName() {
        return "SimpleButton";
    }

    @Override
    protected SimpleButtonView createViewInstance(ThemedReactContext reactContext) {
        return new SimpleButtonView(reactContext);
    }

    @ReactProp(name="isOn")
    public void setBulbStatus(SimpleButtonView view, Boolean isOn) {
       view.setIsOn(isOn);
    }
}
