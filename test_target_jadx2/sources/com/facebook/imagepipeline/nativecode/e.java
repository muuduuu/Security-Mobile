package com.facebook.imagepipeline.nativecode;

import p5.AbstractC3794a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f20731a;

    public static synchronized void a() {
        synchronized (e.class) {
            if (!f20731a) {
                AbstractC3794a.d("static-webp");
                f20731a = true;
            }
        }
    }
}
