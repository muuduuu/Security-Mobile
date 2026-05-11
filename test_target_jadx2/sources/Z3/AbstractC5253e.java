package z3;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import c3.AbstractC1721a;
import y3.InterfaceC5169c;
import y3.g;
import y3.i;
import y3.j;
import y3.k;
import y3.l;
import y3.n;
import y3.o;
import y3.p;
import z3.C5252d;

/* renamed from: z3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5253e {

    /* renamed from: a, reason: collision with root package name */
    private static final Drawable f45734a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, C5252d c5252d, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            j jVar = new j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), c5252d.i());
            b(jVar, c5252d);
            return jVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, c5252d);
            return nVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            AbstractC1721a.L("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        k a10 = k.a((ColorDrawable) drawable);
        b(a10, c5252d);
        return a10;
    }

    static void b(i iVar, C5252d c5252d) {
        iVar.e(c5252d.j());
        iVar.t(c5252d.d());
        iVar.b(c5252d.b(), c5252d.c());
        iVar.n(c5252d.g());
        iVar.j(c5252d.l());
        iVar.h(c5252d.h());
        iVar.c(c5252d.i());
    }

    static InterfaceC5169c c(InterfaceC5169c interfaceC5169c) {
        while (true) {
            Object s10 = interfaceC5169c.s();
            if (s10 == interfaceC5169c || !(s10 instanceof InterfaceC5169c)) {
                break;
            }
            interfaceC5169c = (InterfaceC5169c) s10;
        }
        return interfaceC5169c;
    }

    static Drawable d(Drawable drawable, C5252d c5252d, Resources resources) {
        try {
            if (n4.b.d()) {
                n4.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && c5252d != null && c5252d.k() == C5252d.a.BITMAP_ONLY) {
                if (!(drawable instanceof g)) {
                    Drawable a10 = a(drawable, c5252d, resources);
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                    return a10;
                }
                InterfaceC5169c c10 = c((g) drawable);
                c10.l(a(c10.l(f45734a), c5252d, resources));
                if (n4.b.d()) {
                    n4.b.b();
                }
                return drawable;
            }
            return drawable;
        } finally {
            if (n4.b.d()) {
                n4.b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, C5252d c5252d) {
        try {
            if (n4.b.d()) {
                n4.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && c5252d != null && c5252d.k() == C5252d.a.OVERLAY_COLOR) {
                l lVar = new l(drawable);
                b(lVar, c5252d);
                lVar.y(c5252d.f());
                if (n4.b.d()) {
                    n4.b.b();
                }
                return lVar;
            }
            return drawable;
        } finally {
            if (n4.b.d()) {
                n4.b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, p.b bVar) {
        return g(drawable, bVar, null);
    }

    static Drawable g(Drawable drawable, p.b bVar, PointF pointF) {
        if (n4.b.d()) {
            n4.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (n4.b.d()) {
                n4.b.b();
            }
            return drawable;
        }
        o oVar = new o(drawable, bVar);
        if (pointF != null) {
            oVar.B(pointF);
        }
        if (n4.b.d()) {
            n4.b.b();
        }
        return oVar;
    }

    static void h(i iVar) {
        iVar.e(false);
        iVar.q(0.0f);
        iVar.b(0, 0.0f);
        iVar.n(0.0f);
        iVar.j(false);
        iVar.h(false);
        iVar.c(j.i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void i(InterfaceC5169c interfaceC5169c, C5252d c5252d, Resources resources) {
        InterfaceC5169c c10 = c(interfaceC5169c);
        Drawable s10 = c10.s();
        if (c5252d == null || c5252d.k() != C5252d.a.BITMAP_ONLY) {
            if (s10 instanceof i) {
                h((i) s10);
            }
        } else if (s10 instanceof i) {
            b((i) s10, c5252d);
        } else if (s10 != 0) {
            c10.l(f45734a);
            c10.l(a(s10, c5252d, resources));
        }
    }

    static void j(InterfaceC5169c interfaceC5169c, C5252d c5252d) {
        Drawable s10 = interfaceC5169c.s();
        if (c5252d == null || c5252d.k() != C5252d.a.OVERLAY_COLOR) {
            if (s10 instanceof l) {
                Drawable drawable = f45734a;
                interfaceC5169c.l(((l) s10).v(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(s10 instanceof l)) {
            interfaceC5169c.l(e(interfaceC5169c.l(f45734a), c5252d));
            return;
        }
        l lVar = (l) s10;
        b(lVar, c5252d);
        lVar.y(c5252d.f());
    }

    static o k(InterfaceC5169c interfaceC5169c, p.b bVar) {
        Drawable f10 = f(interfaceC5169c.l(f45734a), bVar);
        interfaceC5169c.l(f10);
        b3.l.h(f10, "Parent has no child drawable!");
        return (o) f10;
    }
}
