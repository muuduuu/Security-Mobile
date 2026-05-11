package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2680g3 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final long f26067a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f26068b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26069c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2696i3 f26070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2680g3(C2696i3 c2696i3, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        Objects.requireNonNull(c2696i3);
        this.f26070d = c2696i3;
        AbstractC1287s.m(str);
        atomicLong = C2696i3.f26115k;
        long andIncrement = atomicLong.getAndIncrement();
        this.f26067a = andIncrement;
        this.f26069c = str;
        this.f26068b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2696i3.f25694a.a().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C2680g3 c2680g3 = (C2680g3) obj;
        boolean z10 = c2680g3.f26068b;
        boolean z11 = this.f26068b;
        if (z11 == z10) {
            long j10 = this.f26067a;
            long j11 = c2680g3.f26067a;
            if (j10 < j11) {
                return -1;
            }
            if (j10 <= j11) {
                this.f26070d.f25694a.a().p().b("Two tasks share the same index. index", Long.valueOf(j10));
                return 0;
            }
        } else if (z11) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f26070d.f25694a.a().o().b(this.f26069c, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2680g3(C2696i3 c2696i3, Callable callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        Objects.requireNonNull(c2696i3);
        this.f26070d = c2696i3;
        AbstractC1287s.m("Task exception on worker thread");
        atomicLong = C2696i3.f26115k;
        long andIncrement = atomicLong.getAndIncrement();
        this.f26067a = andIncrement;
        this.f26069c = "Task exception on worker thread";
        this.f26068b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2696i3.f25694a.a().o().a("Tasks index overflow");
        }
    }
}
