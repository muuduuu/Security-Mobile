package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class k extends com.bumptech.glide.request.a implements Cloneable {

    /* renamed from: h0, reason: collision with root package name */
    protected static final com.bumptech.glide.request.h f20263h0 = (com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) new com.bumptech.glide.request.h().k(k2.j.f36074c)).Z(h.LOW)).h0(true);

    /* renamed from: A, reason: collision with root package name */
    private final Context f20264A;

    /* renamed from: B, reason: collision with root package name */
    private final l f20265B;

    /* renamed from: C, reason: collision with root package name */
    private final Class f20266C;

    /* renamed from: D, reason: collision with root package name */
    private final c f20267D;

    /* renamed from: E, reason: collision with root package name */
    private final e f20268E;

    /* renamed from: F, reason: collision with root package name */
    private m f20269F;

    /* renamed from: G, reason: collision with root package name */
    private Object f20270G;

    /* renamed from: H, reason: collision with root package name */
    private List f20271H;

    /* renamed from: I, reason: collision with root package name */
    private k f20272I;

    /* renamed from: J, reason: collision with root package name */
    private k f20273J;

    /* renamed from: K, reason: collision with root package name */
    private Float f20274K;

    /* renamed from: X, reason: collision with root package name */
    private boolean f20275X = true;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f20276Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f20277Z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20278a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20279b;

        static {
            int[] iArr = new int[h.values().length];
            f20279b = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20279b[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20279b[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20279b[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f20278a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20278a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20278a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20278a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20278a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20278a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20278a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20278a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected k(c cVar, l lVar, Class cls, Context context) {
        this.f20267D = cVar;
        this.f20265B = lVar;
        this.f20266C = cls;
        this.f20264A = context;
        this.f20269F = lVar.t(cls);
        this.f20268E = cVar.j();
        u0(lVar.r());
        a(lVar.s());
    }

    private k D0(Object obj) {
        if (M()) {
            return clone().D0(obj);
        }
        this.f20270G = obj;
        this.f20276Y = true;
        return (k) d0();
    }

    private com.bumptech.glide.request.d E0(Object obj, A2.d dVar, com.bumptech.glide.request.g gVar, com.bumptech.glide.request.a aVar, com.bumptech.glide.request.e eVar, m mVar, h hVar, int i10, int i11, Executor executor) {
        Context context = this.f20264A;
        e eVar2 = this.f20268E;
        return com.bumptech.glide.request.j.t(context, eVar2, obj, this.f20270G, this.f20266C, aVar, i10, i11, hVar, dVar, gVar, this.f20271H, eVar, eVar2.e(), mVar.b(), executor);
    }

    private com.bumptech.glide.request.d p0(A2.d dVar, com.bumptech.glide.request.g gVar, com.bumptech.glide.request.a aVar, Executor executor) {
        return q0(new Object(), dVar, gVar, null, this.f20269F, aVar.C(), aVar.z(), aVar.y(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.request.d q0(Object obj, A2.d dVar, com.bumptech.glide.request.g gVar, com.bumptech.glide.request.e eVar, m mVar, h hVar, int i10, int i11, com.bumptech.glide.request.a aVar, Executor executor) {
        com.bumptech.glide.request.e eVar2;
        com.bumptech.glide.request.e eVar3;
        if (this.f20273J != null) {
            eVar3 = new com.bumptech.glide.request.b(obj, eVar);
            eVar2 = eVar3;
        } else {
            eVar2 = null;
            eVar3 = eVar;
        }
        com.bumptech.glide.request.d r02 = r0(obj, dVar, gVar, eVar3, mVar, hVar, i10, i11, aVar, executor);
        if (eVar2 == null) {
            return r02;
        }
        int z10 = this.f20273J.z();
        int y10 = this.f20273J.y();
        if (D2.l.u(i10, i11) && !this.f20273J.U()) {
            z10 = aVar.z();
            y10 = aVar.y();
        }
        k kVar = this.f20273J;
        com.bumptech.glide.request.b bVar = eVar2;
        bVar.e(r02, kVar.q0(obj, dVar, gVar, bVar, kVar.f20269F, kVar.C(), z10, y10, this.f20273J, executor));
        return bVar;
    }

    private com.bumptech.glide.request.d r0(Object obj, A2.d dVar, com.bumptech.glide.request.g gVar, com.bumptech.glide.request.e eVar, m mVar, h hVar, int i10, int i11, com.bumptech.glide.request.a aVar, Executor executor) {
        k kVar = this.f20272I;
        if (kVar == null) {
            if (this.f20274K == null) {
                return E0(obj, dVar, gVar, aVar, eVar, mVar, hVar, i10, i11, executor);
            }
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, eVar);
            thumbnailRequestCoordinator.setRequests(E0(obj, dVar, gVar, aVar, thumbnailRequestCoordinator, mVar, hVar, i10, i11, executor), E0(obj, dVar, gVar, aVar.clone().g0(this.f20274K.floatValue()), thumbnailRequestCoordinator, mVar, t0(hVar), i10, i11, executor));
            return thumbnailRequestCoordinator;
        }
        if (this.f20277Z) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        m mVar2 = kVar.f20275X ? mVar : kVar.f20269F;
        h C10 = kVar.P() ? this.f20272I.C() : t0(hVar);
        int z10 = this.f20272I.z();
        int y10 = this.f20272I.y();
        if (D2.l.u(i10, i11) && !this.f20272I.U()) {
            z10 = aVar.z();
            y10 = aVar.y();
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = new ThumbnailRequestCoordinator(obj, eVar);
        com.bumptech.glide.request.d E02 = E0(obj, dVar, gVar, aVar, thumbnailRequestCoordinator2, mVar, hVar, i10, i11, executor);
        this.f20277Z = true;
        k kVar2 = this.f20272I;
        com.bumptech.glide.request.d q02 = kVar2.q0(obj, dVar, gVar, thumbnailRequestCoordinator2, mVar2, C10, z10, y10, kVar2, executor);
        this.f20277Z = false;
        thumbnailRequestCoordinator2.setRequests(E02, q02);
        return thumbnailRequestCoordinator2;
    }

    private h t0(h hVar) {
        int i10 = a.f20279b[hVar.ordinal()];
        if (i10 == 1) {
            return h.NORMAL;
        }
        if (i10 == 2) {
            return h.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + C());
    }

    private void u0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n0((com.bumptech.glide.request.g) it.next());
        }
    }

    private A2.d w0(A2.d dVar, com.bumptech.glide.request.g gVar, com.bumptech.glide.request.a aVar, Executor executor) {
        D2.k.d(dVar);
        if (!this.f20276Y) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.request.d p02 = p0(dVar, gVar, aVar, executor);
        com.bumptech.glide.request.d l10 = dVar.l();
        if (p02.isEquivalentTo(l10) && !z0(aVar, l10)) {
            if (!((com.bumptech.glide.request.d) D2.k.d(l10)).isRunning()) {
                l10.begin();
            }
            return dVar;
        }
        this.f20265B.p(dVar);
        dVar.h(p02);
        this.f20265B.A(dVar, p02);
        return dVar;
    }

    private boolean z0(com.bumptech.glide.request.a aVar, com.bumptech.glide.request.d dVar) {
        return !aVar.O() && dVar.isComplete();
    }

    public k A0(com.bumptech.glide.request.g gVar) {
        if (M()) {
            return clone().A0(gVar);
        }
        this.f20271H = null;
        return n0(gVar);
    }

    public k B0(Object obj) {
        return D0(obj);
    }

    public k C0(String str) {
        return D0(str);
    }

    public com.bumptech.glide.request.c F0() {
        return G0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public com.bumptech.glide.request.c G0(int i10, int i11) {
        com.bumptech.glide.request.f fVar = new com.bumptech.glide.request.f(i10, i11);
        return (com.bumptech.glide.request.c) x0(fVar, fVar, D2.e.a());
    }

    public k H0(k kVar) {
        if (M()) {
            return clone().H0(kVar);
        }
        this.f20272I = kVar;
        return (k) d0();
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return super.equals(kVar) && Objects.equals(this.f20266C, kVar.f20266C) && this.f20269F.equals(kVar.f20269F) && Objects.equals(this.f20270G, kVar.f20270G) && Objects.equals(this.f20271H, kVar.f20271H) && Objects.equals(this.f20272I, kVar.f20272I) && Objects.equals(this.f20273J, kVar.f20273J) && Objects.equals(this.f20274K, kVar.f20274K) && this.f20275X == kVar.f20275X && this.f20276Y == kVar.f20276Y;
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return D2.l.q(this.f20276Y, D2.l.q(this.f20275X, D2.l.p(this.f20274K, D2.l.p(this.f20273J, D2.l.p(this.f20272I, D2.l.p(this.f20271H, D2.l.p(this.f20270G, D2.l.p(this.f20269F, D2.l.p(this.f20266C, super.hashCode())))))))));
    }

    public k n0(com.bumptech.glide.request.g gVar) {
        if (M()) {
            return clone().n0(gVar);
        }
        if (gVar != null) {
            if (this.f20271H == null) {
                this.f20271H = new ArrayList();
            }
            this.f20271H.add(gVar);
        }
        return (k) d0();
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public k a(com.bumptech.glide.request.a aVar) {
        D2.k.d(aVar);
        return (k) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public k clone() {
        k kVar = (k) super.clone();
        kVar.f20269F = kVar.f20269F.clone();
        if (kVar.f20271H != null) {
            kVar.f20271H = new ArrayList(kVar.f20271H);
        }
        k kVar2 = kVar.f20272I;
        if (kVar2 != null) {
            kVar.f20272I = kVar2.clone();
        }
        k kVar3 = kVar.f20273J;
        if (kVar3 != null) {
            kVar.f20273J = kVar3.clone();
        }
        return kVar;
    }

    public A2.d v0(A2.d dVar) {
        return x0(dVar, null, D2.e.b());
    }

    A2.d x0(A2.d dVar, com.bumptech.glide.request.g gVar, Executor executor) {
        return w0(dVar, gVar, this, executor);
    }
}
