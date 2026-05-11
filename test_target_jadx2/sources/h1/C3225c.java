package h1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3225c {

    /* renamed from: m, reason: collision with root package name */
    public static final a f33807m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public l1.h f33808a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f33809b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f33810c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f33811d;

    /* renamed from: e, reason: collision with root package name */
    private long f33812e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f33813f;

    /* renamed from: g, reason: collision with root package name */
    private int f33814g;

    /* renamed from: h, reason: collision with root package name */
    private long f33815h;

    /* renamed from: i, reason: collision with root package name */
    private l1.g f33816i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f33817j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f33818k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f33819l;

    /* renamed from: h1.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3225c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.f33809b = new Handler(Looper.getMainLooper());
        this.f33811d = new Object();
        this.f33812e = autoCloseTimeUnit.toMillis(j10);
        this.f33813f = autoCloseExecutor;
        this.f33815h = SystemClock.uptimeMillis();
        this.f33818k = new Runnable() { // from class: h1.a
            @Override // java.lang.Runnable
            public final void run() {
                C3225c.f(C3225c.this);
            }
        };
        this.f33819l = new Runnable() { // from class: h1.b
            @Override // java.lang.Runnable
            public final void run() {
                C3225c.c(C3225c.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3225c this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f33811d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f33815h < this$0.f33812e) {
                    return;
                }
                if (this$0.f33814g != 0) {
                    return;
                }
                Runnable runnable = this$0.f33810c;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.f36324a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                l1.g gVar = this$0.f33816i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                this$0.f33816i = null;
                Unit unit2 = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C3225c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f33813f.execute(this$0.f33819l);
    }

    public final void d() {
        synchronized (this.f33811d) {
            try {
                this.f33817j = true;
                l1.g gVar = this.f33816i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f33816i = null;
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f33811d) {
            try {
                int i10 = this.f33814g;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.f33814g = i11;
                if (i11 == 0) {
                    if (this.f33816i == null) {
                        return;
                    } else {
                        this.f33809b.postDelayed(this.f33818k, this.f33812e);
                    }
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final l1.g h() {
        return this.f33816i;
    }

    public final l1.h i() {
        l1.h hVar = this.f33808a;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.v("delegateOpenHelper");
        return null;
    }

    public final l1.g j() {
        synchronized (this.f33811d) {
            this.f33809b.removeCallbacks(this.f33818k);
            this.f33814g++;
            if (this.f33817j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            l1.g gVar = this.f33816i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            l1.g U02 = i().U0();
            this.f33816i = U02;
            return U02;
        }
    }

    public final void k(l1.h delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        m(delegateOpenHelper);
    }

    public final void l(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.f33810c = onAutoClose;
    }

    public final void m(l1.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f33808a = hVar;
    }
}
