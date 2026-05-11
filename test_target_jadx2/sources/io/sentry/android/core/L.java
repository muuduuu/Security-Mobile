package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.AbstractC3410f1;
import io.sentry.AbstractC3420j;
import io.sentry.M1;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: e, reason: collision with root package name */
    private static L f34721e = new L();

    /* renamed from: a, reason: collision with root package name */
    private Long f34722a;

    /* renamed from: b, reason: collision with root package name */
    private Long f34723b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f34724c = null;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC3410f1 f34725d;

    private L() {
    }

    public static L e() {
        return f34721e;
    }

    public AbstractC3410f1 a() {
        Long b10;
        AbstractC3410f1 d10 = d();
        if (d10 == null || (b10 = b()) == null) {
            return null;
        }
        return new M1(d10.o() + AbstractC3420j.h(b10.longValue()));
    }

    public synchronized Long b() {
        Long l10;
        if (this.f34722a != null && (l10 = this.f34723b) != null && this.f34724c != null) {
            long longValue = l10.longValue() - this.f34722a.longValue();
            if (longValue >= 60000) {
                return null;
            }
            return Long.valueOf(longValue);
        }
        return null;
    }

    public Long c() {
        return this.f34722a;
    }

    public AbstractC3410f1 d() {
        return this.f34725d;
    }

    public Boolean f() {
        return this.f34724c;
    }

    synchronized void g() {
        h(SystemClock.uptimeMillis());
    }

    void h(long j10) {
        this.f34723b = Long.valueOf(j10);
    }

    synchronized void i(long j10, AbstractC3410f1 abstractC3410f1) {
        if (this.f34725d == null || this.f34722a == null) {
            this.f34725d = abstractC3410f1;
            this.f34722a = Long.valueOf(j10);
        }
    }

    synchronized void j(boolean z10) {
        if (this.f34724c != null) {
            return;
        }
        this.f34724c = Boolean.valueOf(z10);
    }
}
