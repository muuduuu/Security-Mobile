package v2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import f2.InterfaceC3137a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l2.InterfaceC3602d;

/* renamed from: v2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4917g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3137a f43834a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f43835b;

    /* renamed from: c, reason: collision with root package name */
    private final List f43836c;

    /* renamed from: d, reason: collision with root package name */
    final l f43837d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3602d f43838e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43839f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43840g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43841h;

    /* renamed from: i, reason: collision with root package name */
    private k f43842i;

    /* renamed from: j, reason: collision with root package name */
    private a f43843j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f43844k;

    /* renamed from: l, reason: collision with root package name */
    private a f43845l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f43846m;

    /* renamed from: n, reason: collision with root package name */
    private i2.l f43847n;

    /* renamed from: o, reason: collision with root package name */
    private a f43848o;

    /* renamed from: p, reason: collision with root package name */
    private int f43849p;

    /* renamed from: q, reason: collision with root package name */
    private int f43850q;

    /* renamed from: r, reason: collision with root package name */
    private int f43851r;

    /* renamed from: v2.g$a */
    static class a extends A2.a {

        /* renamed from: d, reason: collision with root package name */
        private final Handler f43852d;

        /* renamed from: e, reason: collision with root package name */
        final int f43853e;

        /* renamed from: f, reason: collision with root package name */
        private final long f43854f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap f43855g;

        a(Handler handler, int i10, long j10) {
            this.f43852d = handler;
            this.f43853e = i10;
            this.f43854f = j10;
        }

        Bitmap e() {
            return this.f43855g;
        }

        @Override // A2.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void n(Bitmap bitmap, B2.b bVar) {
            this.f43855g = bitmap;
            this.f43852d.sendMessageAtTime(this.f43852d.obtainMessage(1, this), this.f43854f);
        }

        @Override // A2.d
        public void m(Drawable drawable) {
            this.f43855g = null;
        }
    }

    /* renamed from: v2.g$b */
    public interface b {
        void a();
    }

    /* renamed from: v2.g$c */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                C4917g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            C4917g.this.f43837d.p((a) message.obj);
            return false;
        }
    }

    C4917g(com.bumptech.glide.c cVar, InterfaceC3137a interfaceC3137a, int i10, int i11, i2.l lVar, Bitmap bitmap) {
        this(cVar.g(), com.bumptech.glide.c.v(cVar.i()), interfaceC3137a, null, i(com.bumptech.glide.c.v(cVar.i()), i10, i11), lVar, bitmap);
    }

    private static i2.f g() {
        return new C2.c(Double.valueOf(Math.random()));
    }

    private static k i(l lVar, int i10, int i11) {
        return lVar.f().a(((com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) com.bumptech.glide.request.h.o0(k2.j.f36073b).m0(true)).h0(true)).Y(i10, i11));
    }

    private void l() {
        if (!this.f43839f || this.f43840g) {
            return;
        }
        if (this.f43841h) {
            D2.k.a(this.f43848o == null, "Pending target must be null when starting from the first frame");
            this.f43834a.f();
            this.f43841h = false;
        }
        a aVar = this.f43848o;
        if (aVar != null) {
            this.f43848o = null;
            m(aVar);
            return;
        }
        this.f43840g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f43834a.d();
        this.f43834a.c();
        this.f43845l = new a(this.f43835b, this.f43834a.g(), uptimeMillis);
        this.f43842i.a(com.bumptech.glide.request.h.p0(g())).B0(this.f43834a).v0(this.f43845l);
    }

    private void n() {
        Bitmap bitmap = this.f43846m;
        if (bitmap != null) {
            this.f43838e.c(bitmap);
            this.f43846m = null;
        }
    }

    private void p() {
        if (this.f43839f) {
            return;
        }
        this.f43839f = true;
        this.f43844k = false;
        l();
    }

    private void q() {
        this.f43839f = false;
    }

    void a() {
        this.f43836c.clear();
        n();
        q();
        a aVar = this.f43843j;
        if (aVar != null) {
            this.f43837d.p(aVar);
            this.f43843j = null;
        }
        a aVar2 = this.f43845l;
        if (aVar2 != null) {
            this.f43837d.p(aVar2);
            this.f43845l = null;
        }
        a aVar3 = this.f43848o;
        if (aVar3 != null) {
            this.f43837d.p(aVar3);
            this.f43848o = null;
        }
        this.f43834a.clear();
        this.f43844k = true;
    }

    ByteBuffer b() {
        return this.f43834a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f43843j;
        return aVar != null ? aVar.e() : this.f43846m;
    }

    int d() {
        a aVar = this.f43843j;
        if (aVar != null) {
            return aVar.f43853e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f43846m;
    }

    int f() {
        return this.f43834a.a();
    }

    int h() {
        return this.f43851r;
    }

    int j() {
        return this.f43834a.h() + this.f43849p;
    }

    int k() {
        return this.f43850q;
    }

    void m(a aVar) {
        this.f43840g = false;
        if (this.f43844k) {
            this.f43835b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f43839f) {
            if (this.f43841h) {
                this.f43835b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f43848o = aVar;
                return;
            }
        }
        if (aVar.e() != null) {
            n();
            a aVar2 = this.f43843j;
            this.f43843j = aVar;
            for (int size = this.f43836c.size() - 1; size >= 0; size--) {
                ((b) this.f43836c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f43835b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(i2.l lVar, Bitmap bitmap) {
        this.f43847n = (i2.l) D2.k.d(lVar);
        this.f43846m = (Bitmap) D2.k.d(bitmap);
        this.f43842i = this.f43842i.a(new com.bumptech.glide.request.h().i0(lVar));
        this.f43849p = D2.l.i(bitmap);
        this.f43850q = bitmap.getWidth();
        this.f43851r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f43844k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f43836c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f43836c.isEmpty();
        this.f43836c.add(bVar);
        if (isEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f43836c.remove(bVar);
        if (this.f43836c.isEmpty()) {
            q();
        }
    }

    C4917g(InterfaceC3602d interfaceC3602d, l lVar, InterfaceC3137a interfaceC3137a, Handler handler, k kVar, i2.l lVar2, Bitmap bitmap) {
        this.f43836c = new ArrayList();
        this.f43837d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f43838e = interfaceC3602d;
        this.f43835b = handler;
        this.f43842i = kVar;
        this.f43834a = interfaceC3137a;
        o(lVar2, bitmap);
    }
}
