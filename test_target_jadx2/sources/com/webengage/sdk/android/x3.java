package com.webengage.sdk.android;

import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class x3 {

    /* renamed from: b, reason: collision with root package name */
    public static x3 f31151b = new x3();

    /* renamed from: a, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f31152a = Executors.newSingleThreadExecutor();

    private x3() {
    }

    public static x3 a() {
        return f31151b;
    }

    public void a(Runnable runnable) {
        this.f31152a.execute(runnable);
    }
}
