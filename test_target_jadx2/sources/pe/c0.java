package pe;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f38661d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f38662e = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f38663a;

    /* renamed from: b, reason: collision with root package name */
    private long f38664b;

    /* renamed from: c, reason: collision with root package name */
    private long f38665c;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public c0 a() {
        this.f38663a = false;
        return this;
    }

    public c0 b() {
        this.f38665c = 0L;
        return this;
    }

    public long c() {
        if (this.f38663a) {
            return this.f38664b;
        }
        throw new IllegalStateException("No deadline");
    }

    public c0 d(long j10) {
        this.f38663a = true;
        this.f38664b = j10;
        return this;
    }

    public boolean e() {
        return this.f38663a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f38663a && this.f38664b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public c0 g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 >= 0) {
            this.f38665c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f38665c;
    }

    public static final class a extends c0 {
        a() {
        }

        @Override // pe.c0
        public c0 g(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }

        @Override // pe.c0
        public void f() {
        }

        @Override // pe.c0
        public c0 d(long j10) {
            return this;
        }
    }
}
