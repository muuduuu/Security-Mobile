package e4;

import android.graphics.ColorSpace;
import b3.l;
import b3.o;
import b3.p;
import f3.AbstractC3142a;
import g4.InterfaceC3190e;
import g4.i;
import g4.m;
import g4.n;
import java.io.InputStream;
import java.util.Map;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3078b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c f32197a;

    /* renamed from: b, reason: collision with root package name */
    private final c f32198b;

    /* renamed from: c, reason: collision with root package name */
    private final k4.d f32199c;

    /* renamed from: d, reason: collision with root package name */
    private final o f32200d;

    /* renamed from: e, reason: collision with root package name */
    private final c f32201e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f32202f;

    /* renamed from: e4.b$a */
    class a implements c {
        a() {
        }

        @Override // e4.c
        public InterfaceC3190e a(i iVar, int i10, n nVar, a4.c cVar) {
            ColorSpace colorSpace;
            S3.c j10 = iVar.j();
            if (((Boolean) C3078b.this.f32200d.get()).booleanValue()) {
                colorSpace = cVar.f12584k;
                if (colorSpace == null) {
                    colorSpace = iVar.g();
                }
            } else {
                colorSpace = cVar.f12584k;
            }
            ColorSpace colorSpace2 = colorSpace;
            if (j10 == S3.b.f8722b) {
                return C3078b.this.e(iVar, i10, nVar, cVar, colorSpace2);
            }
            if (j10 == S3.b.f8724d) {
                return C3078b.this.d(iVar, i10, nVar, cVar);
            }
            if (j10 == S3.b.f8731k) {
                return C3078b.this.c(iVar, i10, nVar, cVar);
            }
            if (j10 != S3.c.f8736d) {
                return C3078b.this.f(iVar, cVar);
            }
            throw new C3077a("unknown image format", iVar);
        }
    }

    public C3078b(c cVar, c cVar2, k4.d dVar) {
        this(cVar, cVar2, dVar, null);
    }

    @Override // e4.c
    public InterfaceC3190e a(i iVar, int i10, n nVar, a4.c cVar) {
        InputStream l10;
        c cVar2;
        c cVar3 = cVar.f12583j;
        if (cVar3 != null) {
            return cVar3.a(iVar, i10, nVar, cVar);
        }
        S3.c j10 = iVar.j();
        if ((j10 == null || j10 == S3.c.f8736d) && (l10 = iVar.l()) != null) {
            j10 = S3.d.c(l10);
            iVar.Q(j10);
        }
        Map map = this.f32202f;
        return (map == null || (cVar2 = (c) map.get(j10)) == null) ? this.f32201e.a(iVar, i10, nVar, cVar) : cVar2.a(iVar, i10, nVar, cVar);
    }

    public InterfaceC3190e c(i iVar, int i10, n nVar, a4.c cVar) {
        c cVar2;
        return (cVar.f12580g || (cVar2 = this.f32198b) == null) ? f(iVar, cVar) : cVar2.a(iVar, i10, nVar, cVar);
    }

    public InterfaceC3190e d(i iVar, int i10, n nVar, a4.c cVar) {
        c cVar2;
        if (iVar.getWidth() == -1 || iVar.getHeight() == -1) {
            throw new C3077a("image width or height is incorrect", iVar);
        }
        return (cVar.f12580g || (cVar2 = this.f32197a) == null) ? f(iVar, cVar) : cVar2.a(iVar, i10, nVar, cVar);
    }

    public g4.f e(i iVar, int i10, n nVar, a4.c cVar, ColorSpace colorSpace) {
        AbstractC3142a a10 = this.f32199c.a(iVar, cVar.f12581h, null, i10, colorSpace);
        try {
            p4.b.a(null, a10);
            l.g(a10);
            g4.f P12 = g4.f.P1(a10, nVar, iVar.t0(), iVar.c2());
            P12.n("is_rounded", false);
            return P12;
        } finally {
            AbstractC3142a.n(a10);
        }
    }

    public g4.f f(i iVar, a4.c cVar) {
        AbstractC3142a b10 = this.f32199c.b(iVar, cVar.f12581h, null, cVar.f12584k);
        try {
            p4.b.a(null, b10);
            l.g(b10);
            g4.f P12 = g4.f.P1(b10, m.f33552d, iVar.t0(), iVar.c2());
            P12.n("is_rounded", false);
            return P12;
        } finally {
            AbstractC3142a.n(b10);
        }
    }

    public C3078b(c cVar, c cVar2, k4.d dVar, Map map) {
        this.f32201e = new a();
        this.f32197a = cVar;
        this.f32198b = cVar2;
        this.f32199c = dVar;
        this.f32202f = map;
        this.f32200d = p.f18551b;
    }
}
