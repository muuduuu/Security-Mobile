package com.facebook.react.devsupport;

import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f21515a = new J();

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f21516b;

    private J() {
    }

    public static final synchronized void a() {
        synchronized (J.class) {
            if (f21516b) {
                return;
            }
            SoLoader.t("react_devsupportjni");
            f21516b = true;
        }
    }
}
