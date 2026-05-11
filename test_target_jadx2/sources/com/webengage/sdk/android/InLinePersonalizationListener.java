package com.webengage.sdk.android;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public interface InLinePersonalizationListener {
    void propertiesReceived(WeakReference<Activity> weakReference, HashMap<String, Object> hashMap);

    void screenNavigated(String str);
}
