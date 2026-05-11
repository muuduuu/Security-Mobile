package com.facebook.jni;

import p5.AbstractC3794a;

/* loaded from: classes.dex */
public class ThreadScopeSupport {
    static {
        AbstractC3794a.d("fbjni");
    }

    private static void runStdFunction(long j10) {
        runStdFunctionImpl(j10);
    }

    private static native void runStdFunctionImpl(long j10);
}
