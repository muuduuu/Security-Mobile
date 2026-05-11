package com.facebook.imagepipeline.nativecode;

import p5.AbstractC3794a;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f20730a;

    public static synchronized void a() {
        synchronized (d.class) {
            if (!f20730a) {
                AbstractC3794a.d("native-imagetranscoder");
                f20730a = true;
            }
        }
    }
}
