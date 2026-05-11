package io.sentry.android.core;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: b, reason: collision with root package name */
    private static M f34726b = new M();

    /* renamed from: a, reason: collision with root package name */
    private Boolean f34727a = null;

    private M() {
    }

    public static M a() {
        return f34726b;
    }

    public Boolean b() {
        return this.f34727a;
    }

    synchronized void c(boolean z10) {
        this.f34727a = Boolean.valueOf(z10);
    }
}
