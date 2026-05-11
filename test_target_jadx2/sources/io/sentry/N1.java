package io.sentry;

import java.util.Date;

/* loaded from: classes2.dex */
public final class N1 extends AbstractC3410f1 {

    /* renamed from: a, reason: collision with root package name */
    private final Date f34522a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34523b;

    public N1() {
        this(AbstractC3420j.c(), System.nanoTime());
    }

    private long p(N1 n12, N1 n13) {
        return n12.o() + (n13.f34523b - n12.f34523b);
    }

    @Override // io.sentry.AbstractC3410f1, java.lang.Comparable
    /* renamed from: b */
    public int compareTo(AbstractC3410f1 abstractC3410f1) {
        if (!(abstractC3410f1 instanceof N1)) {
            return super.compareTo(abstractC3410f1);
        }
        N1 n12 = (N1) abstractC3410f1;
        long time = this.f34522a.getTime();
        long time2 = n12.f34522a.getTime();
        return time == time2 ? Long.valueOf(this.f34523b).compareTo(Long.valueOf(n12.f34523b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC3410f1
    public long c(AbstractC3410f1 abstractC3410f1) {
        return abstractC3410f1 instanceof N1 ? this.f34523b - ((N1) abstractC3410f1).f34523b : super.c(abstractC3410f1);
    }

    @Override // io.sentry.AbstractC3410f1
    public long n(AbstractC3410f1 abstractC3410f1) {
        if (abstractC3410f1 == null || !(abstractC3410f1 instanceof N1)) {
            return super.n(abstractC3410f1);
        }
        N1 n12 = (N1) abstractC3410f1;
        return compareTo(abstractC3410f1) < 0 ? p(this, n12) : p(n12, this);
    }

    @Override // io.sentry.AbstractC3410f1
    public long o() {
        return AbstractC3420j.a(this.f34522a);
    }

    public N1(Date date, long j10) {
        this.f34522a = date;
        this.f34523b = j10;
    }
}
