package io.sentry;

/* renamed from: io.sentry.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3407e1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C3407e1 f35110d = new C3407e1();

    /* renamed from: a, reason: collision with root package name */
    private boolean f35111a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f35112b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f35113c = new Object();

    private C3407e1() {
    }

    public static C3407e1 a() {
        return f35110d;
    }

    public void b(boolean z10) {
        synchronized (this.f35113c) {
            try {
                if (!this.f35111a) {
                    this.f35112b = Boolean.valueOf(z10);
                    this.f35111a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
