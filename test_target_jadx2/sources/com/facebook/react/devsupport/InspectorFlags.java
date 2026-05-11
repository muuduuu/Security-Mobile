package com.facebook.react.devsupport;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0087 ¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/devsupport/InspectorFlags;", BuildConfig.FLAVOR, "()V", "getFuseboxEnabled", BuildConfig.FLAVOR, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InspectorFlags {

    /* renamed from: a, reason: collision with root package name */
    public static final InspectorFlags f21514a = new InspectorFlags();

    static {
        J.a();
    }

    private InspectorFlags() {
    }

    public static final native boolean getFuseboxEnabled();
}
