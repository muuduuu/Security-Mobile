package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.G;
import f3.AbstractC3142a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import o4.C3749b;
import o4.C3752e;
import o4.InterfaceC3750c;
import o4.InterfaceC3751d;

/* loaded from: classes.dex */
public class k0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20943a;

    /* renamed from: b, reason: collision with root package name */
    private final e3.i f20944b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f20945c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20946d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3751d f20947e;

    private class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final boolean f20948c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3751d f20949d;

        /* renamed from: e, reason: collision with root package name */
        private final e0 f20950e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f20951f;

        /* renamed from: g, reason: collision with root package name */
        private final G f20952g;

        /* renamed from: com.facebook.imagepipeline.producers.k0$a$a, reason: collision with other inner class name */
        class C0370a implements G.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f20954a;

            C0370a(k0 k0Var) {
                this.f20954a = k0Var;
            }

            @Override // com.facebook.imagepipeline.producers.G.d
            public void a(g4.i iVar, int i10) {
                if (iVar == null) {
                    a.this.o().c(null, i10);
                } else {
                    a aVar = a.this;
                    aVar.v(iVar, i10, (InterfaceC3750c) b3.l.g(aVar.f20949d.createImageTranscoder(iVar.j(), a.this.f20948c)));
                }
            }
        }

        class b extends AbstractC1839f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f20956a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1847n f20957b;

            b(k0 k0Var, InterfaceC1847n interfaceC1847n) {
                this.f20956a = k0Var;
                this.f20957b = interfaceC1847n;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                a.this.f20952g.c();
                a.this.f20951f = true;
                this.f20957b.a();
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1839f, com.facebook.imagepipeline.producers.f0
            public void b() {
                if (a.this.f20950e.q()) {
                    a.this.f20952g.h();
                }
            }
        }

        a(InterfaceC1847n interfaceC1847n, e0 e0Var, boolean z10, InterfaceC3751d interfaceC3751d) {
            super(interfaceC1847n);
            this.f20951f = false;
            this.f20950e = e0Var;
            Boolean r10 = e0Var.c().r();
            this.f20948c = r10 != null ? r10.booleanValue() : z10;
            this.f20949d = interfaceC3751d;
            this.f20952g = new G(k0.this.f20943a, new C0370a(k0.this), 100);
            e0Var.d(new b(k0.this, interfaceC1847n));
        }

        private g4.i A(g4.i iVar) {
            return (this.f20950e.c().s().d() || iVar.t0() == 0 || iVar.t0() == -1) ? iVar : x(iVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(g4.i iVar, int i10, InterfaceC3750c interfaceC3750c) {
            this.f20950e.p().e(this.f20950e, "ResizeAndRotateProducer");
            m4.b c10 = this.f20950e.c();
            e3.k a10 = k0.this.f20944b.a();
            try {
                C3749b b10 = interfaceC3750c.b(iVar, a10, c10.s(), c10.q(), null, 85, iVar.g());
                if (b10.a() == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                Map y10 = y(iVar, c10.q(), b10, interfaceC3750c.a());
                AbstractC3142a y11 = AbstractC3142a.y(a10.a());
                try {
                    g4.i iVar2 = new g4.i(y11);
                    iVar2.Q(S3.b.f8722b);
                    try {
                        iVar2.z();
                        this.f20950e.p().j(this.f20950e, "ResizeAndRotateProducer", y10);
                        if (b10.a() != 1) {
                            i10 |= 16;
                        }
                        o().c(iVar2, i10);
                    } finally {
                        g4.i.c(iVar2);
                    }
                } finally {
                    AbstractC3142a.n(y11);
                }
            } catch (Exception e10) {
                this.f20950e.p().k(this.f20950e, "ResizeAndRotateProducer", e10, null);
                if (AbstractC1836c.d(i10)) {
                    o().onFailure(e10);
                }
            } finally {
                a10.close();
            }
        }

        private void w(g4.i iVar, int i10, S3.c cVar) {
            o().c((cVar == S3.b.f8722b || cVar == S3.b.f8732l) ? A(iVar) : z(iVar), i10);
        }

        private g4.i x(g4.i iVar, int i10) {
            g4.i b10 = g4.i.b(iVar);
            if (b10 != null) {
                b10.i0(i10);
            }
            return b10;
        }

        private Map y(g4.i iVar, a4.f fVar, C3749b c3749b, String str) {
            String str2;
            if (!this.f20950e.p().g(this.f20950e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = iVar.getWidth() + "x" + iVar.getHeight();
            if (fVar != null) {
                str2 = fVar.f12599a + "x" + fVar.f12600b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(iVar.j()));
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f20952g.f()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(c3749b));
            return b3.g.a(hashMap);
        }

        private g4.i z(g4.i iVar) {
            a4.g s10 = this.f20950e.c().s();
            return (s10.h() || !s10.g()) ? iVar : x(iVar, s10.f());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            if (this.f20951f) {
                return;
            }
            boolean d10 = AbstractC1836c.d(i10);
            if (iVar == null) {
                if (d10) {
                    o().c(null, 1);
                    return;
                }
                return;
            }
            S3.c j10 = iVar.j();
            j3.e h10 = k0.h(this.f20950e.c(), iVar, (InterfaceC3750c) b3.l.g(this.f20949d.createImageTranscoder(j10, this.f20948c)));
            if (d10 || h10 != j3.e.UNSET) {
                if (h10 != j3.e.YES) {
                    w(iVar, i10, j10);
                } else if (this.f20952g.k(iVar, i10)) {
                    if (d10 || this.f20950e.q()) {
                        this.f20952g.h();
                    }
                }
            }
        }
    }

    public k0(Executor executor, e3.i iVar, d0 d0Var, boolean z10, InterfaceC3751d interfaceC3751d) {
        this.f20943a = (Executor) b3.l.g(executor);
        this.f20944b = (e3.i) b3.l.g(iVar);
        this.f20945c = (d0) b3.l.g(d0Var);
        this.f20947e = (InterfaceC3751d) b3.l.g(interfaceC3751d);
        this.f20946d = z10;
    }

    private static boolean f(a4.g gVar, g4.i iVar) {
        return !gVar.d() && (C3752e.e(gVar, iVar) != 0 || g(gVar, iVar));
    }

    private static boolean g(a4.g gVar, g4.i iVar) {
        if (gVar.g() && !gVar.d()) {
            return C3752e.f37924b.contains(Integer.valueOf(iVar.c2()));
        }
        iVar.K(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j3.e h(m4.b bVar, g4.i iVar, InterfaceC3750c interfaceC3750c) {
        if (iVar == null || iVar.j() == S3.c.f8736d) {
            return j3.e.UNSET;
        }
        if (interfaceC3750c.d(iVar.j())) {
            return j3.e.valueOf(f(bVar.s(), iVar) || interfaceC3750c.c(iVar, bVar.s(), bVar.q()));
        }
        return j3.e.NO;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        this.f20945c.a(new a(interfaceC1847n, e0Var, this.f20946d, this.f20947e), e0Var);
    }
}
