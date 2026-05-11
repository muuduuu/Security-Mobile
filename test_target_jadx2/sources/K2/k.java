package k2;

import E2.a;
import android.util.Log;
import i2.EnumC3313a;
import java.util.Map;
import java.util.concurrent.Executor;
import k2.h;
import k2.p;
import m2.C3640b;
import m2.InterfaceC3639a;
import m2.InterfaceC3646h;
import n2.ExecutorServiceC3704a;

/* loaded from: classes.dex */
public class k implements m, InterfaceC3646h.a, p.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f36077i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final s f36078a;

    /* renamed from: b, reason: collision with root package name */
    private final o f36079b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3646h f36080c;

    /* renamed from: d, reason: collision with root package name */
    private final b f36081d;

    /* renamed from: e, reason: collision with root package name */
    private final y f36082e;

    /* renamed from: f, reason: collision with root package name */
    private final c f36083f;

    /* renamed from: g, reason: collision with root package name */
    private final a f36084g;

    /* renamed from: h, reason: collision with root package name */
    private final C3531a f36085h;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f36086a;

        /* renamed from: b, reason: collision with root package name */
        final y0.d f36087b = E2.a.d(150, new C0522a());

        /* renamed from: c, reason: collision with root package name */
        private int f36088c;

        /* renamed from: k2.k$a$a, reason: collision with other inner class name */
        class C0522a implements a.d {
            C0522a() {
            }

            @Override // E2.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h create() {
                a aVar = a.this;
                return new h(aVar.f36086a, aVar.f36087b);
            }
        }

        a(h.e eVar) {
            this.f36086a = eVar;
        }

        h a(com.bumptech.glide.e eVar, Object obj, n nVar, i2.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, i2.h hVar2, h.b bVar) {
            h hVar3 = (h) D2.k.d((h) this.f36087b.b());
            int i12 = this.f36088c;
            this.f36088c = i12 + 1;
            return hVar3.w(eVar, obj, nVar, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z12, hVar2, bVar, i12);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final ExecutorServiceC3704a f36090a;

        /* renamed from: b, reason: collision with root package name */
        final ExecutorServiceC3704a f36091b;

        /* renamed from: c, reason: collision with root package name */
        final ExecutorServiceC3704a f36092c;

        /* renamed from: d, reason: collision with root package name */
        final ExecutorServiceC3704a f36093d;

        /* renamed from: e, reason: collision with root package name */
        final m f36094e;

        /* renamed from: f, reason: collision with root package name */
        final p.a f36095f;

        /* renamed from: g, reason: collision with root package name */
        final y0.d f36096g = E2.a.d(150, new a());

        class a implements a.d {
            a() {
            }

            @Override // E2.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l create() {
                b bVar = b.this;
                return new l(bVar.f36090a, bVar.f36091b, bVar.f36092c, bVar.f36093d, bVar.f36094e, bVar.f36095f, bVar.f36096g);
            }
        }

        b(ExecutorServiceC3704a executorServiceC3704a, ExecutorServiceC3704a executorServiceC3704a2, ExecutorServiceC3704a executorServiceC3704a3, ExecutorServiceC3704a executorServiceC3704a4, m mVar, p.a aVar) {
            this.f36090a = executorServiceC3704a;
            this.f36091b = executorServiceC3704a2;
            this.f36092c = executorServiceC3704a3;
            this.f36093d = executorServiceC3704a4;
            this.f36094e = mVar;
            this.f36095f = aVar;
        }

        l a(i2.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) D2.k.d((l) this.f36096g.b())).l(fVar, z10, z11, z12, z13);
        }
    }

    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3639a.InterfaceC0556a f36098a;

        /* renamed from: b, reason: collision with root package name */
        private volatile InterfaceC3639a f36099b;

        c(InterfaceC3639a.InterfaceC0556a interfaceC0556a) {
            this.f36098a = interfaceC0556a;
        }

        @Override // k2.h.e
        public InterfaceC3639a a() {
            if (this.f36099b == null) {
                synchronized (this) {
                    try {
                        if (this.f36099b == null) {
                            this.f36099b = this.f36098a.c();
                        }
                        if (this.f36099b == null) {
                            this.f36099b = new C3640b();
                        }
                    } finally {
                    }
                }
            }
            return this.f36099b;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final l f36100a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.i f36101b;

        d(com.bumptech.glide.request.i iVar, l lVar) {
            this.f36101b = iVar;
            this.f36100a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f36100a.r(this.f36101b);
            }
        }
    }

    public k(InterfaceC3646h interfaceC3646h, InterfaceC3639a.InterfaceC0556a interfaceC0556a, ExecutorServiceC3704a executorServiceC3704a, ExecutorServiceC3704a executorServiceC3704a2, ExecutorServiceC3704a executorServiceC3704a3, ExecutorServiceC3704a executorServiceC3704a4, boolean z10) {
        this(interfaceC3646h, interfaceC0556a, executorServiceC3704a, executorServiceC3704a2, executorServiceC3704a3, executorServiceC3704a4, null, null, null, null, null, null, z10);
    }

    private p f(i2.f fVar) {
        v c10 = this.f36080c.c(fVar);
        if (c10 == null) {
            return null;
        }
        return c10 instanceof p ? (p) c10 : new p(c10, true, true, fVar, this);
    }

    private p h(i2.f fVar) {
        p e10 = this.f36085h.e(fVar);
        if (e10 != null) {
            e10.b();
        }
        return e10;
    }

    private p i(i2.f fVar) {
        p f10 = f(fVar);
        if (f10 != null) {
            f10.b();
            this.f36085h.a(fVar, f10);
        }
        return f10;
    }

    private p j(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p h10 = h(nVar);
        if (h10 != null) {
            if (f36077i) {
                k("Loaded resource from active resources", j10, nVar);
            }
            return h10;
        }
        p i10 = i(nVar);
        if (i10 == null) {
            return null;
        }
        if (f36077i) {
            k("Loaded resource from cache", j10, nVar);
        }
        return i10;
    }

    private static void k(String str, long j10, i2.f fVar) {
        Log.v("Engine", str + " in " + D2.g.a(j10) + "ms, key: " + fVar);
    }

    private d m(com.bumptech.glide.e eVar, Object obj, i2.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, i2.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.i iVar, Executor executor, n nVar, long j10) {
        l a10 = this.f36078a.a(nVar, z15);
        if (a10 != null) {
            a10.d(iVar, executor);
            if (f36077i) {
                k("Added to existing load", j10, nVar);
            }
            return new d(iVar, a10);
        }
        l a11 = this.f36081d.a(nVar, z12, z13, z14, z15);
        h a12 = this.f36084g.a(eVar, obj, nVar, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z15, hVar2, a11);
        this.f36078a.c(nVar, a11);
        a11.d(iVar, executor);
        a11.s(a12);
        if (f36077i) {
            k("Started new load", j10, nVar);
        }
        return new d(iVar, a11);
    }

    @Override // k2.p.a
    public void a(i2.f fVar, p pVar) {
        this.f36085h.d(fVar);
        if (pVar.d()) {
            this.f36080c.d(fVar, pVar);
        } else {
            this.f36082e.a(pVar, false);
        }
    }

    @Override // k2.m
    public synchronized void b(l lVar, i2.f fVar, p pVar) {
        if (pVar != null) {
            try {
                if (pVar.d()) {
                    this.f36085h.a(fVar, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f36078a.d(fVar, lVar);
    }

    @Override // k2.m
    public synchronized void c(l lVar, i2.f fVar) {
        this.f36078a.d(fVar, lVar);
    }

    @Override // m2.InterfaceC3646h.a
    public void d(v vVar) {
        this.f36082e.a(vVar, true);
    }

    public void e() {
        this.f36083f.a().clear();
    }

    public d g(com.bumptech.glide.e eVar, Object obj, i2.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, i2.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.i iVar, Executor executor) {
        long b10 = f36077i ? D2.g.b() : 0L;
        n a10 = this.f36079b.a(obj, fVar, i10, i11, map, cls, cls2, hVar2);
        synchronized (this) {
            try {
                p j10 = j(a10, z12, b10);
                if (j10 == null) {
                    return m(eVar, obj, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, hVar2, z12, z13, z14, z15, iVar, executor, a10, b10);
                }
                iVar.b(j10, EnumC3313a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(v vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).e();
    }

    k(InterfaceC3646h interfaceC3646h, InterfaceC3639a.InterfaceC0556a interfaceC0556a, ExecutorServiceC3704a executorServiceC3704a, ExecutorServiceC3704a executorServiceC3704a2, ExecutorServiceC3704a executorServiceC3704a3, ExecutorServiceC3704a executorServiceC3704a4, s sVar, o oVar, C3531a c3531a, b bVar, a aVar, y yVar, boolean z10) {
        this.f36080c = interfaceC3646h;
        c cVar = new c(interfaceC0556a);
        this.f36083f = cVar;
        C3531a c3531a2 = c3531a == null ? new C3531a(z10) : c3531a;
        this.f36085h = c3531a2;
        c3531a2.f(this);
        this.f36079b = oVar == null ? new o() : oVar;
        this.f36078a = sVar == null ? new s() : sVar;
        this.f36081d = bVar == null ? new b(executorServiceC3704a, executorServiceC3704a2, executorServiceC3704a3, executorServiceC3704a4, this, this) : bVar;
        this.f36084g = aVar == null ? new a(cVar) : aVar;
        this.f36082e = yVar == null ? new y() : yVar;
        interfaceC3646h.e(this);
    }
}
