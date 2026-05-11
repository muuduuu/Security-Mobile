package r3;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import f4.InterfaceC3146a;
import g4.InterfaceC3190e;
import y3.h;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4011a implements InterfaceC3146a {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f39207a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3146a f39208b;

    public C4011a(Resources resources, InterfaceC3146a interfaceC3146a) {
        this.f39207a = resources;
        this.f39208b = interfaceC3146a;
    }

    private static boolean c(g4.f fVar) {
        return (fVar.c2() == 1 || fVar.c2() == 0) ? false : true;
    }

    private static boolean d(g4.f fVar) {
        return (fVar.t0() == 0 || fVar.t0() == -1) ? false : true;
    }

    @Override // f4.InterfaceC3146a
    public Drawable a(InterfaceC3190e interfaceC3190e) {
        try {
            if (n4.b.d()) {
                n4.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (interfaceC3190e instanceof g4.f) {
                g4.f fVar = (g4.f) interfaceC3190e;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f39207a, fVar.p1());
                if (!d(fVar) && !c(fVar)) {
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                    return bitmapDrawable;
                }
                h hVar = new h(bitmapDrawable, fVar.t0(), fVar.c2());
                if (n4.b.d()) {
                    n4.b.b();
                }
                return hVar;
            }
            InterfaceC3146a interfaceC3146a = this.f39208b;
            if (interfaceC3146a == null || !interfaceC3146a.b(interfaceC3190e)) {
                if (!n4.b.d()) {
                    return null;
                }
                n4.b.b();
                return null;
            }
            Drawable a10 = this.f39208b.a(interfaceC3190e);
            if (n4.b.d()) {
                n4.b.b();
            }
            return a10;
        } catch (Throwable th) {
            if (n4.b.d()) {
                n4.b.b();
            }
            throw th;
        }
    }

    @Override // f4.InterfaceC3146a
    public boolean b(InterfaceC3190e interfaceC3190e) {
        return true;
    }
}
