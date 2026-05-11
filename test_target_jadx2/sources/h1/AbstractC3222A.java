package h1;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3222A {

    /* renamed from: a, reason: collision with root package name */
    private final s f33794a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f33795b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f33796c;

    /* renamed from: h1.A$a */
    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1.k invoke() {
            return AbstractC3222A.this.d();
        }
    }

    public AbstractC3222A(s database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f33794a = database;
        this.f33795b = new AtomicBoolean(false);
        this.f33796c = lc.i.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l1.k d() {
        return this.f33794a.f(e());
    }

    private final l1.k f() {
        return (l1.k) this.f33796c.getValue();
    }

    private final l1.k g(boolean z10) {
        return z10 ? f() : d();
    }

    public l1.k b() {
        c();
        return g(this.f33795b.compareAndSet(false, true));
    }

    protected void c() {
        this.f33794a.c();
    }

    protected abstract String e();

    public void h(l1.k statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == f()) {
            this.f33795b.set(false);
        }
    }
}
