package Q0;

import android.os.SystemClock;
import android.view.Choreographer;
import j0.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
class a {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f7837g = new ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    private c f7841d;

    /* renamed from: a, reason: collision with root package name */
    private final i f7838a = new i();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f7839b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final C0152a f7840c = new C0152a();

    /* renamed from: e, reason: collision with root package name */
    long f7842e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7843f = false;

    /* renamed from: Q0.a$a, reason: collision with other inner class name */
    class C0152a {
        C0152a() {
        }

        void a() {
            a.this.f7842e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f7842e);
            if (a.this.f7839b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    interface b {
        boolean a(long j10);
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0152a f7845a;

        c(C0152a c0152a) {
            this.f7845a = c0152a;
        }

        abstract void a();
    }

    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f7846b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f7847c;

        /* renamed from: Q0.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0153a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0153a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f7845a.a();
            }
        }

        d(C0152a c0152a) {
            super(c0152a);
            this.f7846b = Choreographer.getInstance();
            this.f7847c = new ChoreographerFrameCallbackC0153a();
        }

        @Override // Q0.a.c
        void a() {
            this.f7846b.postFrameCallback(this.f7847c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f7843f) {
            for (int size = this.f7839b.size() - 1; size >= 0; size--) {
                if (this.f7839b.get(size) == null) {
                    this.f7839b.remove(size);
                }
            }
            this.f7843f = false;
        }
    }

    public static a d() {
        ThreadLocal threadLocal = f7837g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return (a) threadLocal.get();
    }

    private boolean f(b bVar, long j10) {
        Long l10 = (Long) this.f7838a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f7838a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j10) {
        if (this.f7839b.size() == 0) {
            e().a();
        }
        if (!this.f7839b.contains(bVar)) {
            this.f7839b.add(bVar);
        }
        if (j10 > 0) {
            this.f7838a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void c(long j10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f7839b.size(); i10++) {
            b bVar = (b) this.f7839b.get(i10);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    c e() {
        if (this.f7841d == null) {
            this.f7841d = new d(this.f7840c);
        }
        return this.f7841d;
    }

    public void g(b bVar) {
        this.f7838a.remove(bVar);
        int indexOf = this.f7839b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f7839b.set(indexOf, null);
            this.f7843f = true;
        }
    }
}
