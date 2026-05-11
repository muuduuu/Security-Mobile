package io.sentry;

import java.time.Instant;

/* loaded from: classes2.dex */
public final class G1 extends AbstractC3410f1 {

    /* renamed from: a, reason: collision with root package name */
    private final Instant f34465a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public G1() {
        this(r0);
        Instant now;
        now = Instant.now();
    }

    @Override // io.sentry.AbstractC3410f1
    public long o() {
        long epochSecond;
        int nano;
        epochSecond = this.f34465a.getEpochSecond();
        long m10 = AbstractC3420j.m(epochSecond);
        nano = this.f34465a.getNano();
        return m10 + nano;
    }

    public G1(Instant instant) {
        this.f34465a = instant;
    }
}
