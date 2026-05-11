package io.sentry.util;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private Object f35557a = null;

    /* renamed from: b, reason: collision with root package name */
    private final a f35558b;

    public interface a {
        Object a();
    }

    public l(a aVar) {
        this.f35558b = aVar;
    }

    public synchronized Object a() {
        try {
            if (this.f35557a == null) {
                this.f35557a = this.f35558b.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f35557a;
    }
}
