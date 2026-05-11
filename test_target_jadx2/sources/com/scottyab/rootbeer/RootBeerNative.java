package com.scottyab.rootbeer;

import aa.AbstractC1369a;

/* loaded from: classes2.dex */
public class RootBeerNative {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f29444a = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            f29444a = true;
        } catch (UnsatisfiedLinkError e10) {
            AbstractC1369a.b(e10);
        }
    }

    public boolean a() {
        return f29444a;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z10);
}
