package com.facebook.react.devsupport;

import android.os.Build;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f21661a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f21662b;

    static {
        f21662b = Build.VERSION.SDK_INT < 26 ? 2006 : 2038;
    }

    private m0() {
    }
}
