package t3;

import O3.b;
import O3.e;
import O3.h;
import O3.i;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import b3.l;
import b3.o;
import g4.k;
import i3.InterfaceC3317b;
import java.io.Closeable;
import y3.t;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4618a extends O3.a implements Closeable, t {

    /* renamed from: h, reason: collision with root package name */
    private static HandlerC0615a f42292h;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3317b f42293b;

    /* renamed from: c, reason: collision with root package name */
    private final i f42294c;

    /* renamed from: d, reason: collision with root package name */
    private final h f42295d;

    /* renamed from: e, reason: collision with root package name */
    private final o f42296e;

    /* renamed from: f, reason: collision with root package name */
    private h f42297f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f42298g;

    /* renamed from: t3.a$a, reason: collision with other inner class name */
    static class HandlerC0615a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final h f42299a;

        /* renamed from: b, reason: collision with root package name */
        private h f42300b;

        public HandlerC0615a(Looper looper, h hVar, h hVar2) {
            super(looper);
            this.f42299a = hVar;
            this.f42300b = hVar2;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            i iVar = (i) l.g(message.obj);
            h hVar = this.f42300b;
            int i10 = message.what;
            if (i10 == 1) {
                e a10 = e.Companion.a(message.arg1);
                if (a10 == null) {
                    throw new IllegalArgumentException("Invalid ImageLoadStatus value: " + message.arg1);
                }
                this.f42299a.b(iVar, a10);
                if (hVar != null) {
                    hVar.b(iVar, a10);
                    return;
                }
                return;
            }
            if (i10 != 2) {
                return;
            }
            O3.l a11 = O3.l.Companion.a(message.arg1);
            if (a11 == null) {
                throw new IllegalArgumentException("Invalid VisibilityState value: " + message.arg1);
            }
            this.f42299a.a(iVar, a11);
            if (hVar != null) {
                hVar.a(iVar, a11);
            }
        }
    }

    public C4618a(InterfaceC3317b interfaceC3317b, i iVar, h hVar, o oVar) {
        this(interfaceC3317b, iVar, hVar, oVar, true);
    }

    private synchronized void i() {
        if (f42292h != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
        handlerThread.start();
        f42292h = new HandlerC0615a((Looper) l.g(handlerThread.getLooper()), this.f42295d, this.f42297f);
    }

    private void n(i iVar, long j10) {
        iVar.x(false);
        iVar.r(j10);
        s(iVar, O3.l.INVISIBLE);
    }

    private boolean q() {
        boolean booleanValue = ((Boolean) this.f42296e.get()).booleanValue();
        if (booleanValue && f42292h == null) {
            i();
        }
        return booleanValue;
    }

    private void r(i iVar, e eVar) {
        iVar.n(eVar);
        if (q()) {
            Message obtainMessage = ((HandlerC0615a) l.g(f42292h)).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = eVar.getValue();
            obtainMessage.obj = iVar;
            f42292h.sendMessage(obtainMessage);
            return;
        }
        this.f42295d.b(iVar, eVar);
        h hVar = this.f42297f;
        if (hVar != null) {
            hVar.b(iVar, eVar);
        }
    }

    private void s(i iVar, O3.l lVar) {
        if (q()) {
            Message obtainMessage = ((HandlerC0615a) l.g(f42292h)).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = lVar.getValue();
            obtainMessage.obj = iVar;
            f42292h.sendMessage(obtainMessage);
            return;
        }
        this.f42295d.a(iVar, lVar);
        h hVar = this.f42297f;
        if (hVar != null) {
            hVar.a(iVar, lVar);
        }
    }

    @Override // y3.t
    public void b(boolean z10) {
        if (z10) {
            o(this.f42294c, this.f42293b.now());
        } else {
            n(this.f42294c, this.f42293b.now());
        }
    }

    @Override // O3.a, O3.b
    public void c(String str, b.a aVar) {
        long now = this.f42293b.now();
        i iVar = this.f42294c;
        iVar.l(aVar);
        iVar.h(str);
        e a10 = iVar.a();
        if (a10 != e.SUCCESS && a10 != e.ERROR && a10 != e.DRAW) {
            iVar.e(now);
            r(iVar, e.CANCELED);
        }
        r(iVar, e.RELEASED);
        if (this.f42298g) {
            n(iVar, now);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p();
    }

    @Override // O3.a, O3.b
    public void e(String str, Object obj, b.a aVar) {
        long now = this.f42293b.now();
        i iVar = this.f42294c;
        iVar.c();
        iVar.j(now);
        iVar.h(str);
        iVar.d(obj);
        iVar.l(aVar);
        r(iVar, e.REQUESTED);
        if (this.f42298g) {
            o(iVar, now);
        }
    }

    @Override // O3.a, O3.b
    public void f(String str, Throwable th, b.a aVar) {
        long now = this.f42293b.now();
        i iVar = this.f42294c;
        iVar.l(aVar);
        iVar.f(now);
        iVar.h(str);
        iVar.k(th);
        r(iVar, e.ERROR);
        n(iVar, now);
    }

    @Override // O3.a, O3.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(String str, k kVar, b.a aVar) {
        long now = this.f42293b.now();
        i iVar = this.f42294c;
        iVar.l(aVar);
        iVar.g(now);
        iVar.p(now);
        iVar.h(str);
        iVar.m(kVar);
        r(iVar, e.SUCCESS);
    }

    @Override // O3.a, O3.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void a(String str, k kVar) {
        long now = this.f42293b.now();
        i iVar = this.f42294c;
        iVar.i(now);
        iVar.h(str);
        iVar.m(kVar);
        r(iVar, e.INTERMEDIATE_AVAILABLE);
    }

    public void o(i iVar, long j10) {
        iVar.x(true);
        iVar.w(j10);
        s(iVar, O3.l.VISIBLE);
    }

    public void p() {
        this.f42294c.b();
    }

    public C4618a(InterfaceC3317b interfaceC3317b, i iVar, h hVar, o oVar, boolean z10) {
        this.f42297f = null;
        this.f42293b = interfaceC3317b;
        this.f42294c = iVar;
        this.f42295d = hVar;
        this.f42296e = oVar;
        this.f42298g = z10;
    }

    @Override // y3.t
    public void onDraw() {
    }
}
