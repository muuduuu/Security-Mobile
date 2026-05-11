package io.sentry;

/* renamed from: io.sentry.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3410f1 implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3410f1 abstractC3410f1) {
        return Long.valueOf(o()).compareTo(Long.valueOf(abstractC3410f1.o()));
    }

    public long c(AbstractC3410f1 abstractC3410f1) {
        return o() - abstractC3410f1.o();
    }

    public final boolean d(AbstractC3410f1 abstractC3410f1) {
        return c(abstractC3410f1) > 0;
    }

    public final boolean e(AbstractC3410f1 abstractC3410f1) {
        return c(abstractC3410f1) < 0;
    }

    public long n(AbstractC3410f1 abstractC3410f1) {
        return (abstractC3410f1 == null || compareTo(abstractC3410f1) >= 0) ? o() : abstractC3410f1.o();
    }

    public abstract long o();
}
