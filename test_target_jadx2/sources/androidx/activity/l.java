package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f12972a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f12973b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f12974c;

    /* renamed from: d, reason: collision with root package name */
    private int f12975d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12976e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12977f;

    /* renamed from: g, reason: collision with root package name */
    private final List f12978g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f12979h;

    public l(Executor executor, Function0 reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f12972a = executor;
        this.f12973b = reportFullyDrawn;
        this.f12974c = new Object();
        this.f12978g = new ArrayList();
        this.f12979h = new Runnable() { // from class: androidx.activity.k
            @Override // java.lang.Runnable
            public final void run() {
                l.d(l.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(l this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f12974c) {
            try {
                this$0.f12976e = false;
                if (this$0.f12975d == 0 && !this$0.f12977f) {
                    this$0.f12973b.invoke();
                    this$0.b();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f12974c) {
            try {
                this.f12977f = true;
                Iterator it = this.f12978g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f12978g.clear();
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f12974c) {
            z10 = this.f12977f;
        }
        return z10;
    }
}
