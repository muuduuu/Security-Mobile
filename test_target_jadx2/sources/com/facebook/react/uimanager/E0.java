package com.facebook.react.uimanager;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;

/* loaded from: classes.dex */
public interface E0 {
    void destroyState();

    ReadableMapBuffer getStateDataMapBuffer();

    void updateState(WritableMap writableMap);
}
