package x1;

import Jd.InterfaceC0915w0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements h8.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0915w0 f44702a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f44703b;

    static final class a extends xc.m implements Function1 {
        a() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th == null) {
                if (!m.this.f44703b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (th instanceof CancellationException) {
                    m.this.f44703b.cancel(true);
                    return;
                }
                androidx.work.impl.utils.futures.c cVar = m.this.f44703b;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                cVar.q(th);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    public m(InterfaceC0915w0 job, androidx.work.impl.utils.futures.c underlying) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f44702a = job;
        this.f44703b = underlying;
        job.z(new a());
    }

    public final void b(Object obj) {
        this.f44703b.p(obj);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f44703b.cancel(z10);
    }

    @Override // h8.d
    public void e(Runnable runnable, Executor executor) {
        this.f44703b.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f44703b.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f44703b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f44703b.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f44703b.get(j10, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m(InterfaceC0915w0 interfaceC0915w0, androidx.work.impl.utils.futures.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0915w0, cVar);
        if ((i10 & 2) != 0) {
            cVar = androidx.work.impl.utils.futures.c.t();
            Intrinsics.checkNotNullExpressionValue(cVar, "create()");
        }
    }
}
