package com.google.android.gms.vision.clearcut;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private final Object f26504b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private long f26505c = Long.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private final long f26503a = Math.round(30000.0d);

    public b(double d10) {
    }

    public final boolean a() {
        synchronized (this.f26504b) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f26505c + this.f26503a > currentTimeMillis) {
                    return false;
                }
                this.f26505c = currentTimeMillis;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
