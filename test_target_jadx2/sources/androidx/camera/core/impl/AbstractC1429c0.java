package androidx.camera.core.impl;

import A.AbstractC0700h0;
import android.util.Log;
import android.util.Size;
import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1429c0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Size f14540k = new Size(0, 0);

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f14541l = AbstractC0700h0.f("DeferrableSurface");

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f14542m = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicInteger f14543n = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    private final Object f14544a;

    /* renamed from: b, reason: collision with root package name */
    private int f14545b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14546c;

    /* renamed from: d, reason: collision with root package name */
    private c.a f14547d;

    /* renamed from: e, reason: collision with root package name */
    private final h8.d f14548e;

    /* renamed from: f, reason: collision with root package name */
    private c.a f14549f;

    /* renamed from: g, reason: collision with root package name */
    private final h8.d f14550g;

    /* renamed from: h, reason: collision with root package name */
    private final Size f14551h;

    /* renamed from: i, reason: collision with root package name */
    private final int f14552i;

    /* renamed from: j, reason: collision with root package name */
    Class f14553j;

    /* renamed from: androidx.camera.core.impl.c0$a */
    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        AbstractC1429c0 f14554a;

        public a(String str, AbstractC1429c0 abstractC1429c0) {
            super(str);
            this.f14554a = abstractC1429c0;
        }

        public AbstractC1429c0 a() {
            return this.f14554a;
        }
    }

    /* renamed from: androidx.camera.core.impl.c0$b */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public AbstractC1429c0() {
        this(f14540k, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(c.a aVar) {
        synchronized (this.f14544a) {
            this.f14547d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(c.a aVar) {
        synchronized (this.f14544a) {
            this.f14549f = aVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(String str) {
        try {
            this.f14548e.get();
            q("Surface terminated", f14543n.decrementAndGet(), f14542m.get());
        } catch (Exception e10) {
            AbstractC0700h0.c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f14544a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f14546c), Integer.valueOf(this.f14545b)), e10);
            }
        }
    }

    private void q(String str, int i10, int i11) {
        if (!f14541l && AbstractC0700h0.f("DeferrableSurface")) {
            AbstractC0700h0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC0700h0.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public void d() {
        c.a aVar;
        synchronized (this.f14544a) {
            try {
                if (this.f14546c) {
                    aVar = null;
                } else {
                    this.f14546c = true;
                    this.f14549f.c(null);
                    if (this.f14545b == 0) {
                        aVar = this.f14547d;
                        this.f14547d = null;
                    } else {
                        aVar = null;
                    }
                    if (AbstractC0700h0.f("DeferrableSurface")) {
                        AbstractC0700h0.a("DeferrableSurface", "surface closed,  useCount=" + this.f14545b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        c.a aVar;
        synchronized (this.f14544a) {
            try {
                int i10 = this.f14545b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.f14545b = i11;
                if (i11 == 0 && this.f14546c) {
                    aVar = this.f14547d;
                    this.f14547d = null;
                } else {
                    aVar = null;
                }
                if (AbstractC0700h0.f("DeferrableSurface")) {
                    AbstractC0700h0.a("DeferrableSurface", "use count-1,  useCount=" + this.f14545b + " closed=" + this.f14546c + " " + this);
                    if (this.f14545b == 0) {
                        q("Surface no longer in use", f14543n.get(), f14542m.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public h8.d f() {
        return G.n.B(this.f14550g);
    }

    public Class g() {
        return this.f14553j;
    }

    public Size h() {
        return this.f14551h;
    }

    public int i() {
        return this.f14552i;
    }

    public final h8.d j() {
        synchronized (this.f14544a) {
            try {
                if (this.f14546c) {
                    return G.n.n(new a("DeferrableSurface already closed.", this));
                }
                return r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public h8.d k() {
        return G.n.B(this.f14548e);
    }

    public void l() {
        synchronized (this.f14544a) {
            try {
                int i10 = this.f14545b;
                if (i10 == 0 && this.f14546c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f14545b = i10 + 1;
                if (AbstractC0700h0.f("DeferrableSurface")) {
                    if (this.f14545b == 1) {
                        q("New surface in use", f14543n.get(), f14542m.incrementAndGet());
                    }
                    AbstractC0700h0.a("DeferrableSurface", "use count+1, useCount=" + this.f14545b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f14544a) {
            z10 = this.f14546c;
        }
        return z10;
    }

    protected abstract h8.d r();

    public void s(Class cls) {
        this.f14553j = cls;
    }

    public AbstractC1429c0(Size size, int i10) {
        this.f14544a = new Object();
        this.f14545b = 0;
        this.f14546c = false;
        this.f14551h = size;
        this.f14552i = i10;
        h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: androidx.camera.core.impl.Z
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object n10;
                n10 = AbstractC1429c0.this.n(aVar);
                return n10;
            }
        });
        this.f14548e = a10;
        this.f14550g = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: androidx.camera.core.impl.a0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object o10;
                o10 = AbstractC1429c0.this.o(aVar);
                return o10;
            }
        });
        if (AbstractC0700h0.f("DeferrableSurface")) {
            q("Surface created", f14543n.incrementAndGet(), f14542m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a10.e(new Runnable() { // from class: androidx.camera.core.impl.b0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1429c0.this.p(stackTraceString);
                }
            }, F.c.b());
        }
    }
}
