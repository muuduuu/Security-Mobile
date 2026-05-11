package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
public abstract class N1 extends AbstractC2175w1 implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private static volatile N1[] f23893b;

    public static N1[] l() {
        if (f23893b == null) {
            synchronized (AbstractC2178x1.f24107c) {
                try {
                    if (f23893b == null) {
                        f23893b = new N1[0];
                    }
                } finally {
                }
            }
        }
        return f23893b;
    }
}
