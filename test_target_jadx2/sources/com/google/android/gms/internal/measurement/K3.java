package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public abstract class K3 {

    /* renamed from: a, reason: collision with root package name */
    private static J3 f24251a;

    public static synchronized void a(J3 j32) {
        synchronized (K3.class) {
            if (f24251a != null) {
                throw new IllegalStateException("init() already called");
            }
            f24251a = j32;
        }
    }

    public static synchronized J3 b() {
        J3 j32;
        synchronized (K3.class) {
            try {
                if (f24251a == null) {
                    a(new N3());
                }
                j32 = f24251a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j32;
    }
}
