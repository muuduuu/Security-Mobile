package io.sentry.android.core.internal.util;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final long f34915a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.o f34916b;

    /* renamed from: c, reason: collision with root package name */
    private Long f34917c = null;

    public g(io.sentry.transport.o oVar, long j10) {
        this.f34916b = oVar;
        this.f34915a = j10;
    }

    public boolean a() {
        long a10 = this.f34916b.a();
        Long l10 = this.f34917c;
        if (l10 != null && l10.longValue() + this.f34915a > a10) {
            return true;
        }
        this.f34917c = Long.valueOf(a10);
        return false;
    }
}
