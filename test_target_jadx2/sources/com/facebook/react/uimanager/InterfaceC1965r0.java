package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.react.uimanager.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1965r0 {
    void c(int i10);

    void e();

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getJSModuleName();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    AtomicInteger getState();

    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void setRootViewTag(int i10);

    void setShouldLogContentAppeared(boolean z10);
}
