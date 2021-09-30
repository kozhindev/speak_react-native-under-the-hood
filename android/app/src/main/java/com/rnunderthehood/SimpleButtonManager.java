package com.rnunderthehood;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.common.MapBuilder;
import java.util.Map;


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

    @Override
    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder()
            .put(
                "statusChange",
                MapBuilder.of(
                    "phasedRegistrationNames",
                    MapBuilder.of("bubbled", "onStatusChange")
                )
            ).build();
    }
}
