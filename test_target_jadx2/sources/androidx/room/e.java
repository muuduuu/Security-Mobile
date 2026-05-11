package androidx.room;

import androidx.lifecycle.AbstractC1604v;
import androidx.room.c;
import h1.m;
import h1.s;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import m.C3632c;

/* loaded from: classes.dex */
public final class e extends AbstractC1604v {

    /* renamed from: l, reason: collision with root package name */
    private final s f17816l;

    /* renamed from: m, reason: collision with root package name */
    private final m f17817m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f17818n;

    /* renamed from: o, reason: collision with root package name */
    private final Callable f17819o;

    /* renamed from: p, reason: collision with root package name */
    private final c.AbstractC0305c f17820p;

    /* renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f17821q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f17822r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f17823s;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f17824t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f17825u;

    public static final class a extends c.AbstractC0305c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f17826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, e eVar) {
            super(strArr);
            this.f17826b = eVar;
        }

        @Override // androidx.room.c.AbstractC0305c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            C3632c.h().b(this.f17826b.r());
        }
    }

    public e(s database, m container, boolean z10, Callable computeFunction, String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f17816l = database;
        this.f17817m = container;
        this.f17818n = z10;
        this.f17819o = computeFunction;
        this.f17820p = new a(tableNames, this);
        this.f17821q = new AtomicBoolean(true);
        this.f17822r = new AtomicBoolean(false);
        this.f17823s = new AtomicBoolean(false);
        this.f17824t = new Runnable() { // from class: h1.w
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.e.u(androidx.room.e.this);
            }
        };
        this.f17825u = new Runnable() { // from class: h1.x
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.e.t(androidx.room.e.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(e this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean h10 = this$0.h();
        if (this$0.f17821q.compareAndSet(false, true) && h10) {
            this$0.s().execute(this$0.f17824t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(e this$0) {
        boolean z10;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f17823s.compareAndSet(false, true)) {
            this$0.f17816l.m().d(this$0.f17820p);
        }
        do {
            if (this$0.f17822r.compareAndSet(false, true)) {
                Object obj = null;
                z10 = false;
                while (this$0.f17821q.compareAndSet(true, false)) {
                    try {
                        try {
                            obj = this$0.f17819o.call();
                            z10 = true;
                        } catch (Exception e10) {
                            throw new RuntimeException("Exception while computing database live data.", e10);
                        }
                    } finally {
                        this$0.f17822r.set(false);
                    }
                }
                if (z10) {
                    this$0.m(obj);
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        } while (this$0.f17821q.get());
    }

    @Override // androidx.lifecycle.AbstractC1604v
    protected void k() {
        super.k();
        m mVar = this.f17817m;
        Intrinsics.e(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        mVar.b(this);
        s().execute(this.f17824t);
    }

    @Override // androidx.lifecycle.AbstractC1604v
    protected void l() {
        super.l();
        m mVar = this.f17817m;
        Intrinsics.e(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        mVar.c(this);
    }

    public final Runnable r() {
        return this.f17825u;
    }

    public final Executor s() {
        return this.f17818n ? this.f17816l.r() : this.f17816l.o();
    }
}
