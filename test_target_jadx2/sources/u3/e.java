package U3;

import V3.d;
import android.graphics.Bitmap;
import b3.l;
import e3.h;
import f3.AbstractC3142a;
import g4.C3188c;
import g4.InterfaceC3190e;
import g4.f;
import g4.i;
import g4.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: e, reason: collision with root package name */
    static c f10336e = g("com.facebook.animated.gif.GifImage");

    /* renamed from: f, reason: collision with root package name */
    static c f10337f = g("com.facebook.animated.webp.WebPImage");

    /* renamed from: a, reason: collision with root package name */
    private final V3.b f10338a;

    /* renamed from: b, reason: collision with root package name */
    private final Y3.d f10339b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10340c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10341d;

    public e(V3.b bVar, Y3.d dVar, boolean z10) {
        this(bVar, dVar, z10, true);
    }

    private AbstractC3142a c(int i10, int i11, Bitmap.Config config) {
        AbstractC3142a d10 = this.f10339b.d(i10, i11, config);
        ((Bitmap) d10.p()).eraseColor(0);
        ((Bitmap) d10.p()).setHasAlpha(true);
        return d10;
    }

    private AbstractC3142a d(T3.c cVar, Bitmap.Config config, int i10) {
        AbstractC3142a c10 = c(cVar.getWidth(), cVar.getHeight(), config);
        new V3.d(this.f10338a.a(T3.e.b(cVar), null), this.f10340c, new a()).h(i10, (Bitmap) c10.p());
        return c10;
    }

    private List e(T3.c cVar, Bitmap.Config config) {
        T3.a a10 = this.f10338a.a(T3.e.b(cVar), null);
        ArrayList arrayList = new ArrayList(a10.a());
        V3.d dVar = new V3.d(a10, this.f10340c, new b(arrayList));
        for (int i10 = 0; i10 < a10.a(); i10++) {
            AbstractC3142a c10 = c(a10.getWidth(), a10.getHeight(), config);
            dVar.h(i10, (Bitmap) c10.p());
            arrayList.add(c10);
        }
        return arrayList;
    }

    private InterfaceC3190e f(String str, a4.c cVar, T3.c cVar2, Bitmap.Config config) {
        List list;
        AbstractC3142a abstractC3142a;
        AbstractC3142a abstractC3142a2 = null;
        try {
            int a10 = cVar.f12577d ? cVar2.a() - 1 : 0;
            if (cVar.f12580g) {
                f U10 = f.U(d(cVar2, config, a10), m.f33552d, 0);
                AbstractC3142a.n(null);
                AbstractC3142a.o(null);
                return U10;
            }
            if (cVar.f12579f) {
                list = e(cVar2, config);
                try {
                    abstractC3142a = AbstractC3142a.i((AbstractC3142a) list.get(a10));
                } catch (Throwable th) {
                    th = th;
                    AbstractC3142a.n(abstractC3142a2);
                    AbstractC3142a.o(list);
                    throw th;
                }
            } else {
                list = null;
                abstractC3142a = null;
            }
            try {
                if (cVar.f12576c && abstractC3142a == null) {
                    abstractC3142a = d(cVar2, config, a10);
                }
                C3188c c3188c = new C3188c(T3.e.f(cVar2).k(abstractC3142a).j(a10).i(list).h(null).l(str).a(), this.f10341d);
                AbstractC3142a.n(abstractC3142a);
                AbstractC3142a.o(list);
                return c3188c;
            } catch (Throwable th2) {
                th = th2;
                abstractC3142a2 = abstractC3142a;
                AbstractC3142a.n(abstractC3142a2);
                AbstractC3142a.o(list);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            list = null;
        }
    }

    private static c g(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // U3.d
    public InterfaceC3190e a(i iVar, a4.c cVar, Bitmap.Config config) {
        if (f10337f == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        AbstractC3142a e10 = iVar.e();
        l.g(e10);
        try {
            h hVar = (h) e10.p();
            InterfaceC3190e f10 = f(iVar.q(), cVar, hVar.h() != null ? f10337f.d(hVar.h(), cVar) : f10337f.e(hVar.L(), hVar.size(), cVar), config);
            AbstractC3142a.n(e10);
            return f10;
        } catch (Throwable th) {
            AbstractC3142a.n(e10);
            throw th;
        }
    }

    @Override // U3.d
    public InterfaceC3190e b(i iVar, a4.c cVar, Bitmap.Config config) {
        if (f10336e == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        AbstractC3142a e10 = iVar.e();
        l.g(e10);
        try {
            h hVar = (h) e10.p();
            InterfaceC3190e f10 = f(iVar.q(), cVar, hVar.h() != null ? f10336e.d(hVar.h(), cVar) : f10336e.e(hVar.L(), hVar.size(), cVar), config);
            AbstractC3142a.n(e10);
            return f10;
        } catch (Throwable th) {
            AbstractC3142a.n(e10);
            throw th;
        }
    }

    public e(V3.b bVar, Y3.d dVar, boolean z10, boolean z11) {
        this.f10338a = bVar;
        this.f10339b = dVar;
        this.f10340c = z10;
        this.f10341d = z11;
    }

    class a implements d.b {
        a() {
        }

        @Override // V3.d.b
        public AbstractC3142a b(int i10) {
            return null;
        }

        @Override // V3.d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }

    class b implements d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f10343a;

        b(List list) {
            this.f10343a = list;
        }

        @Override // V3.d.b
        public AbstractC3142a b(int i10) {
            return AbstractC3142a.i((AbstractC3142a) this.f10343a.get(i10));
        }

        @Override // V3.d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }
}
